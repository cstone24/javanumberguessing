package numberguessinggame;
import java.util.Scanner;
public class numberguessinggame {
	
	public static void main(String[] args) {
		Scanner myObj = new Scanner(System.in);
		int min = 0;
		int max = 100;
		int random = (int)Math.floor(Math.random() * (max - min + 1) + min);
		int guess = 0;
		int numguess = 5;
		
	System.out.println("I have thought of a random number between " + min + "-" + max +". You have " + numguess + " guesses. Good luck!");
		
	for (int i=0; i<numguess; i++) {	
			System.out.print("Your Guess: ");
			guess = myObj.nextInt();
			if (guess < random && i!=4) {
				System.out.println("Your number is less than the Random Number.");
			} else if (guess > random && i!=4) {
				System.out.println("Your number is greater than the Random Number.");
			} else if (guess == random){
				System.out.println("You guessed it! The number was " + random + ".");
				break;
			} else {
				System.out.println("You suck. The number was " + random);
			}
		}
	}
}
