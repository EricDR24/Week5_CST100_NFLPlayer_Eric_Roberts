/** Program: NFL PLayer Class
* File: DefensivePlayerClass.java
* Summary: NFL Player Class with subclasses OffensivePlayer and DefensivePlayer
* Author: Eric Roberts
* Date: July 24, 2016 
**/
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

