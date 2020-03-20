package by.epam.courses.module3.regular_expression.task1.text;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextParser {
    public String[] getParagraphs(String text) {
        List<String> paragraphList = new ArrayList<>();
        Pattern pattern = Pattern.compile("\t[^\t]*");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            paragraphList.add(matcher.group());
        }
        String[] paragraphs = new String[paragraphList.size()];
        paragraphList.toArray(paragraphs);
        return paragraphs;
    }

    public String[] getSentences(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9][^.!?]*[.!?]+");
        Matcher matcher = pattern.matcher(text);
        List<String> sentenceList = new ArrayList<>();
        while (matcher.find()){
            sentenceList.add(matcher.group());
        }
        String[] sentences = new String[sentenceList.size()];
        sentenceList.toArray(sentences);
        return sentences;
    }

    public String[] getWords(String text) {
        Pattern pattern = Pattern.compile("[a-zA-Z0-9']+");
        Matcher matcher = pattern.matcher(text);
        List<String> wordsList = new ArrayList<>();
        while (matcher.find()){
            wordsList.add(matcher.group());
        }
        String[] words = new String[wordsList.size()];
        wordsList.toArray(words);
        return words;
    }
}
