public class Dog extends Animal implements Washable{

    public Dog(String name, String age, String type) {
        super(name, age, type);
    }


    @Override
    public void makeSound() {
        System.out.println("Dog is barking");
    }

    @Override
    public void eat() {

    }


    public void makeSound(int count) {
        while (count > 0) {
            System.out.println("Dog is barking");
            count--;
        }

    }

    @Override
    public String soapType() {
        System.out.println("Sunlight");
        return "";
    }

    @Override
    public void waterType() {
        System.out.println("Alkaline");
    }

    @Override
    public void brushType() {
        System.out.println("Test");
    }
}
