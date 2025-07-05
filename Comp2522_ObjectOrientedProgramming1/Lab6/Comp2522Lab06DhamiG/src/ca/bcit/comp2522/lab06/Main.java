package ca.bcit.comp2522.lab06;

public class Main
{
    public static void main(final String[] args)
    {
        // Box1 is using an unbounded wildcard (Box<?>)
        Box1<?> box1 = new Box1<>(new Dog());
        Object content1 = box1.getContent();  // Can only retrieve as Object, type is unknown
        // box1.setContent(new Dog());  // Not allowed because we don't know the specific type
        System.out.println("Box1 content (unbounded wildcard): " + content1);

        // Box2 is using an upper-bounded wildcard (Box<? extends Animal>)
        Box2<? extends Animal> box2 = new Box2<>(new Cat());
        Animal content2 = box2.getContent();  // Can retrieve as Animal
        // box2.setContent(new Cat());  // Not allowed because it could be holding a subtype of Animal
        System.out.println("Box2 content (upper-bounded wildcard): " + content2);

        // Box3 is using a lower-bounded wildcard (Box<? super Dog>)
        Box3<? super Dog> box3 = new Box3<>(new Animal());
        // Can set a Dog (or subclass of Dog) into it
        box3.setContent(new Dog());  // Allowed because it's guaranteed to hold Dog or a superclass
        Object content3 = box3.getContent();  // Can only retrieve as Object; the exact type is unknown
        System.out.println("Box3 content (lower-bounded wildcard): " + content3);

        // Box2 with an Animal type works fine
        Box2<Animal> boxAnimal = new Box2<>(new Animal());
        Animal animalContent = boxAnimal.getContent();
        System.out.println("Box2 with Animal content: " + animalContent);

        // Box2 with Dog type
        Box2<Dog> boxDog = new Box2<>(new Dog());
        Dog dogContent = boxDog.getContent();
        System.out.println("Box2 with Dog content: " + dogContent);

        // Box1 with Cat type (unbounded wildcard, accepts any type)
        Box1<?> box1WithCat = new Box1<>(new Cat());
        Object catContent = box1WithCat.getContent();  // Can only retrieve as Object
        System.out.println("Box1 with Cat content: " + catContent);

        // Box3 with Dog type (lower-bounded wildcard)
        Box3<? super Dog> box3WithAnimal = new Box3<>(new Animal());
        box3WithAnimal.setContent(new Dog());  // Allowed because of lower bound
        System.out.println("Box3 with Dog content: " + box3WithAnimal.getContent());
    }
}
