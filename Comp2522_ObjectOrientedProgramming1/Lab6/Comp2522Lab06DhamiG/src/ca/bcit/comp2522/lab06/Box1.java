package ca.bcit.comp2522.lab06;

// Generic class with unbounded wildcard
class Box1<T> {
    private T content;

    public Box1(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

