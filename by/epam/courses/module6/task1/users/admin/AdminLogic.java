package by.epam.courses.module6.task1.users.admin;

import by.epam.courses.module6.task1.book.Book;
import by.epam.courses.module6.task1.book.BookLogic;
import by.epam.courses.module6.task1.email.EmailLogic;
import by.epam.courses.module6.task1.email.message.Message;
import by.epam.courses.module6.task1.email.message.MessageLogic;
import by.epam.courses.module6.task1.library.Library;
import by.epam.courses.module6.task1.users.user.User;
import by.epam.courses.module6.task1.users.user.userList.UserList;

import java.io.*;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminLogic {
    public void checkEmail(){
        for (Message message: Admin.getAdmin().getEmail().getMailBox()) {
            if (message.getBook() != null) {
                Scanner sc = new Scanner(System.in);
                BookLogic bl = new BookLogic();
                System.out.println("Если хотите добавить книгу"
                        + bl.getBookDescription(message.getBook())
                        + " в библиотеку нажмите 1, если нет - любую другую цифру");
                if (sc.nextInt() == 1) {
                    addBook(message.getBook(), true, true);
                }
            }
            else {
                MessageLogic ml = new MessageLogic();
                ml.printMessage(message);
            }
        }
    }

    public void addBook(Book book, boolean isPaper, boolean isDigital){
        if (isPaper && isDigital){
            Library.getLibrary().getDigitalBooks().add(book);
            Library.getLibrary().getPaperBooks().add(book);
        }
        else if (isDigital){
            Library.getLibrary().getDigitalBooks().add(book);
        }
        else if (isPaper){
            Library.getLibrary().getPaperBooks().add(book);
        }
        if (!isBookAlreadyExist(book)) {
            modifyCatalog(book);
            sendNotificationToAllUsers(book);
        }
    }

    private void modifyCatalog(Book book){
        String sep = File.separator;
        String catalogPath = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module6" + sep +
                "task1" + sep + "files" + sep + "Catalog.txt";
        try (FileWriter fw = new FileWriter(catalogPath, true)) {
            fw.append(book.getName() + ", " + book.getAuthor()
                    + ", " + book.getPublishYear() + '\n');
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    private void sendNotificationToAllUsers(Book book){
        BookLogic bl = new BookLogic();
        String notification = "В каталоге появилась новая книга: " + bl.getBookDescription(book);
        EmailLogic el = new EmailLogic();
        for (User user: UserList.getInstance().getUsers()){
            el.sendEmail(user.getEmail(), new Message(notification));
        }
    }

    private boolean isBookAlreadyExist(Book book){
        String sep = File.separator;
        String catalogPath = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module6" + sep +
                "task1" + sep + "files" + sep + "Catalog.txt";
        try (FileReader fr = new FileReader(catalogPath);
             Scanner sc = new Scanner(fr)) {
            Pattern pattern = Pattern.compile(book.getName() + ", "
                    + book.getAuthor() + ", " + book.getPublishYear());
            while (sc.hasNextLine()) {
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
