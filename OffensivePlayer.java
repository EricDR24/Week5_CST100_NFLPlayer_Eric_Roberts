/** Program: NFL PLayer Class
* File: OffensivePlayerClass.java
* Summary: NFL Player Class with subclasses OffensivePlayer and DefensivePlayer
* Author: Eric Roberts
* Date: July 24, 2016 
**/
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
	
	public OffensivePlayer() {
		
	}
	
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
}