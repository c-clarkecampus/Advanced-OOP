public class Main {

    public static void main(String[] args) {

        Singelton singelton = Singelton.getInstance();
        Singelton singelton2 = Singelton.getInstance();

        singelton.doSomething();

        System.out.println(singelton2);
        System.out.println(singelton);

        System.out.println(singelton == singelton2);
    }
}
