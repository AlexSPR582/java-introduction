package by.epam.courses.module6.task2.notebook;

import by.epam.courses.module6.task2.note.Note;
import by.epam.courses.module6.task2.note.NoteLogic;

import java.io.*;
import java.util.Comparator;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class NotebookLogic {
    private Notebook notebook;

    public NotebookLogic(Notebook notebook) {
        this.notebook = notebook;
    }

    public void findNotesByTopic(String topic) {
        NoteLogic noteLogic = new NoteLogic();
        sortNotes();
        for (Note note: notebook.getNotes()) {
            Pattern pattern = Pattern.compile(topic);
            Matcher matcher = pattern.matcher(note.getTopic());
            if (matcher.find()) {
                noteLogic.printNote(note);
            }
        }
    }

    public void findNotesByDate(String date) {
        NoteLogic noteLogic = new NoteLogic();
        sortNotes();
        for (Note note: notebook.getNotes()) {
            Pattern pattern = Pattern.compile(date);
            Matcher matcher = pattern.matcher(note.getDate().toString());
            if (matcher.find()) {
                noteLogic.printNote(note);
            }
        }
    }

    public void findNotesByEmail(String email) {
        NoteLogic noteLogic = new NoteLogic();
        sortNotes();
        for (Note note: notebook.getNotes()) {
            Pattern pattern = Pattern.compile(email);
            Matcher matcher = pattern.matcher(note.getEmail());
            if (matcher.find()) {
                noteLogic.printNote(note);
            }
        }
    }

    public void findNotesByWordInMessage(String word) {
        NoteLogic noteLogic = new NoteLogic();
        sortNotes();
        for (Note note: notebook.getNotes()){
            Pattern pattern = Pattern.compile(word);
            Matcher matcher = pattern.matcher(note.getMessage());
            if (matcher.find()) {
                noteLogic.printNote(note);
            }
        }
    }

    public void addNote(Note note) {
        Pattern patternTopic = Pattern.compile("[\\w\\-]+(\\s+[\\w\\-]+)*");
        Matcher matcherTopic = patternTopic.matcher(note.getTopic());

        Pattern patternEmail = Pattern.compile("\\w+@\\w+\\.[a-z]{2,3}");
        Matcher matcherEmail = patternEmail.matcher(note.getEmail());

        if (matcherTopic.find() && matcherEmail.find()){
            notebook.getNotes().add(note);
        }
        else {
            System.out.println("Введённые данные не прошли проверку валидации");
        }
    }

    public void sortNotes() {
        notebook.getNotes().sort(new Comparator<Note>() {
            @Override
            public int compare(Note note1, Note note2) {
                if (note1.getDate().isBefore(note2.getDate())) {
                    return 1;
                }
                else if (note1.getDate().isAfter(note2.getDate())) {
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });
    }

    public void writeNotesToFile(){
        try (FileWriter fw = new FileWriter(notebook.getPath());
             PrintWriter pw = new PrintWriter(fw)) {
            for (Note note: notebook.getNotes()){
                pw.println("topic: " + note.getTopic());
                pw.println("email: " + note.getEmail());
                pw.println("date: " + note.getDate());
                pw.println("message: " + note.getMessage() + '\n');
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void addNotesFromFileToNotebook() {
        Pattern pattern = Pattern.compile("topic:\\s(.+)\\nemail:\\s(.+)\\ndate:\\s(.+)\\nmessage:\\s(.+)");
        Matcher matcher = pattern.matcher(readNotesFromFile());
        while (matcher.find()){
            String topic = matcher.group(1);
            String email = matcher.group(2);
            String date = matcher.group(3);
            String message = matcher.group(4);
            addNote(new Note(topic, email, date, message));
        }
    }

    private StringBuilder readNotesFromFile()  {
        StringBuilder sb = new StringBuilder();
        try (FileReader fr = new FileReader(notebook.getPath());
             Scanner sc = new Scanner(fr)) {
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine() + '\n');
            }
        } catch (IOException e){
            e.printStackTrace();
        }
        return sb;
    }
}
