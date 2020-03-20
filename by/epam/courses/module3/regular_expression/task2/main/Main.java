package by.epam.courses.module3.regular_expression.task2.main;

// Напишите анализатор, позволяющий последовательно возвращать содержимое
// узлов xml-документа и его тип (открывающий тег, закрывающий тег, содержимое тега, тег без тела).
// Пользоваться готовыми парсерами XML для решения данной задачи нельзя.

import by.epam.courses.module3.regular_expression.task2.analyzer.Analyzer;
import by.epam.courses.module3.regular_expression.task2.node.Node;
import by.epam.courses.module3.regular_expression.task2.node.NodeLogic;

public class Main {
    public static void main(String[] args) {
        Analyzer analyzer = new Analyzer();
        NodeLogic nodeLogic = new NodeLogic();
        Node root = analyzer.getRoot();
        nodeLogic.printNode(root);

        Node[] childNodes = analyzer.getChildNodes(root);

        for (Node node: childNodes){
            nodeLogic.printNode(node);
            for (Node childNode: analyzer.getChildNodes(node)) {
                nodeLogic.printNode(childNode);
            }
        }
    }
}
