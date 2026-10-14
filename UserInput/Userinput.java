package UserInput;
import java.util.Scanner;

public class Userinput {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); //Call a Scanner object and name it "input"
        System.out.print("Enter your Name:  ");
        String name = input.next();

        System.out.print("Enter your age:   ");
        int age = input.nextInt(); // next and define the type of data the input is

        System.out.print("Enter your price:   ");
        double price = input.nextDouble();

        System.out.print("Are you a student:  ");
        boolean answer = input.nextBoolean();


        System.out.print("hello  " + name);
        System.out.println();
        System.out.print("your are  " + age);
        System.out.println();
        System.out.print("Your price is " + price);
        System.out.println();
        System.out.print("Are you a students?" + answer);
        input.close(); // Close the object to avoid unnesccary operations

    }
}
