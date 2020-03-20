package by.epam.courses.module5.task1.file;

import by.epam.courses.module5.task1.directory.Directory;

public abstract class File {
    private boolean exist;
    private String name;
    private Directory directory;

    public File(String name, Directory directory) {
        this.name = name;
        this.directory = directory;
        this.exist = true;
    }

    public void delete() {
        exist = false;
    }

    public void rename(String name) {
        if (isExist()) {
            this.name = name;
        }
    }

    public boolean isExist() {
        return exist;
    }

    public String getName() {
        if (isExist()) {
            return name;
        }
        return null;
    }

    public Directory getDirectory() {
        if (isExist()) {
            return directory;
        }
        return null;
    }

    public void setDirectory(Directory directory) {
        if (isExist()) {
            this.directory = directory;
        }
    }
}
