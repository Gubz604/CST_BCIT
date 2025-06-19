/**
 * 
 */
package ca.bcit.comp1510.lab05;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * 
 */
public class GeometryDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double sphereX;
		double sphereY;
		double sphereZ;
		double sphereRad;
		
		double cubeX;
		double cubeY;
		double cubeZ;
		double cubeEdge;
		
		double coneRad;
		double coneHeight;
		
		System.out.println("Enter the x, y, and z-coordinates as well as the radius for a sphere: ");
		sphereX = scanner.nextDouble();
		sphereY = scanner.nextDouble();
		sphereZ = scanner.nextDouble();
		sphereRad = scanner.nextDouble();
		
		System.out.println("Enter the x, y, and z-coordinates as well as the edge length for a cube: ");
		cubeX = scanner.nextDouble();
		cubeY = scanner.nextDouble();
		cubeZ = scanner.nextDouble();
		cubeEdge = scanner.nextDouble();
		
		System.out.println("Enter the radius and height for a cone: ");
		coneRad = scanner.nextDouble();
		coneHeight = scanner.nextDouble();
		
		Sphere sphere = new Sphere(sphereX, sphereY, sphereZ, sphereRad);
		Cube cube = new Cube(cubeX, cubeY, cubeZ, cubeEdge);
		Cone cone = new Cone(coneRad, coneHeight);
		
		DecimalFormat df = new DecimalFormat("#.###");
		
		System.out.println("Sphere surface area: " + df.format(sphere.surfaceArea()));
		System.out.println("Sphere volume: " + df.format(sphere.volume()));
		
		System.out.println("Cube surface area: " + df.format(cube.surfaceArea()));
		System.out.println("Cube volume: " + df.format(cube.volume()));
		System.out.println("Cube face diagonal: " + df.format(cube.faceDiagonal()));
		System.out.println("Cube space diagonal: " + df.format(cube.spaceDiagonal()));
		
		System.out.println("Cone volume: " + df.format(cone.volume()));
		System.out.println("Cone slant height: " + df.format(cone.slantHeight()));
		System.out.println("Cone surface area: " + df.format(cone.surfaceArea()));

	}

}
