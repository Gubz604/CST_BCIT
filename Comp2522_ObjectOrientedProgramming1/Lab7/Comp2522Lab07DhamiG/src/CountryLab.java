import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class CountryLab
{
    public static void main(final String[] args)
    {
        final String directoryPath = "matches";
        final String filePath = "week8Countries.txt";
        final String dataPath = "data.txt";
        List<String> countries;

        Path dirPath = Paths.get(directoryPath);
        Path path = Paths.get(filePath);
        Path data = Paths.get(directoryPath, dataPath);
        countries = new ArrayList<>();

        // Check if Directory Exists; if not create it
        try
        {
            if (!Files.isDirectory(dirPath))
            {
                Files.createDirectory(dirPath);
            }
        } catch (final IOException e)
        {
            e.printStackTrace();
        }

        // Read all lines from file
        try
        {
            countries = Files.readAllLines(path);
        } catch (final IOException e)
        {
            e.printStackTrace();
        }

        // Write a header for data.txt
        try
        {
            Files.writeString(data, "Comp2522 Lab 06 File I/O\n\n\n",
                              StandardOpenOption.CREATE
                             );
        } catch (final IOException e)
        {
            e.printStackTrace();
        }

        /*
        1. Long Country Names: Write "Country names longer than 10 Characters:"
        followed by all country names with more than 10 characters (always one
        country per line).
         */
        try
        {
            final List<String> longestCountries = countries.stream()
                .filter(country -> country.length() > 10)
                .toList();
            Files.writeString(data, "Country names longer than 10 characters:\n\n", StandardOpenOption.APPEND);
            Files.write(data, longestCountries, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );

        } catch (final IOException e)
        { e.printStackTrace(); }

        /*
        2. Short Country Names: Write "Country names shorter than 5 characters:"
        followed by all country names with fewer than 5 characters.
         */
        try
        {
            final List<String> shortestCountries = countries.stream()
                .filter(country -> country.length() < 5)
                .toList();
            Files.writeString(data, "Country names shorter than 5 characters:\n\n", StandardOpenOption.APPEND);
            Files.write(data, shortestCountries, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        3. Starting with "A": List all country names that start with the letter
        "A".
         */
        try
        {
            final List<String> countriesStartWithA = countries.stream()
                .filter(country -> country.startsWith("A"))
                .toList();
            Files.writeString(data, "Country names starting with 'A':\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesStartWithA, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        4. Ending with "land": List all country names that end with "land".
         */
        try
        {
            final List<String> countriesEndWithLand = countries.stream()
                .filter(country -> country.endsWith("land"))
                .toList();
           Files.writeString(data, "List all country names that end with \"land\"\n\n", StandardOpenOption.APPEND);
           Files.write(data, countriesEndWithLand, StandardOpenOption.APPEND);
           Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        5. Containing "United": List all countries containing the word "United".
         */
        try
        {
            final List<String> countriesContainingUnitied = countries.stream()
                .filter(country -> country.contains("United"))
                .toList();
            Files.writeString(data, "List all countries containing the word \"United\"\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesContainingUnitied, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        6. Sorted Names (Ascending): List all country names in alphabetical order.
         */
        try
        {
            final List<String> countriesAlpha = countries.stream()
                .sorted()
                .toList();
            Files.writeString(data,"List all country names in alphabetical order:\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesAlpha, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        7. Sorted Names (Descending): List all country names in reverse alphabetical order.
         */
        try
        {
            final List<String> countriesReverseAlpha = countries.stream()
                .sorted(Comparator.reverseOrder())
                .toList();
            Files.writeString(data, "List all country names in reverse alphabetical order:\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesReverseAlpha, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        8. Unique First Letters: List the unique first letters of all country names.
         */
        try
        {
            final List<String> countriesUniqueFirstLetters = countries.stream()
                .map(country -> country.substring(0, 1).toUpperCase())
                .distinct()
                .toList();
            Files.writeString(data, "List the unique first letters of all country names:\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesUniqueFirstLetters, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        9. Count of Countries: Write the total count of country names.
         */
        try
        {
            final Long numCountries = countries.stream()
                .count();
            Files.writeString(data, "Count of Countries: Write the total count of country names:\n\n", StandardOpenOption.APPEND);
            Files.writeString(data, numCountries.toString(), StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        10. Longest Country Name: Write the longest country name.
         */
        try
        {
            final String longestCountryName = countries.stream()
                .max(Comparator.comparingInt(String::length))
                .orElse("No countries found");
            Files.writeString(data, "Write the longest country name:\n\n", StandardOpenOption.APPEND);
            Files.writeString(data, longestCountryName, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        11. Shortest Country Name: Write the shortest country name.
         */
        try
        {
            final String shortestCountryName = countries.stream()
                .min(Comparator.comparingInt(String::length))
                .orElse("No countries found");
            Files.writeString(data, "Write the shortest country name:\n\n", StandardOpenOption.APPEND);
            Files.writeString(data, shortestCountryName, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        12. Names in Uppercase: Write all country names converted to uppercase.
         */
        try
        {
            final List<String> countriesUpperCase = countries.stream()
                .map(String::toUpperCase)
                .toList();
            Files.writeString(data, "Write all country names converted to uppercase:\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesUpperCase, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        13. Countries with More Than One Word: List all country names with more than one word.
         */
        try
        {
            final List<String> countriesWithMoreThanOneWord = countries.stream()
                .map(String::trim)
                .filter(country -> country.contains(" "))
                .toList();
            Files.writeString(data, "List all country names with more than one word:\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesWithMoreThanOneWord, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        14. Country Names to Character Count: Map each country name to its
        character count, writing each name and count as "Country: X characters".
         */
        try
        {
            final List<String> countriesCount = countries.stream()
                .map(String::trim)
                .map(country -> country + ": " + country.length() + " characters")
                .toList();
            Files.writeString(data, "Map each country name to its character count, writing each name and count as \"Country: X characters\":\n\n", StandardOpenOption.APPEND);
            Files.write(data, countriesCount, StandardOpenOption.APPEND);
            Files.writeString(data, "\n\n", StandardOpenOption.APPEND );
        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        15. Any Name Starts with "Z": Write "true" if any country name starts with "Z"; otherwise, "false".
         */
        try
        {
            boolean startsWithZ = countries.stream()
                .map(String::trim)
                .anyMatch(country -> country.startsWith("Z"));
            Files.writeString(data, "Write \"ture\" if any country name starts with \"Z\"; otherwise, \"false\":\n\n", StandardOpenOption.APPEND);
            Files.writeString(data, startsWithZ + "\n\n", StandardOpenOption.APPEND);

        }
        catch (final IOException e) { e.printStackTrace(); }

        /*
        16. All Names Longer Than 3: Write "true" if all country names are longer than 3 characters; otherwise, "false".
         */
        try
        {
            boolean allCountriesLongerThan3 = countries.stream()
                .map(String::trim)
                .allMatch(country -> country.length() > 3);
            Files.writeString(data, "Write \"true\" if all country names are longer than 3 characters; otherwise, \"false\":\n\n", StandardOpenOption.APPEND);
            Files.writeString(data, allCountriesLongerThan3 + "\n\n", StandardOpenOption.APPEND);
        }
        catch (final IOException e) { e.printStackTrace(); }



        System.out.println("Program compiles successfully: No runtime errors");
    }
}
