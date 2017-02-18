import java.util.Arrays;
public class NFLPlayer {

	public static void main(String[] args) {
		
		Player NFLPlayer = new Player();//creates a new player object
	}

}

class Player{
	byte profilepic;//Displays the profile picture of the player
	String name;//Displays the name of the player
	private char DateofBirthandAddress ; //Displays the Date of birth/address
	private int Age ; //Displays the current age of the player
	double Height ;//Displays the height of the player
	double Weight ;// Displays the weight of the player in pounds
	int Yards ;// Displays the yards
	double Ratings ;// Defines the ratings of the player 
	int Touchdowns ; //Displays the number of touch downs of the player
	int INT ; //Number of interceptions when an opposite player takes away the ball
	int Seasons; //Number of seasons played
	

public Player() {

	      
		
	}
		
		public double getheight(){
			return Height;
					
		}
		
		public double getWeight(){
			return Weight;
				
	}
		public int getYards(){
			return Yards;
			
}
	    public double getRatings(){
	    	return Ratings;
	    	
	    }
	     public int getINT(){
	    	 return INT;
	    	 
	     }
	     public int getTouchdowns(){
	    	 return Touchdowns;
	    	 
	     }
	     
          public int getSeasons(){
        	  return Seasons;
        	  
          }
	

	}
class PlayerManager{
	Player[] playerlist = new Player[10];// The list will contain ten players
	byte[] profilepic = new byte [10];
	String[] name = new String[10];
	private char[] DateofBirthandAddress = new char [10]; 
	private int[] Age = new int [10]; 
	double[] Height = new double[10]; 
	double[] Weight = new double [10]; 
	int[] Yards = new int [10];
	double[] Ratings = new double [10];
	int[] Touchdowns = new int [10];
	int[] INT = new int [10];
	int[] seasons = new int [10];
	
	


}














