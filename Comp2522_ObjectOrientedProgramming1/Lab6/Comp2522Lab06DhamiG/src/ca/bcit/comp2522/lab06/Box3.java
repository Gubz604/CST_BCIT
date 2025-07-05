package ca.bcit.comp2522.lab06;

// Generic class with lower-bounded wildcard (? super Type)
class Box3<T>
{

    private T content;

    public Box3(T content)
    {
        this.content = content;
    }

    public T getContent()
    {
        return content;
    }

    public void setContent(T content)
    {
        this.content = content;
    }
}
