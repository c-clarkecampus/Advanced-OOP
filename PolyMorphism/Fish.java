public class Fish extends Animal{

    int noOfFinns;

    public Fish(String name, String age, String type, int noOfFinns) {
        super(name, age, type);
        this.noOfFinns = noOfFinns;
    }

    @Override
    public void showInfo() {
        System.out.println( "Animal name is : " + name
                + " Animal Age is: " + age  + " Animal Type is : "
                + type + " No of Finns : " + noOfFinns);

    }

    @Override
    public void makeSound() {
        System.out.println("Fish is croaking");
    }
}
