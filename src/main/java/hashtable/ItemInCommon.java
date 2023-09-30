package hashtable;

import java.util.HashMap;

public class ItemInCommon {
    public static boolean haveItemInCommon(int[] array1, int[] array2) {
        HashMap<Integer, Integer> items = new HashMap<>();

        for (int i : array1) {
            items.put(i, 1);
        }

        for (int i : array2) {
            if(items.containsKey(i)) {
                return true;
            }else{
                items.put(i, 1);
            }
        }
        return false;
    }
}
