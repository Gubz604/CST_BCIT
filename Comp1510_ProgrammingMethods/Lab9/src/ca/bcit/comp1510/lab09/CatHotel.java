/**
 * 
 */
package ca.bcit.comp1510.lab09;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * This class creates a Cat Hotel that stores Cat objects in an Array List.
 * There are methods to add a cat to the list, remove all cats from the list, count the number of cats
 * in the list, and print out all the names in the list.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class CatHotel {
	
	private ArrayList<Cat> list;
	private String hotelName;
	
	public CatHotel(String hotelName) {
		list = new ArrayList<Cat>();
	}
	
	public void addCat(Cat cat) {
		list.add(cat);
	}
	
	public void removeAllGuests() {
		list.clear();
	}
	
	public int guestCount() {
		return list.size();
	}
	
	public int removeOldGuests(int num) {
		int numRemovedCats = 0;
		Iterator<Cat> catIterator = list.iterator();
		while (catIterator.hasNext()) {
			Cat temp = catIterator.next();
			if (temp.getAge() > num) {
				catIterator.remove();
				numRemovedCats++;
			}
		}
		return numRemovedCats;
	}
	
	public void printGuestList() {
		for (Cat cat : list) {
			System.out.println(cat);
		}
	}

}
