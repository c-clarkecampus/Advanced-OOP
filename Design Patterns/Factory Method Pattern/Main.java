public class Main {

    public static void main(String[] args) {

        AnimalFactory factory = new AnimalFactory();

        Animal dog = factory.createAnimal("dog");

        dog.displayAnimal();


    }
}
