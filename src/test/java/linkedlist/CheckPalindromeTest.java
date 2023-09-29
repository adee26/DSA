package linkedlist;

import DoubleLinkedList.DoublyLinkedList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPalindromeTest {

    @Test
    void shouldTestIsPalindromeTrue() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(2);
        doublyLinkedList.append(1);

        boolean isPalindrome = CheckPalindrome.checkPalindrome(doublyLinkedList);

        assertTrue(isPalindrome);
    }

    @Test
    void shouldTestIsPalindromeFalse() {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(1);
        doublyLinkedList.append(2);
        doublyLinkedList.append(3);
        doublyLinkedList.append(2);

        boolean isPalindrome = CheckPalindrome.checkPalindrome(doublyLinkedList);

        assertFalse(isPalindrome);
    }

}