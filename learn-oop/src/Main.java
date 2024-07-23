
public class Main {

    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.keu();
        cat.keu("gau gau"); //Polymorphism: overloading
        cat.eat(); //Polymorphism: overiding
        cat.sleep(); //Inheritance

        Dog dog = new Dog();
        dog.sleep(); //Inheritance

        Animal2 animal = new Pig(); //abstraction
        animal.run();
    }
}
