/**
 * 
 */
package q1;

/**
 * This class creates a Cylinder object with a radius and a height. Methods in this class calculate surface area and 
 * volume.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class Cylinder {
	
	private double radius;
	private double height;
	
	public Cylinder(double radius, double height) {
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
	
	public double surfaceArea() {
		return 2 * Math.PI * radius * (radius + height);
	}
	
	public double volume() {
		return Math.PI * Math.pow(radius, 2) * height;
	}
	
	public String toString() {
		return "Cylinder Radius: " + radius + "\nCylinder Height: " + height;
	}
}
