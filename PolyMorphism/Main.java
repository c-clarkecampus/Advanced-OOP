import java.util.Scanner;

public class Main {


    public static void main(String[] args) {


        Cat cat = new Cat("kitty", "2", "testt");
        Dog dog = new Dog("brown", "4", "male");
        Fish fish = new Fish("goldy", "2", "gold fish", 2);

        dog.makeSound(5);

        Elephant elephant = new Elephant("namunukula", "4", "male");

        Animal[] animals = {cat, dog, fish, elephant};

        for (Animal animal: animals) {
            animal.showInfo();
            animal.makeSound();
        }

        Animal animal;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Press 1 for Dog, Press 2 for cat");

        int num = scanner.nextInt();

        if (num == 1) {
            animal = new Dog("blacky", "2", "German Shephard");
            animal.makeSound();
            animal.showInfo();
        } else if (num ==2) {
            animal = new Cat("sss", "1", "unknwn" );
            animal.makeSound();
        }


    }
}
