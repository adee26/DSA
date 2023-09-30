package hashtable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class HashTableTest {

    @Test
    void shouldAddNewKeyValuePair() {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("hammers", 2);
        hashTable.set("nuts", 2);

        assertEquals(100, hashTable.get("nails"));
        assertEquals(2, hashTable.get("hammers"));
        assertEquals(2, hashTable.get("nuts"));
    }

    @Test
    void shouldReturnKeys() {
        HashTable hashTable = new HashTable();
        hashTable.set("nails", 100);
        hashTable.set("hammers", 2);
        hashTable.set("nuts", 2);

        ArrayList<String> keys = hashTable.keys();
        assertEquals(3, keys.size());
        assertTrue(keys.contains("nails"));
        assertTrue(keys.contains("hammers"));
        assertTrue(keys.contains("nuts"));

    }

}