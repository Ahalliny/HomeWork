import java.util.Scanner;

public class Main6_5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        String result = (number == 0) ? "Ноль" : (number < 0) ? "Ошибка" : "";
        System.out.println(result);
    }
}
