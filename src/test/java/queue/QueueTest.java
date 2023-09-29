package queue;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class QueueTest {

    @Test
    void shouldCreateQueue() {
        Queue queue = new Queue(1);
        assertEquals(1, queue.getFirst().value);
        assertEquals(1, queue.getLast().value);
        assertEquals(1, queue.getLength());
    }

    @Test
    void shouldEnqueue() {
        Queue queue = new Queue(1);
        queue.enqueue(2);
        assertEquals(2, queue.getLast().value);
        assertEquals(2, queue.getLength());
    }

    @Test
    void shouldDequeue() {
        Queue queue = new Queue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        assertEquals(1,queue.dequeue().value);
        assertEquals(2, queue.getFirst().value);
        assertEquals(2, queue.getLength());

    }

}