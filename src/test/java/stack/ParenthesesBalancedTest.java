package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesBalancedTest {

    @Test
    void shouldCheckParenthesesBalanced() {
        String s = "()(()";
        assertFalse(ParenthesesBalanced.isBalanced(s));
    }

}