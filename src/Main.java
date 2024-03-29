import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();

        System.out.print("Enter student's age: ");
        int age = scanner.nextInt();
        scanner.nextLine(); // Consume the newline left by nextInt()

        System.out.println("Enter student's grade: ");
        char grade = scanner.nextLine().charAt(0);

        // Creating a Student object with user-provided information
        Student student = new Student(name, age, grade);

        // Displaying student's information
        student.displayInfo();

        scanner.close();
    }
}