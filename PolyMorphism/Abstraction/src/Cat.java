public class Cat extends Animal implements Eatable{

    public Cat(String name, String age, String type) {
        super(name, age, type);
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }

    @Override
    public void eat() {
        System.out.println("Cat eats fish");
    }


    @Override
    public void eating() {

    }
}
