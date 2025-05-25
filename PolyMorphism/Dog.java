public class Dog extends Animal{

    public Dog(String name, String age, String type) {
        super(name, age, type);
    }


    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }


    public void makeSound(int count) {
        while (count > 0) {
            System.out.println("Dog is barking");
            count--;
        }

    }
}
