package hashtable;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.*;

class FindDuplicatesTest {

    @Test
    void shouldReturnDuplicates() {
        int[] array = {1,5,4,1,3,5,4,2};
        ArrayList<Integer> duplicates = FindDuplicates.findDuplicates(array);
        ArrayList<Integer> expected = new ArrayList<>(Arrays.asList(1,4,5));

        assertEquals(expected, duplicates);
    }

}