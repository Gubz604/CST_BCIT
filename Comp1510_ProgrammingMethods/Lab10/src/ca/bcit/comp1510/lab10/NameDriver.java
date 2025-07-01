/**
 * 
 */
package ca.bcit.comp1510.lab10;

import java.util.ArrayList;

/**
 * 
 */
public class NameDriver {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Name> list = new ArrayList<>();
		
		Name name1 = new Name("Gurvir", "Singh", "Dhami");
		Name name2 = new Name("Gubzy", "Wubzy");
		Name name3 = new Name("Darryl", "Leeroy", "Jenkins");
		
		list.add(name1);
		list.add(name2);
		list.add(name3);
		
		list.sort(null);
		
		for (Name name : list) {
			System.out.println(name);
		}

	}

}
