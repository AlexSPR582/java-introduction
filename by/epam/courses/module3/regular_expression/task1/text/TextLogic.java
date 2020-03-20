package by.epam.courses.module3.regular_expression.task1.text;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextLogic {
    public int countSentences(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9][^.!?]*[.!?]+");
        Matcher matcher = pattern.matcher(text);
        int sentences = 0;
        while (matcher.find()){
            sentences++;
        }
        return sentences;
    }

    public int countCharacter(char symbol, String text) {
        int character = 0;
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) == symbol) {
                character++;
            }
        }
        return character;
    }

    public String paragraphsToText(String[] paragraphs) {
        StringBuilder sb = new StringBuilder();
        for (String paragraph: paragraphs) {
            sb.append(paragraph).append('\n');
        }
        return sb.toString();
    }

    public String sentenceToParagraph(String[] sentences) {
        StringBuilder sb = new StringBuilder("\t");
        for (String sentence: sentences) {
            sb.append(sentence).append(" ");
        }
        return sb.toString();
    }

    public String wordsToSentence(String[] words, String sentence) {
        Pattern pattern = Pattern.compile("[^a-zA-Z0-9']+");
        Matcher matcher = pattern.matcher(sentence);
        StringBuilder newSentence = new StringBuilder();
        int wordIndex = 0;
        while(matcher.find()) {
            newSentence.append(words[wordIndex]);
            newSentence.append(matcher.group());
            wordIndex++;
        }
        return newSentence.toString();
    }
}
