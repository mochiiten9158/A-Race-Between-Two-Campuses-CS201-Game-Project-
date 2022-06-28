//Race Between Two Campuses!
//Game by Team H
// : Ryan Ciminski
// : Olivia Debenedictis
// : Matthew Horowitz
// : Shambhawi Sharma

//importing classes
package projectFinal;
import java.util.Scanner;
import java.util.Random;

//Start of class Game
public class Game {
	
	//Start of method Main
	public static void main(String[] args) {
		int a=0;
		int b=0;
		
		//Outputs Instructions about game
		System.out.println("Thank you for choosing the Play Race Between Two Campuses");
		System.out.println("The game has you race against each other to see who can get from the downtown campus");
		System.out.println("to main campus the fastest");
		System.out.println("This game will ask you repeatedly to decide if you want to play");
		System.out.println("Everytime you press yes, a random number will be drawn for each player, and you will then move by that amound accross the city");
		System.out.println("Making your way to main campuses");
		System.out.println("Whoever gets to the main campus first wins");
		System.out.println("Afterward someone wins, you can play again. In fact, play as many times as you wish!");
		System.out.println("Hope you enjoy!");
		System.out.println(" ");
		System.out.println(" ");
		
		//Instantiate Scanner
		Scanner input=new Scanner(System.in);
		
		//Create two players
		Player player1=new Player("null", 'X', 0, 0, 0);
		Player player2=new Player("null", 'O', 0, 0, 0);
		
		//Begin by taking in name Player 1
		System.out.println("Player 1, please enter your name");
		String name1=input.nextLine();
		player1.setName(name1);
		
		//Take in name Player 2
		System.out.println("Player 2, please enter your name");
		String name2=input.nextLine();
		player2.setName(name2);
		
		//Prompting user to enter if they wish to play
		System.out.println("Would you like to play the game\nEnter yes to play\nEnter no to skip");
		String choice=input.nextLine();
		
		//Start of while loop
		while(choice.equalsIgnoreCase("yes")) {
			
			//Create Gameboard
			GameBoard gameboard1=new GameBoard();
			
			//Create boolean to control while
			boolean inProgress=true;
			
			//Set player initial positions
			player1.setMovementx(0);
			player2.setMovementx(0);
			player1.setMovementy(0);
			player2.setMovementy(0);
			
			//Start of while loop
			while(inProgress) {
				//Prompt user to enter if they wish to make a move
				System.out.println("Would the two of you like to play? Enter Y for Yes, N for No");
				char play=input.nextLine().charAt(0);
				
				//Switch statement 
				switch(play) {
					case 'Y':
					case 'y':
						//if x or y is not in position board[22]. Index 22 is a win
						//gameboard1.printBoard();
						int previousmovea=player1.getMovementy();
						int previousmoveb=player2.getMovementy();
						
						player1.move();
						a=player1.getMovementy();
						player2.move();
						b=player2.getMovementy();
				
						//Start of try catch mechanism
						try {
							if(a>=gameboard1.board.length||b>=gameboard1.board.length) {
								//If player 1 has won
								if(a>=gameboard1.board.length) {
									System.out.println("Congratulations Player 1 " + player1.getName());
									gameboard1.board[22]=player1;
									gameboard1.board[previousmovea]=null;
								}//end of inner if block 
								
								//If player 2 has won
								else if (b>=gameboard1.board.length) {
									System.out.println("Congratulations Player 2 " + player2.getName());
									gameboard1.board[22]=player2;
									gameboard1.board[previousmoveb]=null;
								}//end of inner if block
							}//end of outer if block
				
							//If nobody has won yet
							else {
								gameboard1.board[a]=player1;
								gameboard1.board[previousmovea]=null;
								gameboard1.board[b]=player2;
								gameboard1.board[previousmoveb]=null;
							}
							gameboard1.printBoard();
						}//end of try block
						
						//catch that will handle out of bounds exception
						catch (ArrayIndexOutOfBoundsException aioobe) {
							System.out.println("We have a winner.");
							inProgress=false;
						}//end of catch
						break;
						
					//If a player does not wish to make a move	
					case 'N':
					case 'n':
						inProgress=false;
						break;
					
					//Default case 	
					default:
						inProgress=false;
						break;
				}//end of switch block
			}//end of inner while loop
			
			//Prompting user to enter if they wish to play again
			System.out.println("\n\nWould you like to play the game\nEnter yes to play\nEnter no to skip");
			choice=input.nextLine();
		}//end of outer while loop
		
		//Closing Scanner
		input.close();
		
		//Printing Thank you message
		System.out.println("Thank you for playing!");
	}//end of main
}//end of class
