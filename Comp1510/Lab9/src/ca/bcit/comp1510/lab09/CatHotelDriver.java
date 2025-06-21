/**
 * 
 */
package ca.bcit.comp1510.lab09;

/**
 * This class creates Cats objects and a Cat Hotel object and places the cats into the Cat Hotel.
 * This class tests the various methods of the Cat Hotel.
 * 
 * @author Gurvir Dhami
 * @version 1.0
 * 
 */
public class CatHotelDriver {

	/**
	 * Drives the program.
	 * 
	 * @param args unused
	 */
	public static void main(String[] args) {
		
		Cat cat1 = new Cat("Charlie", 3);
		Cat cat2 = new Cat("Gubzy", 7);
		Cat cat3 = new Cat("Wubzy", 2);
		Cat cat4 = new Cat("Humsay", 9);
		Cat cat5 = new Cat("Dumsay", 1);
		
		CatHotel hotel = new CatHotel("The Cat Hotel");
		
		hotel.addCat(cat1);
		hotel.addCat(cat2);
		hotel.addCat(cat3);
		hotel.addCat(cat4);
		hotel.addCat(cat5);
		
		System.out.println("There are " + hotel.guestCount() + " cats in the hotel");
		
		System.out.println("Let's remove all cats older than 6 years");
		hotel.removeOldGuests(6);
		System.out.println("There are now " + hotel.guestCount() + " cats in the hotel");
		hotel.printGuestList();
		
		System.out.println("Let's remove all guests from the list");
		hotel.removeAllGuests();
		System.out.println("There are now " + hotel.guestCount() + " cats in the hotel");
		
	}

}
