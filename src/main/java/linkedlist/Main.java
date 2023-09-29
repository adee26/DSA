package linkedlist;


public class Main {
    public static void main(String[] args) {
        LinkedList myLinkedList = new LinkedList(4);
        myLinkedList.append(2);
        myLinkedList.printList();

        System.out.println("-------------");
        System.out.println(myLinkedList.removeLast().value);
        System.out.println("-------------");

        myLinkedList.printList();

        System.out.println("-------------");

        myLinkedList.prepend(3);
        myLinkedList.printList();

        System.out.println("-------------");
        System.out.println(myLinkedList.removeFirst().value);
        myLinkedList.printList();

        System.out.println("-------------");
        myLinkedList.prepend(3);
        myLinkedList.append(5);
        myLinkedList.append(6);
        System.out.println("-------------");
        myLinkedList.printList();
        System.out.println("-------------");
        System.out.println(myLinkedList.get(1).value);
        System.out.println("-------------");
        myLinkedList.printList();
        System.out.println("-------------");
        myLinkedList.set(2, 4);
        myLinkedList.printList();
        System.out.println("-------------");
        myLinkedList.insert(0, 3);
        myLinkedList.insert(1, 2);
        myLinkedList.printList();
        System.out.println("-------------");
        myLinkedList.remove(2);
        myLinkedList.printList();
        System.out.println("-------------");
        myLinkedList.reverse();
        myLinkedList.append(2);
        myLinkedList.printList();

        System.out.println("-------------");
        System.out.println(myLinkedList.findMiddle().value);
        System.out.println("-------------");
        System.out.println(myLinkedList.findKthNumberFromEnd(2).value);

    }
}