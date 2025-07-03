package ca.bcit.comp2522.lab05;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Represents a bookstore that manages a collection of novels.
 * Reads data from a file named "bookList.txt" and provides various
 * methods to interact with and analyze the list of books.
 * <p>
 * Format of each line in the file: Title|Author|Year
 * </p>
 *
 * @author Gurvir
 * @version 2025-07-01
 */
public class BookStore
{
    private final String name;
    private final List<Novel> novelList;

    /**
     * Constructs a BookStore with the specified name and reads book data from
     * "bookList.txt".
     *
     * @param name the name of the bookstore
     * @throws FileNotFoundException if the input file cannot be found
     */
    public BookStore(final String name) throws FileNotFoundException
    {
        this.name = name;
        novelList = new ArrayList<>();

        Scanner scanFile;
        Scanner scanLine;

        scanFile = new Scanner(new File("bookList.txt"));
        while (scanFile.hasNextLine())
        {
            scanLine = new Scanner(scanFile.nextLine());
            scanLine.useDelimiter("\\|");
            String novelName;
            String novelAuthor;
            int novelYearPublished;
            while (scanLine.hasNext())
            {
                novelName = scanLine.next();
                novelAuthor = scanLine.next();
                novelYearPublished = scanLine.nextInt();
                novelList.add(
                    new Novel(novelName, novelAuthor, novelYearPublished));
            }
        }

        scanFile.close();
    }

    /**
     * Prints all book titles in uppercase.
     */
    public void printAllTitles()
    {
        for (final Novel novel : novelList)
        {
            System.out.println(novel.getTitle().toUpperCase());
        }
    }

    /**
     * Prints titles that contain the specified substring (case-sensitive).
     *
     * @param title the substring to search for in book titles
     */
    public void printBookTitle(final String title)
    {
        for (final Novel novel : novelList)
        {
            if (novel.getTitle().contains(title))
            {
                System.out.println(novel.getTitle());
            }
        }
    }

    /**
     * Prints all book titles sorted in alphabetical order.
     */
    public void printTitlesInAlphaOrder()
    {
        novelList.sort(null);
        for (final Novel novel : novelList)
        {
            System.out.println(novel.getTitle());
        }
    }

    /**
     * Prints titles of books published within a specified decade.
     *
     * @param decade the starting year of the decade (e.g., 2000 for 2000–2009)
     */
    public void printGroupByDecade(final int decade)
    {
        for (final Novel novel : novelList)
        {
            if (novel.getYearPublished() >= decade &&
                novel.getYearPublished() <= decade + 9)
            {
                System.out.println(novel.getTitle());
            }
        }
    }

    /**
     * Prints the title of the longest book (by character count in title).
     */
    public void getLongest()
    {
        String currentLongest;
        currentLongest = "";
        for (final Novel novel : novelList)
        {
            if (novel.getTitle().length() > currentLongest.length())
            {
                currentLongest = novel.getTitle();
            }
        }
        System.out.println(currentLongest);
    }

    /**
     * Checks whether any book was written in the specified year.
     *
     * @param year the year to check
     * @return true if a book was written in that year; false otherwise
     */
    public boolean isThereABookWrittenBetween(final int year)
    {
        for (final Novel novel : novelList)
        {
            if (novel.getYearPublished() == year)
            {
                return true;
            }
        }
        return false;
    }

    /**
     * Calculates the percentage of books written between two specified years.
     *
     * @param first the starting year (inclusive)
     * @param last  the ending year (inclusive)
     * @return the percentage of books written in the given range
     */
    public double whichPercentWrittenBetween(final int first, final int last)
    {
        int count = 0;
        for (final Novel novel : novelList)
        {
            if (novel.getYearPublished() >= first &&
                novel.getYearPublished() <= last)
            {
                count++;
            }
        }
        return (count / (double) novelList.size()) * 100;
    }

    /**
     * Counts how many books contain a specified word in the title
     * (case-insensitive).
     *
     * @param word the word to search for in the titles
     * @return the number of titles containing the word
     */
    public int howManyBooksContain(final String word)
    {
        int count = 0;
        for (final Novel novel : novelList)
        {
            if (novel.getTitle().toLowerCase().contains(word.toLowerCase()))
            {
                count++;
            }
        }
        return count;
    }

    /**
     * Finds and returns the oldest book in the collection.
     *
     * @return the Novel with the earliest publication year
     */
    public Novel getOldestBook()
    {
        Novel oldestBook;
        int oldestBookYear;

        oldestBook = novelList.getFirst();
        oldestBookYear = oldestBook.getYearPublished();
        for (final Novel novel : novelList)
        {
            if (novel.getYearPublished() < oldestBookYear)
            {
                oldestBookYear = novel.getYearPublished();
                oldestBook = novel;
            }
        }
        return oldestBook;
    }

    /**
     * Returns a list of books with titles of a specific length.
     *
     * @param titleLength the desired title length
     * @return a list of novels with matching title lengths
     */
    public List<Novel> getBooksThisLength(final int titleLength)
    {
        final List<Novel> listOfNovels;
        listOfNovels = new ArrayList<>();
        for (final Novel novel : novelList)
        {
            if (novel.getTitle().length() == titleLength)
            {
                listOfNovels.add(novel);
            }
        }
        return listOfNovels;
    }

    /**
     * Main method to demonstrate and test the BookStore class functionality.
     *
     * @param args command-line arguments (not used)
     * @throws FileNotFoundException if the input file is not found
     */
    public static void main(final String[] args) throws FileNotFoundException
    {
        final BookStore bookstore;
        final Novel oldest;
        final List<Novel> fifteenCharTitles;

        bookstore = new BookStore("Classic Novels Collection");
        System.out.println("All Titles in UPPERCASE:");
        bookstore.printAllTitles();
        System.out.println("\nBook Titles Containing 'the':");
        bookstore.printBookTitle("the");
        System.out.println("\nAll Titles in Alphabetical Order:");
        bookstore.printTitlesInAlphaOrder();
        System.out.println("\nBooks from the 2000s:");
        bookstore.printGroupByDecade(2000);
        System.out.println("\nLongest Book Title:");
        bookstore.getLongest();
        System.out.println("\nIs there a book written in 1950?");
        System.out.println(bookstore.isThereABookWrittenBetween(1950));
        System.out.println("\nHow many books contain 'heart'?");
        System.out.println(bookstore.howManyBooksContain("heart"));
        System.out.println("\nPercentage of books written between 1940 and 1950:");
        System.out.println(bookstore.whichPercentWrittenBetween(1940, 1950) + "%");
        System.out.println("\nOldest book:");
        oldest = bookstore.getOldestBook();
        System.out.println(oldest.getTitle() + " by " + oldest.getAuthorName() + ", " + oldest.getYearPublished());
        System.out.println("\nBooks with titles 15 characters long:");
        fifteenCharTitles = bookstore.getBooksThisLength(15);
        fifteenCharTitles.forEach(novel -> System.out.println(novel.getTitle()));
    }
}
