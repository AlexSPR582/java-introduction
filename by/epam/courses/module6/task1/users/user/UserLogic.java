package by.epam.courses.module6.task1.users.user;

import by.epam.courses.module6.task1.book.Book;
import by.epam.courses.module6.task1.email.EmailLogic;
import by.epam.courses.module6.task1.email.message.Message;
import by.epam.courses.module6.task1.users.user.userException.UserNotFoundException;
import by.epam.courses.module6.task1.users.user.userList.UserList;
import by.epam.courses.module6.task1.users.admin.Admin;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogic{
    public void checkEmail(User user) {
        EmailLogic el = new EmailLogic();
        el.printAllMessages(user.getEmail());
    }

    public User findUser(String id, String password) {
        for (User user: UserList.getInstance().getUsers()) {
            if (id.equals(user.getId())
                    && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }

    public void findBook(User user, String information){
        String sep = File.separator;
        String catalogPath = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module6" + sep +
                "task1" + sep + "files" + sep + "Catalog.txt";
        if (user.isSingIn()){
            try (FileReader fr = new FileReader(catalogPath);
                 Scanner sc = new Scanner(fr)) {
                Pattern pattern = Pattern.compile(information);
                while (sc.hasNextLine()){
                    String str = sc.nextLine();
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.find()){
                        System.out.println(str);
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Пользователь не вошёл в систему");
        }
    }

    public void viewAllBooks(User user){
        String sep = File.separator;
        String catalogPath = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module6" + sep +
                "task1" + sep + "files" + sep + "Catalog.txt";
        if (user.isSingIn()){

            try (FileReader fr = new FileReader(catalogPath);
                 Scanner sc = new Scanner(fr)) {
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Пользователь не вошёл в систему");
        }
    }

    public void sendRecommendation(User user, Book book){
        if (user.isSingIn()){
            EmailLogic el = new EmailLogic();
            el.sendEmail(Admin.getAdmin().getEmail(), new Message(book));
        }
        else {
            System.out.println("Пользователь не вошёл в систему");
        }
    }

    public void singIn(User user){
        if (!user.isSingIn() && isUserAlreadyExist(user)){
            user.setSingIn();
            System.out.println("Пользователь " + user.getId() + " зашёл в систему");
        }
        else if (user.isSingIn() && isUserAlreadyExist(user)){
            System.out.println("Пользователь уже вошёл в систему");
        }
        else {
            throw new UserNotFoundException("Пользователь не найден в системе");
        }
    }

    public void addUser(User user){
        String sep = File.separator;
        String usersPath = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module6" + sep +
                "task1" + sep + "files" + sep + "Users.txt";
        if (!isUserAlreadyExist(user)){
            try (FileWriter fw = new FileWriter(usersPath, true)){
                UserList.getInstance().getUsers().add(user);
                fw.append(user.getId() + " " + user.getPassword() + '\n');
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else {
            System.out.println("Пользователь " + user.getId() +
                    " уже зарегестрирован в системе");
        }
    }

    public boolean isUserAlreadyExist(User user){
        String sep = File.separator;
        String usersPath = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module6" + sep +
                "task1" + sep + "files" + sep + "Users.txt";
        try (FileReader fr = new FileReader(usersPath);
             Scanner sc = new Scanner(fr)){
            Pattern pattern = Pattern.compile("^" + user.getId()
                    + " " + user.getPassword() + "$");
            while (sc.hasNextLine()){
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()){
                    return true;
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return false;
    }
}
