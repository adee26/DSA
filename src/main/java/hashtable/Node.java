package hashtable;

public class Node {
    private String key;
    private int value;
    private Node next;

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    public Node(String key, int value) {
        this.key = key;
        this.value = value;
    }
}
