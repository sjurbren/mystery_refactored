package rra.workshop.mysterycode3;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMysteryCode {
    @Test
    public void x() {
        CamelCaseUtil camelCaseUtil = new CamelCaseUtil();
        assertEquals("Hello", camelCaseUtil.manipulateSentence("Hello"));
    }
    @Test
    public void y() {
        CamelCaseUtil camelCaseUtil = new CamelCaseUtil();
        assertEquals("HelloWorld", camelCaseUtil.manipulateSentence("Hello-World"));
    }
    @Test
    public void z() {
        CamelCaseUtil camelCaseUtil = new CamelCaseUtil();
        assertEquals("HelLoWorld", camelCaseUtil.manipulateSentence("_Hel_lo-World-"));
    }

    @Test
    public void x2() {
        SnakeCaseUtil camelCaseUtil = new SnakeCaseUtil();
        assertEquals("hello", camelCaseUtil.manipulateSentence("Hello"));
    }
    @Test
    public void y2() {
        SnakeCaseUtil camelCaseUtil = new SnakeCaseUtil();
        assertEquals("hello_world", camelCaseUtil.manipulateSentence("Hello-World"));
    }
    @Test
    public void z2() {
        SnakeCaseUtil camelCaseUtil = new SnakeCaseUtil();
        assertEquals("hel_lo_world", camelCaseUtil.manipulateSentence("_Hel_lo-World-"));
    }
}
