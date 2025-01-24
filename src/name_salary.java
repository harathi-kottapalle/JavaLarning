import java.util.Scanner;

public class name_salary {
    public static void main(String[] args) {
        //Take a user input - Name, Age and Salary and print them in the end.
        //String name = "Harathi";
        //int age = 24;
        //double salary = 47000;

        // Create a Scanner object to take user input
        Scanner scanner = new Scanner (System.in);
        // take user inputs
        System.out.println("Enter name");
        String name = scanner.nextLine();
        System.out.println("Enter age");
        int age = scanner.nextInt();
        System.out.println("Enter salary");
        double salary = scanner.nextDouble();

        System.out.println("name  :" +name);
        System.out.println("age :" +age);
        System.out.println("salary:" +salary);

    }
}