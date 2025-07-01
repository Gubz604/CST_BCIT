/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.Random;

/**
 * This class creates a Random Walker object that can simulate random movements within four directions:
 * Up, Down, Left, and Right based on a coordinate grid system. The random walker is bound using a boundary and can only move
 * a certain number of steps as determined by the maxSteps instance variable.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class RandomWalker {

	private int xCoordinate;
	private int yCoordinate;
	private int maxSteps;
	private int stepsTaken;
	private int  boundary;
	private int maximumDistance;
	
	public RandomWalker(int maxSteps, int boundary) {
		this.maxSteps = maxSteps;
		this.boundary = boundary;
		
		this.xCoordinate = 0;
		this.yCoordinate = 0;
		this.stepsTaken =0;
		this.maximumDistance = 0;
	}
	
	public RandomWalker(int maxSteps, int boundary, int xCoordinate, int yCoordinate) {
		this(maxSteps, boundary);
		
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.stepsTaken = 0;
		this.maximumDistance = 0;
	}
	
	public void takeStep() {
		Random rand = new Random();
		
		int step = rand.nextInt(4);
		switch (step) {
		case 0:
			yCoordinate++;
			stepsTaken++;
			maximumDistance = max(xCoordinate, yCoordinate);
			break;
		case 1:
			yCoordinate--;
			stepsTaken++;
			maximumDistance = max(xCoordinate, yCoordinate);
			break;
		case 2:
			xCoordinate++;
			stepsTaken++;
			maximumDistance = max(xCoordinate, yCoordinate);
			break;
		case 3:
			xCoordinate--;
			stepsTaken++;
			maximumDistance = max(xCoordinate, yCoordinate);
			break;
		}
		
	}
	
	public int getXCoordinate() {
		return xCoordinate;
	}
	
	public int getYCoordinate() {
		return yCoordinate;
	}
	
	public int getMaximumDistance() {
		return maximumDistance;
	}
	
	private int max(int a, int b) {
		if (Math.abs(a) > Math.abs(b)) {
			return Math.abs(a);
		} else {
			return Math.abs(b);
		}
	}
	
	public boolean moreSteps() {
		if (stepsTaken < maxSteps) return true;
		else return false;
	}
	
	public boolean inBounds() {
		if (Math.abs(xCoordinate) <= boundary && Math.abs(yCoordinate) <= boundary) {
			return true;
		} else return false;
	}
	
	public void walk() {
		while (stepsTaken < maxSteps && inBounds()) {
			takeStep();
			System.out.println(this);
		}
	}
	
	public String toString() {
		return "x-Coordinate: " + xCoordinate +
				"\ny-Coordinate:" + yCoordinate +
				"\nSteps Taken: " + stepsTaken;
	}
}
