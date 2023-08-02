package numberguessinggame;

public class Main {
	
	public static void main(String[] args) {
		int randomNumber = RandomNumber.getRandomNumber(1, 100);
		
		var game = new Game();
		
		game.printStartMessage();
		game.playGame(randomNumber);
	}
}
