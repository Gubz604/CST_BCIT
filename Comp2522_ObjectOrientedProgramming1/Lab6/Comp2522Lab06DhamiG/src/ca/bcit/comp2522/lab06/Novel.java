package ca.bcit.comp2522.lab06;

public class Novel extends Literature
{
    private final String title;

    public Novel(String title)
    {
        this.title = title;
    }

    @Override
    public String getTitle()
    {
        return title;
    }
}
