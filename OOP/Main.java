public class Main {

    public static void main(String[] args) {
        Student student1 = new Student();

        Student student2 = new Student("Thuhina");

        Student student4 = new Student("john", 27);

        Student student3 =
                new Student
                        ("Vihanga", 18, "Colombo"
                                , 01124444, "AI and SE" );

        student1.displayStudent();
        student2.displayStudent();
        student3.displayStudent();
    }
}
