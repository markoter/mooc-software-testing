package tudelft.countletters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountLettersTest {

    @Test
    public void multipleMatchingWords() {
        int words = new CountLetters().count("cats|dogs");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordDoesNotMatch() {
        int words = new CountLetters().count("cats|dog");
        Assertions.assertEquals(1, words);
    }

    @Test
    public void multipleRMatchingWords() {
        int words = new CountLetters().count("cater|doger");
        Assertions.assertEquals(2, words);
    }

    @Test
    public void lastWordRMatch() {
        int words = new CountLetters().count("cat|doger");
        Assertions.assertEquals(1, words);
    }
}