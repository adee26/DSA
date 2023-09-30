package hashtable;

import java.util.ArrayList;

public class HashTable {
    private int size = 7;
    private Node[] dataMap;

    public HashTable() {
        dataMap = new Node[size];
    }

    private int hash(String key) {
        int hash = 0;
        char[] keyChars = key.toCharArray();
        for (int asciiValue : keyChars) {
            hash = (hash + asciiValue * 23) % dataMap.length;
        }
        return hash;
    }

    public void set(String key, int value) {
        Node newNode = new Node(key, value);
        int hash = hash(key);
        Node existingNode = dataMap[hash];
        if(existingNode == null) {
            dataMap[hash] = newNode;
        } else {
            Node temp = existingNode;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            existingNode.setNext(newNode);
        }

    }

    public int get(String key) {
        Node node = dataMap[hash(key)];
        while (node != null) {
            if(node.getKey().equals(key)){
                return node.getValue();
            }
            node = node.getNext();
        }
        return 0;
    }

    public ArrayList<String> keys() {
        ArrayList<String> keys = new ArrayList<>();

        for (Node n : dataMap) {
            while (n != null) {
                keys.add(n.getKey());
                n = n.getNext();
            }
        }

        return keys;
    }
}
