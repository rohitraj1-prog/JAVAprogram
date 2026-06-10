
// Base Class
class Person {
    String name;
    int age;

    // Constructor
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method
    void showRole() {
        System.out.println("I am a person.");
    }
}

// Teacher Class
class Teacher extends Person {
    String subject;
    double salary;

    // Constructor
    Teacher(String name, int age, String subject, double salary) {
        super(name, age);
        this.subject = subject;
        this.salary = salary;
    }

    // Overriding Method
    @Override
    void showRole() {
        System.out.println("I am a Teacher.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Subject: " + subject);
        System.out.println("Salary: " + salary);
        System.out.println();
    }
}

// Student Class
class Student extends Person {
    int rollNo;
    String course;

    // Constructor
    Student(String name, int age, int rollNo, String course) {
        super(name, age);
        this.rollNo = rollNo;
        this.course = course;
    }

    // Overriding Method
    @Override
    void showRole() {
        System.out.println("I am a Student.");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

// Main Class
public class SchoolManagement {
    public static void main(String[] args) {

        // Polymorphism
        Person[] people = new Person[2];

        people[0] = new Teacher("Rahul", 35, "Math", 50000);
        people[1] = new Student("Aman", 20, 101, "BCA");

        // Dynamic Method Dispatch
        for (Person p : people) {
            p.showRole();
        }
    }
}