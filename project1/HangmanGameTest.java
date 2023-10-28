import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.*;

public class HangmanGameTest {

    @Test
    public void testInvalidWordLength() {
        String[] invalidWords = {"short", "verylongword"};
        for (String word : invalidWords) {
            HangmanGame game = new HangmanGame();
            game.chosenWord = word;  
            assertFalse(game.isGameOver());
        }
    }

    @Test
    public void testGameAlwaysLosesAfterMaxMistakes() {
        HangmanGame game = new HangmanGame();
        game.maxMistakes = 2;  
        game.mistakes = 2;  
        assertTrue(game.isGameOver());
    }

    @Test
    public void testGameStateChange() {
        HangmanGame game = new HangmanGame();
        game.chosenWord = "test";
        game.guessedLetters.add('t');
        game.displayWord();  
        assertThat(game.isWordGuessed()).isFalse();  
    }

    @Test
    public void testInputValidation() {
        HangmanGame game = new HangmanGame();
        assertThat(game.inputIsValid("a")).isTrue();  
        assertThat(game.inputIsValid("ab")).isFalse(); 
        assertThat(game.inputIsValid("1")).isFalse();  
    }
}
