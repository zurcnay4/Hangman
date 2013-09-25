package player;

import machine.Machine;

public class Player{
	private String username;
	private char[] guess;
	private int tries;

	public Player(String username) {
		this.username = username;
	}

	public String getUsername() {
		return this.username;
	}
	
	public char[] getGuess() {
		return guess;
	}
	public void setGuess(char[] guess) {
		this.guess = guess;
	}

	public int getTries() {
		return tries;
	}
	public void setTries(int tries) {
		this.tries = tries;
	}
	
	/**
	 * Initialize Player Guess
	 */
	public void initGuess(Machine machine) {
		char[] arrGuess = new char[machine.getAnswer().length()];
		for (int x = 0; x < machine.getAnswer().length(); x++) {
			arrGuess[x] = 95;
		}
		setGuess(arrGuess);
	}
	
	public String getGuessAsString() {
		return String.valueOf(this.guess);
	}
	
	
	
	
}
