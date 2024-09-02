public class AnimalFactory {
    public static Animal getAnimal(String type) {
        if ("Dog".equalsIgnoreCase(type)) {
            return new Dog();
        }
        return new NullAnimal();
    }
}