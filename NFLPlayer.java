/** Program: NFL PLayer Class
* File: NFLPlayerClass.java
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


	

	
