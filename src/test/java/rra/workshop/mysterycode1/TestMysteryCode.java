package rra.workshop.mysterycode1;
import rra.workshop.mysterycode1.MysteryCode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

public class TestMysteryCode {
    @Test
    public void x() {
        MysteryCode mysteryCode = new MysteryCode();
        assertEquals("Hello", mysteryCode.mysteryCode("Hello"));
    }
    @Test
    public void y() {
        MysteryCode mysteryCode = new MysteryCode();
        assertEquals("HelloWorld", mysteryCode.mysteryCode("Hello-World"));
    }
    @Test
    public void z() {
        MysteryCode mysteryCode = new MysteryCode();
        assertEquals("HelLoWorld", mysteryCode.mysteryCode("_Hel_lo-World-"));
    }
}
