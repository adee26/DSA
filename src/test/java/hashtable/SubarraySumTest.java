package hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubarraySumTest {

    @Test
    void shouldFindSubarray() {
        int[] nums = {1,2,3,4,5};
        int target = 9;
        int[] result = SubarraySum.findSubarraySum(nums, target);

        assertArrayEquals(new int[]{1, 3}, result );
    }

}