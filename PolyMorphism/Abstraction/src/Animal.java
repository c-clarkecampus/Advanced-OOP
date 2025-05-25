public abstract class Animal {

     String name;
     String age;
     String type;

    public Animal(String name, String age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }

    public abstract void makeSound();

    public abstract void eat();

    public void showInfo() {
        System.out.println( "Animal name is : " + name  + " Animal Age is: " + age  + " Animal Type is : " + type );

    }
}
