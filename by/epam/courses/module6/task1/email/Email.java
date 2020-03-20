package by.epam.courses.module6.task1.email;

import by.epam.courses.module6.task1.email.message.Message;

import java.util.ArrayList;
import java.util.Objects;

public class Email {
    private ArrayList<Message> mailBox;

    public Email(){
        mailBox = new ArrayList<>();
    }

    public ArrayList<Message> getMailBox(){
        return mailBox;
    }

    @Override
    public String toString() {
        return "Email{" +
                "mailBox=" + mailBox +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Email email = (Email) o;
        return Objects.equals(mailBox, email.mailBox);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mailBox);
    }
}
