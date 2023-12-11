import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class Student {
    String name;
    int age;
    double grade;

    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}

public class StudentManagementSystem {
    private List<Student> studentList;

    public StudentManagementSystem() {
        this.studentList = new ArrayList<>();
    }

    public void addStudent(Student student) {
        studentList.add(student);
        System.out.println("Student " + student.name + " added to the system.");
    }

    public void displayStudents() {
        System.out.println("List of students:");
        for (Student student : studentList) {
            System.out.println("Name: " + student.name + ", Age: " + student.age + ", Grade: " + student.grade);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentManagementSystem system = new StudentManagementSystem();

        while (true) {
            System.out.println("\nSelect an action:");
            System.out.println("1. Add a student");
            System.out.println("2. View the list of students");
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter the student's name: ");
                    String name = scanner.next();
                    System.out.print("Enter the student's age: ");
                    int age = scanner.nextInt();
                    System.out.print("Enter the student's grade: ");
                    double grade = scanner.nextDouble();

                    Student newStudent = new Student(name, age, grade);
                    system.addStudent(newStudent);
                    break;

                case 2:
                    system.displayStudents();
                    break;

                case 3:
                    System.out.println("Exiting the program.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
