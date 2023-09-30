package hashtable;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class FindPairsTest {

    @Test
    void shouldFindPairs() {
        int[] arr1 = {1,2,3,4,5};
        int[] arr2 = {2,4,6,8,10};
        int target = 7;

        List<int[]> result = FindPairs.findPairs(arr1, arr2, target);

        assertArrayEquals(result.get(0), new int[]{5,2});
        assertArrayEquals(result.get(1), new int[]{3,4});
        assertArrayEquals(result.get(2), new int[]{1,6});
    }

}