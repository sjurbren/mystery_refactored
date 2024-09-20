package rra.workshop.mysterycode3;

public class SnakeCaseUtil extends AbstractWordUtil {
    SnakeCaseUtil() {
        super("_");
    }

    protected String changeWord(String word) {
        return word.toLowerCase();
    }
}
