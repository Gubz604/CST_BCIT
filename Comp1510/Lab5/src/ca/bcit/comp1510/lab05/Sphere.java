/**
 * 
 */
package ca.bcit.comp1510.lab05;

/**
 * This class creates a sphere object that has an x-Coordinate, y-Coordinate, z-Coordinate, and a radius.
 * There is a method to calculate the sphere's surface area and another to calculate the volume.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Sphere {
	
	private double xCoordinate;
	private double yCoordinate;
	private double zCoordinate;
	private double radius;
	
	public Sphere(double xCoordinate, double yCoordinate, double zCoordinate, double radius) {
		this.xCoordinate = xCoordinate;
		this.yCoordinate = yCoordinate;
		this.zCoordinate = zCoordinate;
		this.radius = radius;
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
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double surfaceArea() {
		return 4 * Math.PI * Math.pow(radius, 2);
	}
	
	public double volume() {
		return (4 / 3) * Math.PI * Math.pow(radius, 3);
	}
	
	public String toString() {
		return "x-Coordinate: " + xCoordinate +
				"\ny-Coordinate: " + yCoordinate +
				"\nz-Coordinate: " + zCoordinate +
				"\nRadius: " + radius;
	}

}
