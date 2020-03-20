package by.epam.courses.module6.task1.users.user;

import by.epam.courses.module6.task1.email.Email;

import java.util.Objects;

public class User {
    private Email email;
    private String password;
    private String id;
    private boolean singIn = false;

    private User(String id, String password) {
        this.email = new Email();
        this.id = id;
        this.password = password;
    }

    public static User getInstance(String id, String password) {
        UserLogic ul = new UserLogic();
        User user = ul.findUser(id, password);
        if (user == null) {
            return new User(id, password);
        }
        else {
            return user;
        }
    }

    String getPassword() {
        return password;
    }

    String getId(){
        return id;
    }

    boolean isSingIn() {
        return singIn;
    }

    void setSingIn() {
        this.singIn = true;
    }

    public Email getEmail(){
        return email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return singIn == user.singIn &&
                Objects.equals(email, user.email) &&
                Objects.equals(password, user.password) &&
                Objects.equals(id, user.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(email, password, id, singIn);
    }

    @Override
    public String toString() {
        return "User{" +
                "email=" + email +
                ", password='" + password + '\'' +
                ", id='" + id + '\'' +
                ", singIn=" + singIn +
                '}';
    }
}
