package by.epam.courses.module3.regular_expression.task2.node;

public class NodeLogic {
    public void printNode(Node node) {
        if (!node.isEmpty()) {
            System.out.println(node.getOpenTag());
            System.out.println(node.getCloseTag());
            System.out.println(node.getContent());
        }
        else {
            System.out.println(node.getEmptyTag());
        }
        System.out.println();
    }
}
