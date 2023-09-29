package doubleLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoublyLinkedListTest {

    @Test
    void shouldCreateDoublyLinkedList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        assertEquals(doublyLinkedList.getLength(), 1);
        assertEquals(doublyLinkedList.getHead().value, 7);
        assertEquals(doublyLinkedList.getTail().value, 7);
    }

    @Test
    void shouldAppendToList() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(6);
        assertEquals(doublyLinkedList.getTail().value, 6);
        assertEquals(doublyLinkedList.getHead().value, 7);
        assertEquals(doublyLinkedList.getHead().next.value, 6);
        assertEquals(doublyLinkedList.getTail().prev.value, 7);
    }

    @Test
    void shouldRemoveEnd() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(6);
        doublyLinkedList.append(5);
        DoublyLinkedList.Node removedNode = doublyLinkedList.removeLast();
        assertEquals(5, removedNode.value);
        assertEquals(6, doublyLinkedList.getTail().value);
        assertEquals(2, doublyLinkedList.getLength());
    }

    @Test
    void shouldPrepend() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        DoublyLinkedList.Node newHead = doublyLinkedList.prepend(9);
        assertEquals(9, newHead.value);
        assertEquals(9, doublyLinkedList.getHead().value);
        assertEquals(3, doublyLinkedList.getLength());
        assertEquals(7, doublyLinkedList.getHead().next.value);
        assertNull( doublyLinkedList.getHead().prev);
        assertEquals(9, doublyLinkedList.getHead().next.prev.value);
    }

    @Test
    void shouldRemoveHead() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        DoublyLinkedList.Node oldHead = doublyLinkedList.removeFirst();

        assertEquals(7, oldHead.value);
        assertNull(oldHead.next);
        assertEquals(8, doublyLinkedList.getHead().value);
        assertNull(doublyLinkedList.getHead().prev);
    }

    @Test
    void shouldRetrieveElementByIndex() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);
        doublyLinkedList.append(10);
        doublyLinkedList.append(11);

        DoublyLinkedList.Node foundElement = doublyLinkedList.get(1);
        assertEquals(8, foundElement.value);

        DoublyLinkedList.Node foundElementFromTail = doublyLinkedList.get(3);
        assertEquals(10, foundElementFromTail.value);
    }

    @Test
    void shouldChangeNodeValue() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);

        assertTrue(doublyLinkedList.set(1, 9));
        assertEquals(9, doublyLinkedList.get(1).value);
    }

    @Test
    void shouldInsertNewNode() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);

        assertTrue(doublyLinkedList.insert(1, 10));
        assertEquals(10, doublyLinkedList.getHead().next.value);
        assertEquals(10, doublyLinkedList.get(1).value);
        assertEquals(8, doublyLinkedList.get(2).value);
        assertEquals(10, doublyLinkedList.get(2).prev.value);
    }

    @Test
    void shouldRemoveItemAtIndex() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);

        DoublyLinkedList.Node removedNode = doublyLinkedList.remove(1);
        assertEquals(8, removedNode.value);
        assertEquals(2, doublyLinkedList.getLength());
        assertEquals(9, doublyLinkedList.getHead().next.value);
        assertEquals(7, doublyLinkedList.getTail().prev.value);
    }

    @Test
    void shouldSwapValues() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);

        doublyLinkedList.swapFirstAndLast();
        assertEquals(9, doublyLinkedList.getHead().value);
        assertEquals(7, doublyLinkedList.getTail().value);
    }

    @Test
    void shouldSwapNodes() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(8);
        doublyLinkedList.append(9);
        doublyLinkedList.append(10);

        doublyLinkedList.swapNodesInPairs();
    }

}