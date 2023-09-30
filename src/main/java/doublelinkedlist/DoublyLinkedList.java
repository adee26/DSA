package doublelinkedlist;

public class DoublyLinkedList {
    public class Node {
        int value;
        Node next;
        Node prev;

        public int getValue() {
            return value;
        }

        public Node getNext() {
            return next;
        }

        public Node getPrev() {
            return prev;
        }

        Node(int value) {
            this.value = value;
        }
    }
    private Node head;
    private Node tail;
    private int length;

    public DoublyLinkedList(int value){
        Node newNode = new Node(value);
        head = newNode;
        tail = newNode;
        length = 1;
    }

    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void append(int value) {
        Node newNode = new Node(value);
        if(length == 0){
            head = newNode;
            tail = newNode;
        } else {
            Node temp = tail;
            tail = newNode;
            temp.next = tail;
            tail.prev = temp;

            length++;
        }

    }

    public Node removeLast() {
        if(length == 0) {
            return null;
        }

        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return  null;
        }

        Node temp = tail;
        tail = tail.prev;
        tail.next = null;
        temp.prev = null;

        length--;
        return temp;
    }

    public Node prepend(int value) {
        Node newNode = new Node(value);
        if (length == 0) {
            head = newNode;
            tail = newNode;
            length++;
            return newNode;
        }

        Node prevHead = head;
        head = newNode;
        head.next = prevHead;
        prevHead.prev = head;
        length++;

        return head;
    }

    public Node removeFirst() {
        if (length == 0) {
            return null;
        }

        Node prevHead = head;

        if (length == 1) {
            head = null;
            tail = null;
            length--;
            return prevHead;
        }

        head = head.next;
        head.prev = null;
        prevHead.next = null;
        length--;

        return prevHead;
    }

    public Node get(int index) {
        if (index < 0 || index >= length) {
            return null;
        }
        if (index <= length/2) {
            Node temp = head;
            for (int i=0; i<index; i++){
                temp = temp.next;
            }
            return temp;
        }

        if (index > length/2) {
            Node temp = tail;
            for (int i = length-1; i>index; i--) {
                temp = temp.prev;
            }
            return temp;
        } //7 8 9 10 11
        return null;
    }

    public Node getHead() {
        return head;
    }

    public boolean set(int index, int value) {
        if (index < 0 || index >= length) {
            return false;
        }

        Node nodeToChange = get(index);
        if (nodeToChange != null) {
            nodeToChange.value = value;
            return true;
        }
        return false;
    }

    public boolean insert(int index, int value) {
        if(index < 0 || index >= length) {
            return false;
        }

        if(index == 0) {
           prepend(value);
           return true;
        }

        if(index == length-1) {
            append(value);
            return true;
        }

        Node preNode = get(index - 1);

        if(preNode != null) {
            Node newNode = new Node(value);
            newNode.next = preNode.next;
            preNode.next.prev = newNode;

            newNode.prev = preNode;
            preNode.next = newNode;
            length++;
            return true;
        }
        return false;
    }

    public Node remove(int index) {
        if (index < 0 || index >= length) {
            return null;
        }

        Node nodeToRemove = get(index);
        if (nodeToRemove == null) {
            return null;
        }

        if (index == 0) {
           return removeFirst();
        }

        if (index == length - 1) {
            return removeLast();
        }

        Node pre = nodeToRemove.prev;
        Node after = nodeToRemove.next;

        pre.next = nodeToRemove.next;
        nodeToRemove.next = null;
        after.prev = nodeToRemove.prev;
        nodeToRemove.prev = null;
        length--;

        return nodeToRemove;
    }

    public void swapFirstAndLast() {
        if(length < 2) {
            return;
        }
        int firstValue = head.value;

        head.value = tail.value;
        tail.value = firstValue;
    }

    public void swapNodesInPairs() {
        if (length < 1) {
            return;
        }

        Node tempHead = head;
        Node tempHeadNext = head.next;

        for (int i = 0; i<length-1; i++) {
            Node temp = tempHead;
            tempHead.next = tempHeadNext.next;
            tempHead.prev = tempHeadNext;

            tempHeadNext.next.prev = tempHead;
            if(temp.prev != null){
                tempHeadNext.prev = temp.prev;
            }
            tempHeadNext.next = tempHead;

            tempHead = tempHeadNext.next.next;
            tempHeadNext = tempHeadNext.next.next;
        }

        // 2-><-1-><-3-><-4 //TODO
    }


    public void setHead(Node head) {
        this.head = head;
    }

    public Node getTail() {
        return tail;
    }

    public void setTail(Node tail) {
        this.tail = tail;
    }

    public int getLength() {
        return length;
    }

}
