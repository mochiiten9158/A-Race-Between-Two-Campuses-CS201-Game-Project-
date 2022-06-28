//Class that initializes player
package projectFinal;
import java.util.Random;
public class Player {

	//Declare instance variables
	private String name;
	private char playerLetter;
	private int tally;
	private int movementx;
	private int movementy;
	public int max=5;
	public int min=0;



	//Default Constructor
	public Player() {
		name=" ";
		playerLetter=' ';
		tally=0;
		movementx=0;
		movementy=0;
	}//end of constructor 

	//Parameterized constructor
	public Player(String name, char playerLetter, int tally, int movementx, int movementy) {
		this.name=name;
		this.playerLetter=playerLetter;
		this.tally=tally;
		//Movement X is delta movement
		this.movementx=movementx;
		//Movement y stores previous movement
		this.movementy=movementy;
	}//end of constructor


	//Getters
	public String getName() {
		return this.name;
	}
	
	public char getPlayerLetter() {
		return this.playerLetter;
	}

	public int getTally() {
		return this.tally;
	}
	
	public int getMovementx() {
		return this.movementx;
	}
	
	public int getMovementy() {
		return this.movementy;
	}

	
	//Setters
	public void setName(String name) {
		this.name=name;
	}
	
	public void setPlayerLetter(char playerLetter) {
		this.playerLetter=playerLetter;
	}
	
	public void setTally(int tally) {
		this.tally=tally;
	}
	
	public void setMovementx(int movementx) {
		this.movementx=movementx;
	}
	
	public void setMovementy(int movementy) {
		this.movementy=movementy;
	}

	
	//Declare object of class random
	Random rand=new Random();
	//Method that generates random number
	//Horizontal Random
	public int randomNumberGeneratorx(int min, int max) {
		return rand.nextInt(max-min)+min;
	}

	//Move Player
	public void move () {
		int movecall=randomNumberGeneratorx(min, max);
		setMovementx(movecall);
		movementy=getMovementx()+getMovementy();
		//setMovementx(movementx);
		//movementy=movementx;
		//int i=0;
		setMovementy(movementy);
	}
	
	public String toString() {
		return getPlayerLetter()+ " ";
	}
}//end of class
