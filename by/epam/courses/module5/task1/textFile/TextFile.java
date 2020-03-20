package by.epam.courses.module5.task1.textFile;

import by.epam.courses.module5.task1.directory.Directory;
import by.epam.courses.module5.task1.file.File;

import java.util.Objects;

public class TextFile extends File {
    private String text = "";

    private TextFile(String name, Directory directory) {
        super(name, directory);
    }

    private TextFile(String name, Directory directory, String text) {
        super(name, directory);
        this.text = text;
    }

    public static TextFile create(String name, Directory directory) {
        return new TextFile(name, directory);
    }

    public static TextFile create(String name, Directory directory, String text) {
        return new TextFile(name, directory, text);
    }

    public void printText() {
        if (isExist()) {
            System.out.println(text);
        }
    }

    public void addText(String text) {
        if (isExist()) {
            this.text = this.text + text;
        }
    }

    public String getText() {
        if (isExist()) {
            return text;
        }
        return null;
    }

    public void setText(String text) {
        if (isExist()) {
            this.text = text;
        }
    }

    @Override
    public int hashCode() {
        return Objects.hash(text) +
                Objects.hashCode(getName()) +
                Objects.hashCode(isExist()) +
                Objects.hashCode(getDirectory());
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        else if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        TextFile textFile = (TextFile) obj;
        return textFile.text.equals(this.text)
                && textFile.getName().equals(this.getName())
                && textFile.isExist() == this.isExist()
                && textFile.getDirectory() == this.getDirectory();
    }

    @Override
    public String toString() {
        return "TextFile{" +
                "text='" + text + '\'' +
                '}';
    }
}
