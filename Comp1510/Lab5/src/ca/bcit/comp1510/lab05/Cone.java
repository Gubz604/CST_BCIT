/**
 * 
 */
package ca.bcit.comp1510.lab05;

/**
 * This class creates a Cone object with a radius and height.
 * There are methods for calculating volume, slant height, and surface area.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Cone {
	
	private double radius;
	private double height;
	
	public Cone(double radius, double height) {
		this.radius = radius;
		this.height = height;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double getHeight() {
		return height;
	}
	
	public void setHeight(double newHeight) {
		height = newHeight;
	}
	
	public double volume() {
		return (Math.PI * Math.pow(radius, 2) * height) / 3;
	}
	
	public double slantHeight() {
		return Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
	}
	
	public double surfaceArea() {
		return Math.PI * Math.pow(radius, 2) +
				Math.PI * radius * Math.sqrt(Math.pow(radius, 2) + Math.pow(height, 2));
	}
	
	public String toString() {
		return "Radius: " + radius + "\nHeight: " + height;
	}

}
