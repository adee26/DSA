package hashtable;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicates {
    /**
     * Given an array of integers nums, find all the duplicates in the array using a hash table.
     */
    public static ArrayList<Integer> findDuplicates(int[] array) {
        ArrayList<Integer> duplicates = new ArrayList<>();
        HashMap<Integer, Boolean> items = new HashMap<>();
        for (int i : array) {
            if(items.containsKey(i)){
                items.put(i, true);
            }else{
                items.put(i, false);
            }
        }

        for (int i : items.keySet()) {
            if(items.get(i)) {
                duplicates.add(i);
            }
        }

        return duplicates;
    }
}
