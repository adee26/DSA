package stack;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class StackTest {

    @Test
    void shouldCreateStack() {
        Stack stack = new Stack(1);
        assertEquals(1, stack.getHeight());
        assertEquals(1, stack.getTop().value);
    }

    @Test
    void shouldPushToStack() {
        Stack stack = new Stack(1);
        stack.push(0);
        assertEquals(0, stack.getTop().value);
        assertEquals(1, stack.getTop().next.value);
        assertEquals(2, stack.getHeight());
    }

    @Test
    void shouldPopFromStack() {
        Stack stack = new Stack(1);
        stack.push(2);

        Stack.Node removedItem = stack.pop();
        assertEquals(2, removedItem.value);
        assertEquals(1, stack.getHeight());
        assertEquals(1, stack.getTop().value);
    }

}