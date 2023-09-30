package hashtable;

import hashtable.ItemInCommon;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ItemInCommonTest {

    @Test
    void shouldReturnTrueForCommonElements() {
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,5};

        boolean haveCommon = ItemInCommon.haveItemInCommon(array1, array2);

        assertTrue(haveCommon);
    }
    @Test
    void shouldReturnFalseForCommonElements() {
        int[] array1 = {1,3,5};
        int[] array2 = {2,4,6};

        boolean haveCommon = ItemInCommon.haveItemInCommon(array1, array2);

        assertFalse(haveCommon);
    }

}