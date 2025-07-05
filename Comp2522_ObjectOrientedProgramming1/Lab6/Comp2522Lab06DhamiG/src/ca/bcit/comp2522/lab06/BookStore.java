package ca.bcit.comp2522.lab06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

/**
 * Represents a generic BookStore that stores various types of literature.
 * I did not come up with any of these classes. The code was given to us to copy
 * and review.
 *
 * @author BCIT
 *
 * @param <T> a type that extends Literature
 */
public class BookStore<T extends Literature> {

    private final List<T> items = new ArrayList<>();

    /**
     * Static nested class that displays BookStore info.
     */
    static class BookStoreInfo {
        /**
         * Displays the name and number of items in the store.
         *
         * @param storeName the name of the store
         * @param itemCount the number of items in the store
         */
        public void displayInfo(String storeName, int itemCount) {
            System.out.println("BookStore: " + storeName + ", Items: " + itemCount);
        }
    }

    /**
     * Inner class to compute statistics about the store's items.
     */
    class NovelStatistics {
        /**
         * Calculates the average length of all titles in the store.
         *
         * @return average title length
         */
        public double averageTitleLength() {
            int totalLength = 0;
            for (T item : items) {
                totalLength += item.getTitle().length();
            }
            return items.isEmpty() ? 0.0 : (double) totalLength / items.size();
        }
    }

    /**
     * Prints all item titles that contain a given substring.
     *
     * @param title the substring to search for in titles
     */
    public void printBookTitle(String title) {
        items.forEach(item -> {
            if (item.getTitle().contains(title)) {
                System.out.println(item.getTitle());
            }
        });
    }

    /**
     * Sorts item titles alphabetically (case-insensitive) and prints them.
     */
    public void printTitlesInAlphaOrder() {
        items.sort(Comparator.comparing(Literature::getTitle, String.CASE_INSENSITIVE_ORDER));
        items.forEach(item -> System.out.println(item.getTitle()));
    }

    /**
     * Adds all Novel items in the store to the provided collection.
     *
     * @param novelCollection a collection accepting Novel or its supertypes
     */
    public void addNovelsToCollection(List<? super Novel> novelCollection) {
        for (T item : items) {
            if (item instanceof Novel) {
                novelCollection.add((Novel) item);
            }
        }
    }

    /**
     * Adds an item to the store.
     *
     * @param item the literature item to add
     */
    public void addItem(T item) {
        items.add(item);
    }

    /**
     * Prints the title of each item in the store.
     */
    public void printItems() {
        for (T item : items) {
            System.out.println(item.getTitle());
        }
    }

    /**
     * Main method to test BookStore features.
     *
     * @param args command-line args (not used)
     */
    public static void main(final String[] args) {
        BookStore<Literature> store = new BookStore<>();

        // Add literature items
        store.addItem(new Novel("War and Peace"));
        store.addItem(new ComicBook("Spider-Man"));
        store.addItem(new Magazine("National Geographic"));
        store.addItem(new Novel("Pride and Prejudice"));
        store.addItem(new Novel("1984"));

        System.out.println("\n=== All Items ===");
        store.printItems();

        System.out.println("\n=== Titles Containing 'and' ===");
        store.printBookTitle("and");

        System.out.println("\n=== Titles in Alphabetical Order ===");
        store.printTitlesInAlphaOrder();

        System.out.println("\n=== BookStore Info ===");
        BookStoreInfo info = new BookStoreInfo();
        info.displayInfo("Downtown BookStore", store.items.size());

        System.out.println("\n=== Average Title Length ===");
        BookStore<Literature>.NovelStatistics stats = store.new NovelStatistics();
        System.out.printf("Average title length: %.2f\n", stats.averageTitleLength());

        System.out.println("\n=== Add Novels to External Collection ===");
        List<Literature> novelCollection = new ArrayList<>();
        store.addNovelsToCollection(novelCollection);
        novelCollection.forEach(novel -> System.out.println("Collected novel: " + novel.getTitle()));
    }
}
