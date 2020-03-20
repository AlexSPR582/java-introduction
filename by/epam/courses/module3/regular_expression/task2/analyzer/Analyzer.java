package by.epam.courses.module3.regular_expression.task2.analyzer;

import by.epam.courses.module3.regular_expression.task2.node.Node;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Analyzer {
    private String xmlFile;

    public Analyzer() {
        xmlFile = readFile();
    }

    public Node[] getChildNodes(Node node) {
        if (node.isEmpty()) {
            return null;
        }
        List<Node> nodes = new ArrayList<>();
        Pattern pattern = Pattern.compile("(<([a-zA-Z]+).+?</\\2>)|(<[a-zA-Z]+/>)");
        Matcher matcher = pattern.matcher(node.getContent());
        while (matcher.find()) {
            nodes.add(new Node(matcher.group()));
        }
        return nodes.toArray(new Node[nodes.size()]);
    }

    public Node getRoot() {
        Pattern pattern = Pattern.compile("(<([a-zA-Z]+).+?</\\2>)|(<[a-zA-Z]+/>)");
        Matcher matcher = pattern.matcher(xmlFile);
        if (matcher.find()) {
            return new Node(matcher.group());
        }
        return null;
    }

    private String readFile() {
        StringBuilder sb = new StringBuilder();
        String sep = File.separator;
        String path = "src" + sep +
                "by" + sep + "epam" + sep +
                "courses" + sep + "module3" + sep +
                "regular_expression" + sep + "task2" + sep + "file.txt";
        try (FileReader fr = new FileReader(path);
             Scanner sc = new Scanner(fr)) {
            while (sc.hasNextLine()) {
                sb.append(sc.nextLine().trim());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString();
    }
}
