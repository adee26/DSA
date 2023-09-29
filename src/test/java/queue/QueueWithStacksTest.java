package queue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class QueueWithStacksTest {

    @Test
    void shouldTestEnqueueWithStacks() {
        QueueWithStacks queue = new QueueWithStacks();
        queue.enqueue(1);
        assertEquals(1, queue.peek());
        queue.enqueue(2);
        assertEquals(1, queue.peek());
    }

}