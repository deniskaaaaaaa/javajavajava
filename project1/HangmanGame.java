package project1;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.HashSet;

public class HangmanGame {
    private String[] wordList = {"hello", "world", "java", "hangman"};
    private String chosenWord;
    private Set<Character> guessedLetters;
    private int maxMistakes = 5;
    private int mistakes;

    public HangmanGame() {
        Random rand = new Random();
        chosenWord = wordList[rand.nextInt(wordList.length)];
        guessedLetters = new HashSet<>();
        mistakes = 0;
    }

    public boolean isGameOver() {
        return mistakes >= maxMistakes || isWordGuessed();
    }

    public boolean isWordGuessed() {
        for (char letter : chosenWord.toCharArray()) {
            if (!guessedLetters.contains(letter)) {
                return false;
            }
        }
        return true;
    }
    public void playGame() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Hangman!");

        while (!isGameOver()) {
            System.out.println("Guess a letter or type 'quit' to surrender:");
            String input = scanner.nextLine().toLowerCase();

            if (input.equals("quit")) {
                System.out.println("You surrendered. The word was: " + chosenWord);
                return;
            }

            if (input.length() != 1 || !Character.isLetter(input.charAt(0))) {
                System.out.println("Please enter a single letter.");
                continue;
            }

            char guess = input.charAt(0);

            if (guessedLetters.contains(guess)) {
                System.out.println("You've already guessed that letter.");
                continue;
            }

            if (chosenWord.contains(String.valueOf(guess))) {
                guessedLetters.add(guess);
                System.out.println("Hit!");
            } else {
                mistakes++;
                System.out.println("Missed, mistake " + mistakes + " out of " + maxMistakes + ".");
            }

            displayWord();
        }

        if (isWordGuessed()) {
            System.out.println("You won!");
        } else {
            System.out.println("You lost! The word was: " + chosenWord);
        }
    }

    public static void main(String[] args) {
        HangmanGame game = new HangmanGame();
        game.playGame();
    }

    public void displayWord() {
        StringBuilder display = new StringBuilder();

        for (char letter : chosenWord.toCharArray()) {
            if (guessedLetters.contains(letter)) {
                display.append(letter);
            } else {
                display.append('*');
            }
        }

        System.out.println("The word: " + display.toString());
    }
}
