package RandomNumbers;
import java.util.Random;
public class RandomNumbers {
    public static void main(String[] args) {
        Random random = new Random();

        int number;
        int number2;
        double number3;
        boolean isHead;

        number = random.nextInt();
        number2 = random.nextInt(1, 6);
        number3 = random.nextDouble(); //nextDouble() generate the number between 0  to 1.0
        isHead = random.nextBoolean();
        System.out.println(number);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(isHead);
    }
}