/**
 * 
 */
package ca.bcit.comp1510.lab05;

/**
 * This class creates a cube object with x-Coordinate, y-Coordinate, z-Coordinate, and Edge Length.
 * There are methods to calculate the surface area, volume, face diagonal, and space diagonal.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Cube {
	
	private double xCoordinate;
	private double yCoordinate;
	private double zCoordinate;
	private double edgeLength;
	
	public Cube(double xCoordinate, double yCoordinate, double zCoordinate, double edgeLength) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.zCoordinate = zCoordinate;
		this.edgeLength = edgeLength;
	}
	
	public double getXCoordinate() {
		return xCoordinate;
	}
	
	public void setXCoordinate(double coordinate) {
		xCoordinate = coordinate;
	}
	
	public double getYCoordinate() {
		return yCoordinate;
	}
	
	public void setYCoordinate(double coordinate) {
		yCoordinate = coordinate;
	}
	
	public double getZCoordinate() {
		return zCoordinate;
	}
	
	public void setZCoordinate(double coordinate) {
		zCoordinate = coordinate;
	}
	
	public double getEdgeLength() {
		return edgeLength;
	}
	
	public void setEdgeLength(double length) {
		edgeLength = length;
	}
	
	public double surfaceArea() {
		return 6 * Math.pow(edgeLength, 2);
	}
	
	public double volume() {
		return Math.pow(edgeLength, 3);
	}
	
	public double faceDiagonal() {
		return Math.sqrt(2) * edgeLength;
	}
	
	public double spaceDiagonal() {
		return Math.sqrt(3) * edgeLength;
	}
	
	public String toString() {
		return "x-Coordinate: " + xCoordinate +
				"\ny-Coordinate: " + yCoordinate +
				"\nz-Coordinate: " + zCoordinate +
				"\nEdge Length: " + edgeLength;
	}

}
