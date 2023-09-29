package DoubleLinkedList;

public class Main {
    public static void main(String[] args) {
        DoublyLinkedList doublyLinkedList = new DoublyLinkedList(7);
        doublyLinkedList.append(6);
        doublyLinkedList.append(5);
        doublyLinkedList.printList();
        System.out.println("-------");
        doublyLinkedList.removeLast();
        doublyLinkedList.printList();
    }
}
