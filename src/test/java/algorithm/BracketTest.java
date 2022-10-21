package algorithm;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BracketTest {
    @Test
    @DisplayName("bracket test")

    void bracket() {
        Bracket b = new Bracket();
        assertTrue(b.solution("()()"));
        assertTrue(b.solution("(())()"));
        assertFalse(b.solution(")()("));
        assertFalse(b.solution("(()("));

    }

}