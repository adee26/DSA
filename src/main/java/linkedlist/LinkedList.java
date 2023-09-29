package linkedlist;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }

    }

    public LinkedList(int value) {
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if (this.length == 0){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
        length++;

    }

    public Node removeLast() {
        if (length == 0) {
            return null;
        }

        Node temp = head;
        Node pre = head;
        while (temp.next != null) {
            pre = temp;
            temp = temp.next;
        }

        tail = pre;
        tail.next = null;
        length--;

        return temp;
    }


//        if(length == 0) {
//            return null;
//        }
//        else {
//            Node temp = head;
//            Node pre = head;
//            while (temp.next != null) {
//                pre = temp;
//                temp = temp.next;
//            }
//            tail = pre;
//            tail.next = null;
//            length--;
//
//            if (length == 0) {
//                head = null;
//                tail = null;
//            }
//            return temp;
//        }
//    }

    public Node prepend(int value) {
        Node node = new Node(value);
        if(length == 0) {
           this.head = node;
           this.tail = node;
        } else {
        Node temp = this.head;
        this.head = node;
        head.next = temp;
        }
        length++;
        return head;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        } else {
            Node temp = head;
            head = head.next;
            temp.next = null;
            length --;
            if(length == 0) {
                tail = null;
            }
            return temp;
        }
    }

    public Node get(int index) {
        if(length <= 0 || index >= length) {
            return null;
        }
        int counter = 0;
        Node result = head;
        while (counter < index) {
            result = result.next;
            counter++;
        }

        return result;
    }

    public boolean set(int index, int value) {
        if(length <= 0 || index >= length) {
            return false;
        }

        Node temp = head;

        for (int i = 0; i<index; i++) {
            temp = temp.next;
        }

        temp.value = value;
        return true;
    }

    public boolean insert(int index, int value) {
        if(index == 0) {
            prepend(value);
            return true;
        }else if(index == length - 1){
            append(value);
        } else{
            Node temp = get(index - 1);
            if (temp == null) {
                return false;
            }

            Node newNode = new Node(value);
            newNode.next = temp.next;
            temp.next = newNode;
        }
        length++;
        return true;
    }

    public Node remove(int index) {
        if (index == 0) {
            return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node pre = get(index - 1);
        Node temp = pre.next;
        pre.next = temp.next;
        temp.next = null;

        length--;
        return temp;
    }

    public void reverse() {
        Node temp = head;
        head = tail;
        tail = temp;

        Node after = temp.next;
        Node before = null;

        for (int i = 0; i<length; i++) {
            after = temp.next;
            temp.next = before;
            before = temp;
            temp = after;
        }

    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public Node findMiddle() {
        Node pointer1 = head;
        Node pointer2 = head;

        while (pointer2 !=null && pointer2.next != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
            pointer2 = pointer2.next;
        }

        return pointer1;
    }

    public Node findKthNumberFromEnd(int k) {
        Node pointer1 = head;
        Node pointer2 = head;

        for (int i = 0; i<k; i++) {
            if(pointer2 == null) {
                return null;
            }
            pointer2 = pointer1.next;
        }

        while (pointer2 != null) {
            pointer1 = pointer1.next;
            pointer2 = pointer2.next;
        }

        return pointer1;
    }

    public void getHead() {
        System.out.println("Head: " + head.value);
    }

    public void getTail() {
        System.out.println("Tail: " + tail.value);
    }

    public void getLength() {
        System.out.println("Length: " + length);
    }
}
