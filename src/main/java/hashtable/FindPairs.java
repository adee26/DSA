package hashtable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class FindPairs {
    /**
     * Given two integer arrays arr1 and arr2, and an integer target, write a method named
     * findPairs that finds all pairs of integers such that one integer is from arr1,
     * the other is from arr2, and their sum equals the target value.
     * The method should return a list of integer arrays, each containing a pair of integers.
     */

    public static List<int[]> findPairs(int[] array1, int[] array2, int target) {
        HashMap<Integer, Integer> map1 = new HashMap<>();
        List<int[]> pairs = new ArrayList<>();

        for(int i = 0; i<array1.length; i++) {
            map1.put(target - array1[i], i); //4 - 1
        }

        for(int num : array2) {
            if (map1.containsKey(num)){
                pairs.add(new int[] {array1[map1.get(num)], num});
            }
        }

        return pairs;
    }
}
