package numberguessinggame;
import java.util.Scanner;

public class Game {
	
	Scanner userGuess = new Scanner(System.in);
	public int guess;
	final int NUMGUESS = 5;
	final int LAST_GUESS_CHECK = NUMGUESS - 1;
	
	public void printStartMessage() {
		System.out.println("I have thought of a random number between 0-100. You have 5 guesses. Good luck!");
	}
	
	public void playGame(int randomNumber) {
		for (int i=0; i<NUMGUESS; i++) {	
				System.out.print("Your Guess: ");
				guess = userGuess.nextInt();
				if (guess < randomNumber && i!=LAST_GUESS_CHECK) {
					System.out.println("Your number is less than the Random Number.");
				} else if (guess > randomNumber && i!=LAST_GUESS_CHECK) {
					System.out.println("Your number is greater than the Random Number.");
				} else if (guess == randomNumber){
					System.out.println("You guessed it! The number was " + randomNumber + ".");
					break;
				} else {
					System.out.println("You suck. The number was " + randomNumber);
				}
			}
		}
}
