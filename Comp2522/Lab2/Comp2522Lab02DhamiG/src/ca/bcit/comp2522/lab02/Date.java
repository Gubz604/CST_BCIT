package ca.bcit.comp2522.lab02;

/**
 * Represents a date given a valid day, month, and year. This class provides a
 * method to retrieve the day in the week for the date.
 *
 * <p>This class provides a valid date.</p>
 *
 * @author Gurvir Dhami
 * @version 1.0
 * @since 2025-06-28
 */
public class Date
{
    // The oldest year a date can be
    private static final int OLDEST_YEAR = 1800;
    // The current year
    public static final int CURRENT_YEAR = 2025;

    // Constants for months in the year
    private static final int JANUARY = 1;
    private static final int FEBRUARY = 2;
    private static final int MARCH = 3;
    private static final int APRIL = 4;
    private static final int MAY = 5;
    private static final int JUNE = 6;
    private static final int JULY = 7;
    private static final int AUGUST = 8;
    private static final int SEPTEMBER = 9;
    private static final int OCTOBER = 10;
    private static final int NOVEMBER = 11;
    private static final int DECEMBER = 12;

    // Values for min and max days in a month
    private static final int MIN_MONTH = 1;
    private static final int MAX_MONTH = 12;
    private static final int MIN_DAY = 1;
    private static final int MAX_DAY_TWENTY_EIGHT = 28;
    private static final int MAX_DAY_TWENTY_NINE = 29;
    private static final int MAX_DAY_THIRTY = 30;
    private static final int MAX_DAY_THIRTY_ONE = 31;

    // String values for day of the week
    private static final String[] DAYS = {
        "SATURDAY", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY",
        "FRIDAY"
    };

    // String values for months of the year
    private static final String[] MONTHS = {
        "January", "February", "March", "April", "May", "June", "July",
        "August", "September", "October", "November", "December"
    };

    // Month code for calculating day of the week
    private static final int[] MONTH_CODE = {
        1, 4, 4, 0, 2, 5, 0, 3, 6, 1, 4, 6
    };


    // Private method used to determine if given year is a leap year
    public static boolean isLeapYear(final int year)
    {
        if (year % 4 != 0)
        {
            return false;
        }
        else if (year % 100 != 0)
        {
            return true;
        }
        else
        {
            return year % 400 == 0;
        }
    }

    // Private method used to get number of days in a given month and year
    private static int getDaysInMonth(final int month,
                                      final int year)
    {
        switch (month)
        {
            case APRIL:
            case JUNE:
            case SEPTEMBER:
            case NOVEMBER:
                return MAX_DAY_THIRTY;
            case FEBRUARY:
                return isLeapYear(year) ?
                    MAX_DAY_TWENTY_NINE : MAX_DAY_TWENTY_EIGHT;
            default:
                return MAX_DAY_THIRTY_ONE;
        }
    }


    private final int year;
    private final int month;
    private final int day;

    /**
     * Creates a Date with a day, month, and year.
     *
     * @param year  The year of the date.
     * @param month The month of the date.
     * @param day   The day of the date.
     * @throws IllegalArgumentException If year is not within the year 1800 and
     *                                  current year; if the month is not a
     *                                  valid month; and if the day is not
     *                                  valid.
     */
    public Date(final int year,
                final int month,
                final int day)
        throws IllegalArgumentException
    {
        if (year < OLDEST_YEAR || year > CURRENT_YEAR)
        {
            throw new IllegalArgumentException("Invalid year: " + year);
        }
        if (month < MIN_MONTH || month > MAX_MONTH)
        {
            throw new IllegalArgumentException("Invalid month: " + month);
        }
        if (day < MIN_DAY || day > getDaysInMonth(month, year))
        {
            throw new IllegalArgumentException("Invalid day: " + day);
        }

        this.year = year;
        this.month = month;
        this.day = day;
    }

    /**
     * Returns the day of the Date.
     *
     * @return The day of the Date.
     */
    public int getDay()
    {
        return day;
    }

    /**
     * Returns the month of the Date.
     *
     * @return The month of the Date.
     */
    public int getMonth()
    {
        return month;
    }

    /**
     * Returns the year of the Date.
     *
     * @return The year of the Date.
     */
    public int getYear()
    {
        return year;
    }

    /**
     * Returns a formatted String of the date in the form of YYYYMMDD.
     *
     * @return A formatted date in the form of YYYYMMDD.
     */
    public String getYYYYMMDD()
    {
        return year + "-" + month + "-" + day;
    }

    /**
     * Returns the day of the Week.
     *
     * @return The day of the week.
     */
    public String getDayOfWeek() {
        int base = 0;
        if (year >= 2000) {
            base = 6;
        } else if (year < 1900) {
            base = 2;
        }

        int y = year % 100;

        int step1 = y / 12;
        int step2 = y % 12;
        int step3 = step2 / 4;
        int step4 = step1 + step2 + step3 + day;
        int step5 = step4 + MONTH_CODE[month - 1];
        int step6 = base + step5;

        // Add leap year correction AFTER all above steps
        if (isLeapYear(year) && (month == JANUARY || month == FEBRUARY)) {
            step6 += 6;
        }

        int step7 = step6 % 7;

        return DAYS[step7];
    }

    @Override
    public String toString()
    {
        return getDayOfWeek() + ", " + MONTHS[month - 1] + ", " + year;
    }

}

