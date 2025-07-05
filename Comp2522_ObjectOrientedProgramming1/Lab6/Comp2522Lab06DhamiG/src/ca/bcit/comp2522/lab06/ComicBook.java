package ca.bcit.comp2522.lab06;

public class ComicBook extends Literature
{
    private final String title;

    public ComicBook(final String title)
    {
        this.title = title;
    }

    @Override
    public String getTitle()
    {
        return title;
    }
}
