public class Elephant extends Animal{

    public Elephant(String name, String age, String type) {
        super(name, age, type);
    }


    @Override
    public void makeSound() {
        System.out.println("Elephant trumpet");
    }

}
