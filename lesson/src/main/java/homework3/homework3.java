package homework3;

import java.util.Scanner;

public class homework3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Угадайте число!");
        int range = 10;
        int number = (int) (Math.random() * range);
        while (true) {
            System.out.println("Угадайте число от 0 до " + range);
            int input_number = scanner.nextInt();
            if (input_number == number) {
                System.out.println("Поздравялем! Вы угадали!");
                break;
            }
            else if (input_number > number) {
                System.out.println("Загаданное число меньше вашего");
            }
            else {
                System.out.println("Загаданное число больше вашего");
            }
        }
        scanner.close();
    }
}
