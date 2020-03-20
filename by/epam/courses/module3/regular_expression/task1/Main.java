package by.epam.courses.module3.regular_expression.task1;

//Создать приложение, разбирающее текст (текст хранится в строке)
//и позволяющее выполнять с текстом три различных операции:
//отсортировать абзацы по количеству предложений;
//в каждом предложении отсортировать слова по длине;
//отсортировать лексемы в предложении по убыванию количества вхождений заданного символа,
//а в случае равенства – по алфавиту.

import by.epam.courses.module3.regular_expression.task1.text.TextHandler;

public class Main {
    public static void main(String[] args) {
        String text = "\tEnglish texts for beginners to practice reading. " +
                "Practicing your comprehension of written English. " +
                "Improve your vocabulary and understanding of grammar and word order. " +
                "\tThe texts below are designed to help you develop while giving " +
                "you an instant evaluation of your progress. " +
                "\tPrepared by experienced English teachers, the texts, " +
                "articles and conversations are brief and appropriate to your level of proficiency.";

        TextHandler handler = new TextHandler();

        System.out.println("СОРТИРОВКА АБЗАЦОВ ПО КОЛИЧЕСТВУ ПРЕДЛОЖЕНИЙ:");
        System.out.println(handler.sortParagraphs(text));

        System.out.println("СОРТИРОВКА СЛОВ ПО ДЛИНЕ В КАЖДОМ ПРЕДЛОЖЕНИИ:");
        System.out.println(handler.sortSentencesWordLength(text));

        System.out.println("СОРТИРОВКА ЛЕКСЕМ В ПРЕДЛОЖЕНИИ ПО УБЫВАНИЮ КОЛИЧЕСТВА ВХОЖДЕНИЯ СИМВОЛА:");
        System.out.println(handler.sortSentenceLexeme('e', text));
    }
}
