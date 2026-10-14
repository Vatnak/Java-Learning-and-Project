package ifStatment;
import java.util.Scanner;
public class ifStatment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age:  ");
        age = scanner.nextInt();

        if (age >= 10) {
            System.out.print("You are too young ");
        }
        else if (age < 0) {
            System.out.print("You haven't been born yet!!");
        }
        else if (age == 0) {
            System.out.print("Really?");
        }
        else {
            System.out.print("You are a child!!");
        }
        scanner.close();
    }
}