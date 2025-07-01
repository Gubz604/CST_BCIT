package ca.bcit.comp2522.lab04;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // === 1. Create Authors ===
        Author orwell = new Author(new Name("George", "Orwell"), new Date(1903, 6, 25), "Dystopian");
        Author lee = new Author(new Name("Harper", "Lee"), new Date(1926, 4, 28), "Drama");
        Author austen = new Author(new Name("Jane", "Austen"), new Date(1775, 12, 16), "Romance");
        Author fitzgerald = new Author(new Name("F. Scott", "Fitzgerald"), new Date(1896, 9, 24),"Tragedy");
        Author melville = new Author(new Name("Herman", "Melville"), new Date(1819, 8, 1), "Adventure");

        // === 2. Create Books ===
        List<Book> books = new ArrayList<>();
        books.add(new Book("1984", 1949, orwell));
        books.add(new Book("To Kill a Mockingbird", 1960, lee));
        books.add(new Book("Pride and Prejudice", 1813, austen));
        books.add(new Book("The Great Gatsby", 1925, fitzgerald));
        books.add(new Book("Moby-Dick", 1851, melville));

        // === 3. Create Biographies ===
        List<Biography> bios = new ArrayList<>();
        bios.add(new Biography("The Power Broker", 1974,
                               new Author(new Name("Robert", "Caro"), new Date(1935, 10, 30), "Biography"),
                               new Person(new Name("Robert", "Moses"), new Date(1888, 12, 18), new Date(1981, 7, 29))));
        bios.add(new Biography("Steve Jobs", 2011,
                               new Author(new Name("Walter", "Isaacson"), new Date(1952, 5, 20), "Biography"),
                               new Person(new Name("Steve", "Jobs"), new Date(1955, 2, 24), new Date(2011, 10, 5))));
        bios.add(new Biography("Churchill: A Life", 1991,
                               new Author(new Name("Martin", "Gilbert"), new Date(1936, 10, 25), "History"),
                               new Person(new Name("Winston", "Churchill"), new Date(1874, 11, 30), new Date(1965, 1, 24))));
        bios.add(new Biography("Alexander Hamilton", 2004,
                               new Author(new Name("Ron", "Chernow"), new Date(1949, 3, 3), "Biography"),
                               new Person(new Name("Alexander", "Hamilton"), new Date(1755, 1, 11), new Date(1804, 7, 12))));
        bios.add(new Biography("Einstein: His Life and Universe", 2007,
                               new Author(new Name("Walter", "Isaacson"), new Date(1952, 5, 20), "Biography"),
                               new Person(new Name("Albert", "Einstein"), new Date(1879, 3, 14), new Date(1955, 4, 18))));

        // === 4. Create Autobiographies ===
        List<Autobiography> autos = new ArrayList<>();
        autos.add(new Autobiography("The Diary of a Young Girl", 1947,
                                    new Author(new Name("Anne", "Frank"), new Date(1929, 6, 12), "Memoir")));
        autos.add(new Autobiography("Long Walk to Freedom", 1994,
                                    new Author(new Name("Nelson", "Mandela"), new Date(1918, 7, 18), "Autobiography")));
        autos.add(new Autobiography("The Story of My Experiments with Truth", 1927,
                                    new Author(new Name("Mahatma", "Gandhi"), new Date(1869, 10, 2), "Spiritual")));
        autos.add(new Autobiography("I Know Why the Caged Bird Sings", 1969,
                                    new Author(new Name("Maya", "Angelou"), new Date(1928, 4, 4), "Memoir")));
        autos.add(new Autobiography("Autobiography of Malcolm X", 1965,
                                    new Author(new Name("Malcolm", "X"), new Date(1925, 5, 19), "Civil Rights")));

        // === 5. Comparisons ===
        System.out.println("\nComparing Books:");
        System.out.println(books.get(0).compareTo(books.get(1))); // 1984 vs Mockingbird

        System.out.println("\nComparing Authors:");
        System.out.println(austen.compareTo(orwell)); // Jane Austen vs George Orwell

        System.out.println("\nComparing Biographies (by subject):");
        System.out.println(bios.get(1).equals(bios.get(4))); // Steve Jobs vs Einstein

        // === 6. Use Printable and Reversible ===
        System.out.println("\n-- Printable Books --");
        for (Book book : books) {
            book.display();
        }

        System.out.println("\n-- Reversible Book Titles --");
        for (Book book : books) {
            book.backward();
        }

        System.out.println("\n-- Printable Biographies --");
        for (Biography bio : bios) {
            bio.display();
        }

        System.out.println("\n-- Printable Autobiographies --");
        for (Autobiography auto : autos) {
            auto.display();
        }

        System.out.println("\n-- Reversible Autobiography Titles --");
        for (Autobiography auto : autos) {
            auto.backward();
        }
    }
}
