package by.epam.courses.module6.task1.users.user.userList;

import by.epam.courses.module6.task1.users.user.User;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserList {
    private static UserList userList;

    private ArrayList<User> users;

    private UserList() {
        users = new ArrayList<>();
    }

    public static UserList getInstance() {
        if (userList == null) {
            userList = new UserList();
            userList.getUsersFromFile();
        }
        return userList;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    private void getUsersFromFile(){
        String sep = File.separator;
        String usersPath = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module6" + sep +
                "task1" + sep + "files" + sep + "Users.txt";
        try (FileReader fr = new FileReader(usersPath);
             Scanner sc = new Scanner(fr)) {
            Pattern pattern = Pattern.compile("^(\\w+)\\s(\\w+)");
            while (sc.hasNextLine()) {
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()) {
                    users.add(User.getInstance(matcher.group(1), matcher.group(2)));
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
