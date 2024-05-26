import java.util.Scanner;

public class Main6_8 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите 1 число: ");
        int numberOne = scanner.nextInt();

        System.out.print("Введите 2 число: ");
        int numberTwo = scanner.nextInt();

        String result = (numberOne > numberTwo) ? "Сумма чисел: " + (numberOne + numberTwo) :
                (numberOne < numberTwo) ? "Произведение чисел: " + (numberOne * numberTwo) : "Числа равны";

        System.out.println(result);

    }
}
