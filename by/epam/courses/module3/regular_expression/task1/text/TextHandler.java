package by.epam.courses.module3.regular_expression.task1.text;

import java.util.*;

public class TextHandler {
    public String sortParagraphs(String text) {
        TextParser parser = new TextParser();
        TextLogic logic = new TextLogic();
        String[] paragraphs = parser.getParagraphs(text);
        Arrays.sort(paragraphs, new Comparator<String>() {
            @Override
            public int compare(String p1, String p2) {
                return logic.countSentences(p1) - logic.countSentences(p2);
            }
        });
        return logic.paragraphsToText(paragraphs);
    }

    public String sortSentencesWordLength(String text) {
        TextParser parser = new TextParser();
        TextLogic logic = new TextLogic();
        String[] paragraphs = parser.getParagraphs(text);
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = parser.getSentences(paragraphs[i]);
            for (int j = 0; j < sentences.length; j++) {
                String[] words = parser.getWords(sentences[j]);
                Arrays.sort(words, new Comparator<String>() {
                    @Override
                    public int compare(String w1, String w2) {
                        return w1.length() - w2.length();
                    }
                });
                sentences[j] = logic.wordsToSentence(words, sentences[j]);
            }
            paragraphs[i] = logic.sentenceToParagraph(sentences);
        }
        return logic.paragraphsToText(paragraphs);
    }

    public String sortSentenceLexeme(char symbol, String text) {
        TextParser parser = new TextParser();
        TextLogic logic = new TextLogic();
        String[] paragraphs = parser.getParagraphs(text);
        for (int i = 0; i < paragraphs.length; i++) {
            String[] sentences = parser.getSentences(paragraphs[i]);
            for (int j = 0; j < sentences.length; j++) {
                String[] words = parser.getWords(sentences[j]);
                Arrays.sort(words, new Comparator<String>() {
                    @Override
                    public int compare(String w1, String w2) {
                        int result = logic.countCharacter(symbol, w2) - logic.countCharacter(symbol, w1);
                        if (result == 0) {
                            return w1.compareToIgnoreCase(w2);
                        }
                        return result;
                    }
                });
                sentences[j] = logic.wordsToSentence(words, sentences[j]);
            }
            paragraphs[i] = logic.sentenceToParagraph(sentences);
        }
        return logic.paragraphsToText(paragraphs);
    }
}
