import java.util.Scanner;

public class Main6_10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 2-значное число: ");
        int number = scanner.nextInt();

        int firstDigit = number / 10;
        int secondDigit = number % 10;

        int product = firstDigit * secondDigit;
        int result = number > product ? number : product;

        if (number < 10 || number > 99 || number < 0) {
            System.out.println("Ошибка. Введено не двузначное число.");
        } else {
            System.out.println("Большее число: " + result);
        }
    }
}

