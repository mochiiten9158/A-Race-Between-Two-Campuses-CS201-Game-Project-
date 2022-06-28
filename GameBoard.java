//Class that initializes Gameboard

package projectFinal;
public class GameBoard {
	
	public GameBoard(){
		this.board=new Player[23];
		this.turn=turn;
	}
	
	public Player[] getBoard() {
		return board;
	}
	
	public void setBoard(Player[] board) {
		this.board=board;
	}
	
	public String getTurn() {
		return turn;
	}
	
	public void setTurn(String turn) {
		this.turn=turn;
	}

	static Player[] board;
	static String turn;
	        
    // To print out the board. 
	static void printBoard() 
	{ 
	    System.out.println("\n|------------------|IIT Mies|\n"); 
	    System.out.println("|  " + board[19] + " | "
	                       + board[20] + " | " + board[21] +
	                       "  | " + board[22] +
	                       " |" + "Finish"); 
	    
	    System.out.println("\n|-------STATE STREET--------|\n"); 
	    System.out.println("|  " + board[18] + " |  "
                			+ board[17] + " |  " + board[16] +
                			" | " + board[15] +
                			" | " + board[14] + " | "); 
	    
	    System.out.println("\n|~~~~~~~CHICAGO RIVER~~~~~~~|\n"); 
	    System.out.println("| " + board[9] + " | "
    						+ board[10] + " | " + board[11] +
    						"  |  " + board[12] +
    						"  |  " + board[13] + "|");
	    
	    System.out.println("\n|--------MICHIGAN AVE-------|\n"); 
	    System.out.println("|  " + board[8] + "  |  "
							+ board[7] + "  |  " + board[6] +
							" |  " + board[5] +
							" |  " + board[4] + "  |  "); 
		    
	    System.out.println("\n|--------CLARK STREET-------|\n"); 
	    System.out.println("Start" + "  |  " + board[0] + "  |  "
							+ board[1] + " | " + board[2] +
							"  |  " + board[3] +
							" | "); 
	    
	    System.out.println("\n|Downtown |-----------------|\n  Campus"); 
	}//end of print board method 	
}//end of class
