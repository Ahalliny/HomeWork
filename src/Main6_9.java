import java.util.Scanner;

public class Main6_9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 3-х значное число: ");
        int number = scanner.nextInt();

        String result = (number % 10 % 2 == 0 && number / 10 % 10 % 1 == 0 && number / 100 % 10 % 2 == 0) ?
                "Четно-красивое число" : "Не четно-красивое число";

        System.out.println(result);
    }
}
