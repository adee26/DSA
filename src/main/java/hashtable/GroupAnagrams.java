package hashtable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

public class GroupAnagrams {
    /**
     * You have been given an array of strings, where each string may contain only lowercase English letters.
     * You need to write a method groupAnagrams(String[] strings) that groups the anagrams in the array together
     * using a hash table (HashMap).
     * The method should return a list of lists, where each inner array contains a group of anagrams.
     * For example, if the input array is ["eat", "tea", "tan", "ate", "nat", "bat"],
     * the method should return [["eat","tea","ate"],["tan","nat"],["bat"]] because the first three strings are
     * anagrams of each other, the next two strings are anagrams of each other, and the last string has no anagrams
     * in the input array.
     */

    public static ArrayList<ArrayList<String>> groupAnagrams(String[] strings) {

        HashMap<ArrayList<Character>, ArrayList<String>> charStrings = new HashMap<>();

        for (String s : strings) {
            ArrayList<Character> chars = new ArrayList<>();
            for (char c : s.toCharArray()) {
                chars.add(c);
            }
            chars = chars.stream().sorted().collect(Collectors.toCollection(ArrayList::new));

            if(!charStrings.containsKey(chars)) {
                charStrings.put(chars, new ArrayList<>(List.of(s)));
            }else{
                ArrayList<String> newList = charStrings.get(chars);
                newList.add(s);
                charStrings.put(chars, newList);
            }
        }

        ArrayList<ArrayList<String>> result = new ArrayList<>();
        for (ArrayList<Character> list : charStrings.keySet()) {
            result.add(charStrings.get(list));
        }

        return result;
    }
}
