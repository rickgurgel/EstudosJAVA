import java.util.Random;
import java.util.Scanner;

public class MegaSena {

    public static void main(String[] args) {
        Random generate = new Random();

        // tipo variavel = new tipo();
        Scanner scanner = new Scanner(System.in);

        String name = scanner.nextLine();

        System.out.print("Ola, " + name + "\n");

        int i = 0;
        System.out.println("\n WHILE \n");
        while (i < 6) {
            int number = generate.nextInt(60);
            System.out.println(number);
            i++;
        }
        System.out.println("\n FOR \n");
        for (int a = 0; a < 6; a++) {
            int number = generate.nextInt(60);
            System.out.println(number);
        }
    }

}