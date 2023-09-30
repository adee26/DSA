package hashtable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class GroupAnagramsTest {

    @Test
    void shouldGroupAnagrams() {
        String[] strings = {"eat", "tea", "tan", "ate", "nat", "bat"};

        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("eat","tea","ate"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("tan","nat"));
        ArrayList<String> list3 = new ArrayList<>(List.of("bat"));


        ArrayList<ArrayList<String>> actual = GroupAnagrams.groupAnagrams(strings);

        assertTrue(actual.contains(list1));
        assertTrue(actual.contains(list2));
        assertTrue(actual.contains(list3));
    }

}