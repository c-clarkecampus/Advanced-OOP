public class Main {

    public static void main(String[] args) {

         printHi(100000);

//        System.out.println(sum(5));
//        System.out.println(factorial(3));
//        System.out.println(fibonacci(3));
    }

    public static void printHi(int count) {
        if(count == 0) {
            return;
        }
        System.out.println("Hi " + count );
        printHi(count - 1);
    }

    public static int sum(int n) {
        if (n == 0) {
            return 0;
        }

        return n + sum(n - 1);
    }

    public static int factorial(int n) {
        if (n==0) {
            return 1;
        }

        return n * factorial(n - 1);
    }

    public static long fibonacci (int n) {
        if (n <= 1 ) {
            return n;
        }

        return fibonacci(n-1) + fibonacci(n - 2);
    }
}
