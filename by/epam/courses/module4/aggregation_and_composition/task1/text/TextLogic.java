package by.epam.courses.module4.aggregation_and_composition.task1.text;

import by.epam.courses.module4.aggregation_and_composition.task1.sentence.Sentence;

public class TextLogic {
    public static TextLogic textLogic;

    private TextLogic() {
    }

    public static TextLogic getInstance() {
        if (textLogic == null) {
            textLogic = new TextLogic();
        }
        return textLogic;
    }

    public void addText(Text text, Sentence sentence) {
        text.getText().add(sentence);
    }

    public void addText(Text text, Sentence... sentences) {
        for (Sentence sentence : sentences) {
            text.getText().add(sentence);
        }
    }

    public void printText(Text text) {
        for (Sentence sentence : text.getText()) {
            System.out.println(sentence.getSentence());
        }
    }

    public void printTitle(Text text) {
        System.out.println(text.getTitle().getWord());
    }
}
