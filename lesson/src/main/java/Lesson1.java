import java.util.Scanner;

public class Lesson1 {
    public static void Arithmetic (String[]args) {
        int a = 2, b = 3, c = 10, d = 5;
        System.out.println( a * (b + (c / d)));
    }
    static boolean isBetween (int x) {
        return x >= 10 && x <= 20;
    }
    static boolean isPositive (int value) {
        return value > 0;
    }
    static void showValue (int value) {
        if (value > 0) {
            System.out.println("Positive");
        } else if (value == 0) {
            System.out.println("Zero");
        } else if (value < 0) {
            System.out.println("Negative");
        }
    }

    public static void main (String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите два числа");
        int value = in.nextInt();
        showValue (value);
        System.out.println(isPositive(value));

    }
}
