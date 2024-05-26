import java.util.Random;

public class Main11_9 {
    public static void main(String[] args) {

        Random random = new Random();

        for (int i = 0; i < 20; i++) {
            int number = random.nextInt(47) + 27;
            System.out.print(number);

            if (number % 3 == 0) {
                System.out.print("#");
            }
            System.out.print(" ");
        }
    }
}
