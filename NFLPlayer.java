/** Program: NFL PLayer Class
* File: PlayerClass.java
* Summary: NFL Player Class with subclasses OffensivePlayer and Defensive Player
* Author: Eric Roberts
* Date: July 24, 2016 
**/

public abstract class NFLPlayer {
		//player info
		protected String name;
		protected String position;
		protected String team;
		protected int number;
		protected double height;
		protected double weight;
		protected int age;
		protected String College;
		protected int experience;
		
		
		//getters for Player info
		public String getName() {
			return name;
		}
		
		public String getPosition() {
			return position;
		}
		
		public String getTeam() {
			return team;
		}
		
		public int getNumber() {
			return number;
		}
		
		public double getHeight() {
			return height;
		}
		
		public double getWeight() {
			return weight;
		}
		
		public int getAge() {
			return age;
		}
		
		public String getCollege() {
			return College;
		}
		
		public int getExperience() {
			return experience;
		}
		
		//setters for Player info
		public void setName(String playerName) {
			name = playerName;			
		}
		
		public void setPosition(String playerPosition) {
			position = playerPosition;
		}
		
		public void setTeam(String playerTeam) {
			team = playerTeam;
		}
		
		public void setNumber(int playerNumber) {
			number = playerNumber;
		}
		
		public void setHeight(double playerHeight) {
			height = playerHeight;
		}
		
		public void setWeight(double playerWeight) {
			weight = playerWeight;
		}
		
		public void setAge(int playerAge) {
			age = playerAge;
		}
		
		public void setCollege(String playerCollege) {
			College = playerCollege;
		}
		
		public void setExperience(int playerExperience) {
			experience = playerExperience;
		}
		
		NFLPlayer() {
			
		}
		
		NFLPlayer(String name, String position, String team, int number, double height, double weight, int age, String College, int experience) {
			
		}
}

class OffensivePlayer extends NFLPlayer  {
	
	//data fields
	private int touchDowns;
	private int interceptions;
	private double yards;			 
	private double rating;
	private int carries;				
	private double rushAverageYards;
	private int receptions;
	private double receptionAverageYards;
	
	//constructor
	public OffensivePlayer(String name, String position, String team, int number, double height, double weight, int age, String College, int experience, int touchDowns, int interceptions, double yards, double rating, int carries, double rushAverageYards, int receptions, double receptionAverageYards) {
		this.name = name;
		this.position = position;
		this.team = team;
		this.number = number;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.College = College;
		this.experience = experience;
		this.touchDowns = touchDowns;
		this.interceptions = interceptions;
		this.yards = yards;
		this.rating = rating;
		this.carries = carries;
		this.rushAverageYards = rushAverageYards;
		this.receptions = receptions;
		this.receptionAverageYards = receptionAverageYards;
	}
	
	//getters
	public int getTouchDowns() {
		return touchDowns;
	}
	
	public int getInterceptions() {
		return interceptions;
	}
	
	public double getYards() {
		return yards;
	}
	
	public double getRating() {
		return rating;
	}
	
	public int getCarries() {
		return carries;
	}
	
	public double getRushAverageYards() {
		return rushAverageYards;
	}
	
	public int getReceptions() {
		return receptions;
	}
	
	public double getReceptionAverageYards() {
		return receptionAverageYards;
	}
	
	//setters
	public void setTouchDowns(int playerTouchDowns) {
		touchDowns = playerTouchDowns;
	}
	
	public void setInterceptions(int playerInterceptions) {
		interceptions = playerInterceptions;
	}
	
	public void setYards(double playerYards) {
		yards = playerYards;
	}
	
	public void setRating(double playerRating) {
		rating = playerRating;
	}
	
	public void setCarries(int playerCarries) {
		carries = playerCarries;
	}
	
	public void setRushAverageYards(double playerRushAverageYards) {
		rushAverageYards = playerRushAverageYards;
	}
	
	public void setReceptions(int playerReceptions) {
		receptions = playerReceptions;
	}
	
	public void setReceptionsAverageYards(double playerRecptionsAverageYards) {
		receptionAverageYards = playerRecptionsAverageYards;
	}
	
class DefensePlayer extends NFLPlayer {
	private double tackels;
	private double sacks;
	private int forcedFumbles;
	
	public DefensePlayer() {
		
	}
	
	public DefensePlayer(String name, String position, String team, int number, double height, double weight, int age, String College, int experience, double tackels, double sacks, int forcedFumbles) {
		this.name = name;
		this.position = position;
		this.team = team;
		this.number = number;
		this.height = height;
		this.weight = weight;
		this.age = age;
		this.College = College;
		this.experience = experience;
		this.tackels = tackels;
		this.sacks = sacks;
		this.forcedFumbles = forcedFumbles;
		
	}
	
	//getters
	public double getSacks() {
		return sacks;
	}
	
	public double getTackels() {
		return tackels;
	}
	
	public int getForcedFumbles() {
		return forcedFumbles;
	}
	
	//setters
	public void setTackels(double playerTackels) {
		tackels = playerTackels;
	}
	
	public void setSacks(double playerSacks) {
		sacks = playerSacks;
	}
	
	public void setForcedFumbles(int playerForcedFumbles) {
		forcedFumbles = playerForcedFumbles;
	}
}
}
	
