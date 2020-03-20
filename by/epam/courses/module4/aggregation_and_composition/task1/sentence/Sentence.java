package by.epam.courses.module4.aggregation_and_composition.task1.sentence;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Sentence {
    private String sentence;

    public Sentence(String sentence){
        this.sentence = sentence;
        if (validation(sentence)) {
            this.sentence  = sentence;
        }
    }

    public String getSentence() {
        return sentence;
    }

    public void setSentence(String sentence) {
        if (validation(sentence)) {
            this.sentence = sentence;
        }
    }

    public boolean validation(String sentence) {
        Pattern pattern = Pattern.compile("^[A-ZА-Я]+.*[!?.]{1}$");
        Matcher matcher = pattern.matcher(sentence);
        if (matcher.find()) {
            return true;
        }
        throw new IncorrectSentenceException();
    }
}
