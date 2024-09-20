package rra.workshop.mysterycode3;

abstract class AbstractWordUtil {
    private final String separator;

    AbstractWordUtil(String separator) {
        this.separator = separator;
    }

    public String manipulateSentence(String sentence) {
        String[] words = splitWords(sentence);
        return concatenateChangedWords(words);
    }

    private String concatenateChangedWords(String[] words) {
        String manipulatedWords = "";
        for (String word : words) {
            if (!word.isEmpty()) {
                if (!manipulatedWords.isEmpty()) {
                    manipulatedWords += separator;
                }
                manipulatedWords += changeWord(word);
            }
        }
        return manipulatedWords;
    }

    private String[] splitWords(String s) {
        return s.split("_|-| ");
    }

    abstract protected String changeWord(String word);
}
