package by.epam.courses.module3.regular_expression.task2.node;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class Node {
    private String openTag;
    private String closeTag;
    private String content;
    private String emptyTag;

    public Node(String node) {
        parse(node);
    }

    private void parse(String node) {
        findEmptyTag(node);
        if (emptyTag == null) {
            findOpenTag(node);
            findCloseTag(node);
            findContent(node);
        }
    }

    private void findEmptyTag(String node) {
        Pattern pattern = Pattern.compile("^<[a-zA-Z]+/>$");
        Matcher matcher = pattern.matcher(node);
        if (matcher.find()){
            emptyTag = matcher.group();
        }
    }

    private void findOpenTag(String node) {
        Pattern pattern = Pattern.compile("^(<[a-zA-Z]+(\\s[a-zA-Z]+=\"[a-zA-Z0-9]+\")*>)");
        Matcher matcher = pattern.matcher(node);
        if (matcher.find()) {
            openTag = matcher.group(1);
        }
    }

    private void findCloseTag(String node) {
        Pattern pattern = Pattern.compile("(</[a-zA-Z]+>)$");
        Matcher matcher = pattern.matcher(node);
        if (matcher.find()) {
            closeTag = matcher.group(1);
        }
    }

    private void findContent(String node) {
        Pattern pattern = Pattern.compile(openTag + "(.*)" + closeTag);
        Matcher matcher = pattern.matcher(node);
        if (matcher.find()) {
            content = matcher.group(1);
        }
    }

    public String getOpenTag() {
        return openTag;
    }

    public String getCloseTag() {
        return closeTag;
    }

    public String getContent() {
        return content;
    }

    public String getEmptyTag() {
        return emptyTag;
    }

    public boolean isEmpty(){
        if (emptyTag == null) {
            return false;
        }
        return true;
    }
}
