package rra.workshop.mysterycode2;

public class CamelCaseUtil {

    String camelCase(String words) {
        String[] wordsArray = splitWords(words);
        return concatenateWords(wordsArray);
    }

    private String concatenateWords(String[] words) {
        String camelCasedWords = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                camelCasedWords = camelCasedWords + capitalize(word);
            }
        }
        return camelCasedWords;
    }

    private String capitalize(String word) {
        String firstLetter = word.substring(0, 1);
        String remainingLetters = word.substring(1);
        return firstLetter.toUpperCase() + remainingLetters.toLowerCase();
    }

    private String[] splitWords(String s) {
        return s.split("_|-| ");
    }
}