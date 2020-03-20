package by.epam.courses.module4.aggregation_and_composition.task1.text;

import by.epam.courses.module4.aggregation_and_composition.task1.sentence.Sentence;
import by.epam.courses.module4.aggregation_and_composition.task1.word.Word;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Text {
    private List<Sentence> text;
    private Word title;

    public Text(String title, ArrayList<Sentence> sentences){
        this.title = new Word(title);
        this.text = sentences;
    }

    public Text(String title, Sentence... sentences) {
        this.title = new Word(title);
        this.text =  Arrays.asList(sentences);
    }

    public Text(Word title, ArrayList<Sentence> sentences) {
        this.title = title;
        this.text = sentences;
    }

    public Text(Word title, Sentence... sentences) {
        this.title = title;
        setText(sentences);
    }

    public List<Sentence> getText() {
        return text;
    }

    public void setText(ArrayList<Sentence> sentences) {
        this.text = sentences;
    }

    public void setText(Sentence... sentences) {
        this.text = new ArrayList<>();
        this.text.addAll(Arrays.asList(sentences));
    }

    public Word getTitle() {
        return title;
    }

    public void setTitle(Word title) {
        this.title = title;
    }

    public void setTitle(String title) {
        this.title = new Word(title);
    }

    @Override
    public String toString() {
        return "Text{" +
                "text=" + text +
                ", title=" + title +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Text text1 = (Text) o;
        return Objects.equals(text, text1.text) &&
                Objects.equals(title, text1.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(text, title);
    }
}
