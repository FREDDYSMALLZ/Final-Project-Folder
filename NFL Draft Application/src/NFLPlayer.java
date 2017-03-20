import java.util.Arrays;
public abstract class NFLPlayer {

	public static void main(String[] args) {
		player player = new player();//creates a new player object
		String name;//Displays the name of the player
		int dateofBirth ;//Displays the date of birth of the player
		int age;//Displays the age of the player
		double height;//Displays the height of the player
		double weight;// Displays the weight of the player in pounds
		int yards ;// Displays the yards
		double ratings;// Defines the ratings of the player 
		int touchdowns; //Displays the number of touch downs of the player
		int interception ;
		int seasons;
		
		
		}
	
	}
	

	class player{
		
		
		String name;//Displays the name of the player
		int  dateofBirth ; //Displays the Date of birth/address
		int age ; //Displays the current age of the player
		double height ;//Displays the height of the player
		double weight ;// Displays the weight of the player in pounds
		int yards ;// Displays the yards
		double ratings ;// Defines the ratings of the player 
		int touchdowns ; //Displays the number of touch downs of the player
		int interception ; //Number of interceptions when an opposite player takes away the ball
		int seasons; //Number of seasons played
		

	public player(String name, int dateofBirth, int age, int weight, int height, int yards, 
			double ratings, int touchdowns,int interception, int seasons) {
		setname(name);
		setDateofBirth(dateofBirth);
		setAge(age);
		setHeight(height);
		setWeight(weight);
		setYards(yards);
		setRatings(ratings);
		setTouchdowns(touchdowns);
		setInterception(interception);
		setSeasons(seasons);

		}
	      public player() {
	}
		public void setname(String newname){
	    	  this.name = newname;
	      }
	      public void setDateofBirth(int newDateofBirth){
	    	  this.dateofBirth= newDateofBirth;
	    	  
	      }
		  public void setAge(int newAge){
			  this.age = newAge;
			  
		  }
	    	 public void setHeight(double newHeight){
	    		 height = newHeight;
	    	 }
	    	 public void setWeight(double newWeight){
	    		 weight = newWeight;
	        	  
	          }
		      public void setYards(int newYards){
		    	  yards = newYards;
		      }
              public void setRatings(double newRatings){
            	  ratings = newRatings;
              }
              public void setTouchdowns(int newTouchdowns){
            	  touchdowns = newTouchdowns;
              }
              public void setInterception(int newInterception){
            	  interception = newInterception;
              }
              public void setSeasons(int newSeasons){
            	  seasons = newSeasons;
              }
              public  String getname(){
                  return name;
              }
              public int getDateofBirth(){
            	  return dateofBirth;
              }
              public int getAge(){
            	  return age;
              }
              public double getHeight(){
            	  return height;
              }
              public double getWeight(){
            	  return weight;
              }
              public int getYards(){
            	  return yards;
              }
              public double getRatings(){
            	  return ratings;
              }
              public int getTouchdowns(){
            	  return touchdowns;
              }
              public int getInterception(){
            	  return interception;
              }
              public int getSeasons(){
            	  return seasons;
              }
              
	}
                  
		
	class PlayerManager{
		player[] playerlist = new player[10];// The list will contain ten players
		String[] name = new String[10];
		int [] dateofBirth= new int[10]; 
		int[] age = new int [10]; 
		double[] height = new double[10]; 
		double[] weight = new double [10]; 
		int[] yards = new int [10];
		double[] ratings = new double [10];
		int[] touchdowns = new int [10];
		int[] interception = new int [10];
		int[] seasons = new int [10]; {
	
	
		
		 for (int i = 0; i < dateofBirth.length; i++){
			 System.out.println(dateofBirth[i] + " ");
		 }
		 for (int i = 0; i < age.length; i++){
			 System.out.println(age[i] + " ");
		 }
		 for (int i = 0; i < yards.length; i++){
			 System.out.println(yards[i] + " ");
		 }
		 for (int i = 0; i < interception.length; i++){
			 System.out.println(interception[i] + " ");
		 }
		 for (int i = 0; i < seasons.length; i++){
			 System.out.println(seasons[i] + " ");
		 }
		 for (int i = 0; i < height.length; i++){
			 System.out.println(height[i] + " ");
		 }
		 for (int i = 0; i < weight.length; i++){
			 System.out.println(weight[i] + " ");

		 
	
	}
	class offensivePlayer extends NFLPlayer{
		public int touchdowns = 1;
		  public  int yards = 2;
		  
		 
		  @Override
		  public String toString(){
			  return "offensivePlayer";
		  }
		  public void setYards( int newYads){
	    	  yards = newYads;
		  }
		  public void setTouchdowns(int newTouchdowns){
        	  touchdowns = newTouchdowns;
		  }
		  public int getYards(){
        	  return yards;
		  }
		  public int getTouchdowns(){
        	  return touchdowns;
		  }
		 }
	class defensivePlayer extends NFLPlayer{
		public int interception = 1;
		public  int tackles = 2;
		
		@Override
		  public String toString(){
			  return "deffensivePlayer";
		  }
		public void setInterception( int newInterception){
	    	  interception = newInterception;
		  }
		  public void settackles(int newTackles){
      	  tackles = newTackles;
		  }
		  public int interception(){
      	  return interception;
		  }
		  public int gettackles(){
      	  return tackles;
      	  
		  }
			
	}
 

	}


class deffensivePlayer implements Celebrator {

	public deffensivePlayer() {
	}

	public void dancing() {

	}

	public void sliding() {

	}

	public void Hugging() {
		
	}

	public void knockingHeads() {
	
	}

	public void Running() {
		
	}
}
	}




	














