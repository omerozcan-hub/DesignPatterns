public class Main {
    public static void main(String[] args) {
        Animal dog = AnimalFactory.getAnimal("Dog");
        Animal unknown = AnimalFactory.getAnimal("Cat");

        dog.makeSound();    // Output: Woof!
        unknown.makeSound(); // No output, as it is a NullAnimal
    }
}