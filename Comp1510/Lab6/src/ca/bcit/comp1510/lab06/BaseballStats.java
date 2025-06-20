package ca.bcit.comp1510.lab06;

import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

/**
 * Reads baseball data in from a comma delimited file. Each line of the file
 * contains a name followed by a list of symbols indicating the result of each
 * at bat: h for hit, o for out, w for walk, s for sacrifice. Statistics are
 * computed and printed for each player.
 * 
 * @author blink
 *
 */
public class BaseballStats {
	/*
	 * Reads baseball stats from a file and counts total hits, outs, walks, and
	 * sacrifice flies for each player.
	 */
	public static void main(String[] args) throws FileNotFoundException {
		Scanner fileScan;
		Scanner lineScan;
		String fileName;
		Scanner scan = new Scanner(System.in);
		// TODO Read and process each line of the file
		System.out.print("Enter the name of the input file: ");
		fileName = scan.nextLine();
		fileScan = new Scanner(new File(fileName));

		while (fileScan.hasNextLine()) {
			String line = fileScan.nextLine();
			lineScan = new Scanner(line);
			lineScan.useDelimiter(",");

			String playerName = lineScan.next();
			int hit = 0;
			int out = 0;
			int walk = 0;
			int sacFly = 0;
			while (lineScan.hasNext()) {
				String atBat = lineScan.next();
				switch (atBat) {
				case "h":
					hit++;
					break;
				case "o":
					out++;
					break;
				case "w":
					walk++;
					break;
				case "s":
					sacFly++;
				}	
			}
			
			System.out.println(playerName  + " -- hits: " + hit + " outs: " + out + 
					" walks: " + walk + " sacrifice flies: " + sacFly);
		}
		
		fileScan.close();
		scan.close();
	}
}