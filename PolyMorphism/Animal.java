public class Animal {

     String name;
     String age;
     String type;

    public Animal(String name, String age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public void makeSound() {
        System.out.println("Making Animal Sounds");
    }

    public void showInfo() {
        System.out.println( "Animal name is : " + name  + " Animal Age is: " + age  + " Animal Type is : " + type );

    }
}
