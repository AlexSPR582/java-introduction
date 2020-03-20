package by.epam.courses.module5.task1.directory;

import java.util.Objects;

public class Directory {
    private String name;
    private String path;

    public Directory(String path, String name) {
        this.path = path;
        this.name = name;
    }

    public String getPath() {
        return path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        else if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        Directory directory = (Directory) obj;
        return directory.getName().equals(this.name)
                && directory.getPath().equals(this.path);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(name) +
                Objects.hashCode(path);
    }

    @Override
    public String toString() {
        return "Directory{" +
                "name='" + name + '\'' +
                ", path='" + path + '\'' +
                '}';
    }
}
