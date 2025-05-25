public class Cat extends Animal{

    public Cat(String name, String age, String type) {
        super(name, age, type);
    }

    @Override
    public void makeSound() {
        System.out.println("meow meow");
    }



}
