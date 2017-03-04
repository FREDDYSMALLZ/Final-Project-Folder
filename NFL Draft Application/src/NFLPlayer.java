import java.util.Arrays;
public class NFLPlayer {

	public static void main(String[] args) {
		player player = new player();//creates a new player object
		String name;//Displays the name of the player
		int DateofBirth ;//Displays the date of birth of the player
		int Age;//Displays the age of the player
		double Height;//Displays the height of the player
		double Weight;// Displays the weight of the player in pounds
		int Yards ;// Displays the yards
		double Ratings;// Defines the ratings of the player 
		int Touchdowns; //Displays the number of touch downs of the player
		int Interception ;
		int Seasons;
		
		
		}
	
	}
	

	class player{
		
		
		String name;//Displays the name of the player
		int  DateofBirth ; //Displays the Date of birth/address
		int Age ; //Displays the current age of the player
		double Height ;//Displays the height of the player
		double Weight ;// Displays the weight of the player in pounds
		int Yards ;// Displays the yards
		double Ratings ;// Defines the ratings of the player 
		int Touchdowns ; //Displays the number of touch downs of the player
		int Interception ; //Number of interceptions when an opposite player takes away the ball
		int Seasons; //Number of seasons played
		

	public player(String name, int DateofBirth, int Age, int weight, int Height, int Yards, 
			double Ratings, int Touchdwns,int interception, int Seasons) {
		setname(name);
		setDateofBirth(DateofBirth);
		setAge(Age);
		setHeight(Height);
		setWeight(Weight);
		setYards(Yards);
		setRatings(Ratings);
		setTouchdowns(Touchdowns);
		setInterception(Interception);
		setSeasons(Seasons);

		}
	      public player() {
	}
		public void setname(String newname){
	    	  name = newname;
	      }
	      public void setDateofBirth(int newDateofBirth){
	    	  DateofBirth = newDateofBirth;
	    	  
	      }
		  public void setAge(int newAge){
			  Age = newAge;
			  
		  }
	    	 public void setHeight(double newHeight){
	    		 Height = newHeight;
	    	 }
	    	 public void setWeight(double newWeight){
	    		 Weight = newWeight;
	        	  
	          }
		      public void setYards(int newYards){
		    	  Yards = newYards;
		      }
              public void setRatings(double newRatings){
            	  Ratings = newRatings;
              }
              public void setTouchdowns(int newTouchdowns){
            	  Touchdowns = newTouchdowns;
              }
              public void setInterception(int newInterception){
            	  Interception = newInterception;
              }
              public void setSeasons(int newSeasons){
            	  Seasons = newSeasons;
              }
              public  String getname(){
                  return name;
              }
              public int getDateofBirth(){
            	  return DateofBirth;
              }
              public int getAge(){
            	  return Age;
              }
              public double getHeight(){
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
              public int getTouchdowns(){
            	  return Touchdowns;
              }
              public int getInterception(){
            	  return Interception;
              }
              public int getSeasons(){
            	  return Seasons;
              }
              
	}
                  
		
	class PlayerManager{
		player[] playerlist = new player[10];// The list will contain ten players
		String[] name = new String[10];
		int [] DateofBirth= new int[10]; 
		int[] Age = new int [10]; 
		double[] Height = new double[10]; 
		double[] Weight = new double [10]; 
		int[] Yards = new int [10];
		double[] Ratings = new double [10];
		int[] Touchdowns = new int [10];
		int[] Interception = new int [10];
		int[] seasons = new int [10];
	
	}
	class OffensivePlayer extends player{
		public static int Touchdowns = 1;
		  public static  int Yards = 2;
		  
		 
		  @Override
		  public String toString(){
			  return "OffensivePlayer";
		  }
		  public void setYards( int newYads){
	    	  Yards = newYads;
		  }
		  public void setTouchdowns(int newTouchdowns){
        	  Touchdowns = newTouchdowns;
		  }
		  public int getYards(){
        	  return Yards;
		  }
		  public int getTouchdowns(){
        	  return Touchdowns;
		  }
		 }
	class DefensivePlayer extends player{
		public int Interception = 1;
		public  int Tackles = 2;
		
		@Override
		  public String toString(){
			  return "DeffensivePlayer";
		  }
		public void setInterception( int newInterception){
	    	  Interception = newInterception;
		  }
		  public void setTackles(int newTackles){
      	  Tackles = newTackles;
		  }
		  public int Interception(){
      	  return Interception;
		  }
		  public int getTackles(){
      	  return Tackles;
      	  
		  }
			
	}
	
	
	
	

	
	

	

	














