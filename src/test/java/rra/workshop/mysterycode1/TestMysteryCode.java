package rra.workshop.mysterycode1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;

public class TestMysteryCode {
    @Test
    public void x() {
        MysteryCode mysteryCode = new MysteryCode();
        assertEquals("Hello", mysteryCode.mysteryCode("Hello"));
    }
}
