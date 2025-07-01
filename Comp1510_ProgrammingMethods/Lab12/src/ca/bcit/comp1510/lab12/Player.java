/**
 * 
 */
package ca.bcit.comp1510.lab12;

import java.util.Objects;

/**
 * This class creates a Player object that has methods to compare players based on jersey number as well as determine if 
 * two players being compared using the equals method are the same player or not.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Player implements Comparable<Player>{
	
	private final String name;
	private final String teamName;
	private final int jerseyNumber;
	
	public Player(String name, String teamName, int jerseyNumber) {
		
		if (name.isBlank() || name.isEmpty()) {
			throw new IllegalArgumentException("Name cannot be empty or blank");
		}
		if (teamName.isBlank() || teamName.isEmpty()) {
			throw new IllegalArgumentException("Team Name cannot be empty or blank");
		}
		if (jerseyNumber <= 0) {
			throw new IllegalArgumentException("Jersey number cannot be Zero or Negative");
		}
		this.name = name;
		this.teamName = teamName;
		this.jerseyNumber = jerseyNumber;
	}
	
	public int getJerseyNumber() {
		return jerseyNumber;
	}

	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;

	    Player other = (Player) obj;

	    return jerseyNumber == other.jerseyNumber &&
	           Objects.equals(name, other.name) &&
	           Objects.equals(teamName, other.teamName);
	}
	
	@Override
	public int hashCode() {
	    return Objects.hash(name, teamName, jerseyNumber);
	}

	
	public String toString() {
		return name + "\n" + teamName + "\nJersey Number: " + jerseyNumber;
	}

	@Override
	public int compareTo(Player o) {
		return Integer.compare(this.jerseyNumber, o.getJerseyNumber());
	}
	
	

}
