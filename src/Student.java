/**
 * Write a Java class called Student with private attributes for name,
 * age, and grade.
 * Include a method to display the student's information.
 */
public class Student {
    private String name;
    private int age;
    private char grade;


    // Constructor
    public Student(String name, int age, char grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }

    // Getter and Setter methods for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter methods for age
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    // Getter and Setter methods for grade
    public char getGrade() {
        return grade;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }
    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
        System.out.println("Student Grade: " + grade);
    }

}
