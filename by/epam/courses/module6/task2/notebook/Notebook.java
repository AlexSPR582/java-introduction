package by.epam.courses.module6.task2.notebook;

import by.epam.courses.module6.task2.note.Note;

import java.io.File;
import java.util.ArrayList;

public class Notebook {
    private ArrayList<Note> notes = new ArrayList<>();

    public Notebook() {
        NotebookLogic logic = new NotebookLogic(this);
        logic.addNotesFromFileToNotebook();
    }

    public ArrayList<Note> getNotes(){
        return notes;
    }

    public void setNotes(ArrayList<Note> notes) {
        this.notes = notes;
    }

    public String getPath() {
        String separator = File.separator;
        return  "src" + separator + "by" + separator + "epam" + separator
                + "courses" + separator + "module6" + separator
                + "task2" + separator + "file" + separator + "notes.txt";
    }
}
