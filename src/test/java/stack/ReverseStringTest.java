package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ReverseStringTest {

    @Test
    void shouldReverseString() {
        String s = "Hello";
        String reversed = ReverseString.reverseString(s);
        assertEquals("olleH", reversed);
    }

}