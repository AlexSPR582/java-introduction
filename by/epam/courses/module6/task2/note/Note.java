package by.epam.courses.module6.task2.note;

import java.time.LocalDate;
import java.util.Objects;

public class Note {
    private String topic;
    private String email;
    private LocalDate date;
    private String message;

    public Note(String topic, String email, String date, String message) {
        this.topic = topic;
        this.email = email;
        this.date = LocalDate.parse(date);
        this.message = message;
    }

    public String getTopic() {
        return topic;
    }

    public String getEmail() {
        return email;
    }

    public String getMessage() {
        return message;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDate(String date) {
        this.date = LocalDate.parse(date);
    }

    @Override
    public String toString() {
        return "Note{" +
                "topic='" + topic + '\'' +
                ", email='" + email + '\'' +
                ", date=" + date +
                ", message='" + message + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(topic, note.topic) &&
                Objects.equals(email, note.email) &&
                Objects.equals(date, note.date) &&
                Objects.equals(message, note.message);
    }

    @Override
    public int hashCode() {
        return Objects.hash(topic, email, date, message);
    }
}
