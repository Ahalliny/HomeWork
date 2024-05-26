import java.util.Scanner;

public class Main6_6 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите целое число: ");
        int number = scanner.nextInt();

        String result = number > 0 ? "Положительное" : number < 0 ? "Отрицательное" : "Ноль";
        System.out.println(result);
    }
}
