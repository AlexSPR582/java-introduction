package by.epam.courses.module3.string_as_object.task8;

public class StringTask8 {
    public String findLongestWord(String str){
        String[] words = str.split(" ");
        String longestWord = "";
        for (String word: words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        return longestWord;
    }
}
