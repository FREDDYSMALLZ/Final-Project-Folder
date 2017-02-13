
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


