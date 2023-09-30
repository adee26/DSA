package hashtable;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FirstNonRepeatableCharacterTest {

    @Test
    void shouldReturnFirstNonRepeatableCharacter() {
        String s = "hello";
        Character c = FirstNonRepeatableCharacter.findFirstNonRepeatableCharacter(s);

        assertEquals('h', c);
    }

}