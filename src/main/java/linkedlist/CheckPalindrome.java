package linkedlist;

import DoubleLinkedList.DoublyLinkedList;

public class CheckPalindrome {

    public static boolean checkPalindrome(DoublyLinkedList doublyLinkedList){
        if (doublyLinkedList.getLength() == 0) {
            return false;
        }

        DoublyLinkedList.Node headTemp = doublyLinkedList.getHead();
        DoublyLinkedList.Node tailTemp = doublyLinkedList.getTail();

        for (int i = 0; i <= doublyLinkedList.getLength()/2; i++) {
           if(headTemp.getValue() != tailTemp.getValue()) {
               return false;
           }
           headTemp = headTemp.getNext();
           tailTemp = tailTemp.getPrev();
        }

        return true;
    }
}
