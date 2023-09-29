package stack;

public class Stack {
    private Node top;
    private int height;

    public Stack(int value) {
        Node newNode = new Node(value);
        top = newNode;
        height = 1;
    }

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    public void printStack() {
        Node temp = top;
        while (temp.next != null) {
            System.out.println(temp.value);
            temp = temp.next;
        }
    }

    public void push(int value) {
        Node node = new Node(value);
        if (height != 0) {
            node.next = top;
        }
        top = node;
        height++;
    }

    public Node pop() {
        if(height == 0) {
            return null;
        }
        Node topToPop = top;
        top = topToPop.next;
        topToPop.next = null;

        height--;
        return topToPop;
    }

    public Node getTop() {
        return top;
    }

    public int getHeight() {
        return height;
    }
}
