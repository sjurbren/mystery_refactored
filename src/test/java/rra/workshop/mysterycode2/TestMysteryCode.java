package rra.workshop.mysterycode2;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestMysteryCode {
    @Test
    public void x() {
        CamelCaseUtil camelCaseUtil = new CamelCaseUtil();
        assertEquals("Hello", camelCaseUtil.camelCase("Hello"));
    }
    @Test
    public void y() {
        CamelCaseUtil camelCaseUtil = new CamelCaseUtil();
        assertEquals("HelloWorld", camelCaseUtil.camelCase("Hello-World"));
    }
    @Test
    public void z() {
        CamelCaseUtil camelCaseUtil = new CamelCaseUtil();
        assertEquals("HelLoWorld", camelCaseUtil.camelCase("_Hel_lo-World-"));
    }
}
