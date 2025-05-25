public class Student {

    String name;
    int age;
    String address;
    int phoneNo;
    String courseName;

    public Student() {
        this("Unknown");
        System.out.println("Calling From Default Constructor");

    }

    public Student(String name) {
        this(name, 18);
        System.out.println("Calling from Name constructor");
    }

    public  Student(String name, int age ) {
        this(name,age,"Address Unknown");

        System.out.println("Calling From Name and Age constructor");
    }

    public  Student(String name, int age, String address ) {
        this(name,age,address,1000000);
        System.out.println("Calling From Name,Age and Address constructor");
    }

    public  Student(String name, int age, String address, int phoneNo ) {
      this(name,age,address,phoneNo,"Not Entrolled");

        System.out.println("Calling From Name,Age,Address and phone no constructor");
    }

    public Student(String name, int age, String address, int phoneNo,String courseName) {
        this.name = name;
        this.age  = age;
        this.address = address;
        this.phoneNo = phoneNo;
        this.courseName = courseName;

        System.out.println("Calling From Final Constructor");
    }

    void displayStudent() {
        System.out.println("Student Name : "
                + name + " Student Age: "
                + age + " Student Address "
                + address + " Student Phone No : "
                + phoneNo + " Student Course Name : " + courseName);

    }
}
