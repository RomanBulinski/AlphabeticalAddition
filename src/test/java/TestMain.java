import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestMain {

        @Test
        public void fixedTests() {
            assertEquals("f", Main.addLetters("a", "b", "c"));
            assertEquals("z", Main.addLetters("z"));
            assertEquals("c", Main.addLetters("a", "b"));
            assertEquals("c", Main.addLetters("c"));
            assertEquals("a", Main.addLetters("z", "a"));
            assertEquals("d", Main.addLetters("y", "c", "b"));
            assertEquals("z", Main.addLetters());
        }

}