public class Singelton {

    private static Singelton singelton;

    private  Singelton() {

    }

    public static Singelton getInstance() {

        if (singelton == null) {
            singelton = new Singelton();
        }

        return singelton;
    }

    public void doSomething() {
        System.out.println("Im doing something with singelton class");
    }
}
