package ca.bcit.comp2522.lab06;

// Generic class with upper-bounded wildcard (? extends Type)
class Box2<T> {
    private T content;

    public Box2(T content) {
        this.content = content;
    }

    public T getContent() {
        return content;
    }

    public void setContent(T content) {
        this.content = content;
    }
}

