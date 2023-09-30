package hashtable;

import java.util.HashMap;

public class FirstNonRepeatableCharacter {
    /**
     * You have been given a string of lowercase letters.
     * Write a function called firstNonRepeatingChar(String) that finds the first non-repeating character in
     * the given string using a hash table (HashMap).
     * If there is no non-repeating character in the string, the function should return null.
     * For example, if the input string is "leetcode", the function should return "l" because "l" is the
     * first character that appears only once in the string. Similarly, if the input string is "hello",
     * the function should return "h" because "h" is the first non-repeating character in the string.
     */
    public static Character findFirstNonRepeatableCharacter(String s){
        char[] chars = s.toCharArray();
        HashMap<Character, Integer> charCount = new HashMap<>();

        for (char c : chars) {
            if(charCount.containsKey(c)) {
                charCount.put(c, charCount.get(c) + 1);
            }else{
                charCount.put(c, 1);
            }
        }

        for (char c : chars) {
            if(charCount.get(c) == 1) {
                return c;
            }
        }

        return null;
    }
}
