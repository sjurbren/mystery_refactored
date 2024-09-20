package rra.workshop.mysterycode3;

public class CamelCaseUtil extends AbstractWordUtil {
    CamelCaseUtil() {
        super("");
    }
    private String capitalFirstLetter(String word) {
        String firstLetter = word.substring(0, 1);
        String remainingLetters = word.substring(1);
        return firstLetter.toUpperCase() + remainingLetters.toLowerCase();
    }

    @Override
    protected String changeWord(String word) {
        return capitalFirstLetter(word);
    }

}

