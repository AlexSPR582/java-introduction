package by.epam.courses.module6.task2.note;

public class NoteLogic {
    public void printNote(Note note) {
        System.out.println("topic: " + note.getTopic());
        System.out.println("date: " + note.getDate());
        System.out.println("email: " + note.getEmail());
        System.out.println("message: " + note.getMessage() + '\n');
    }
}
