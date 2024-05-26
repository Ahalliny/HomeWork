import java.util.Scanner;

public class Main6_4 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        int result = number > 0 ? number * 2 : (number == 0 ? 0 : -1);

        if (result == -1) {
            System.out.println("Ошибка");
        } else {
            System.out.println("Новое значение числа " + result);
        }

    }
}
