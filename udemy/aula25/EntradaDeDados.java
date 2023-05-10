import java.util.Scanner;

public class EntradaDeDados {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // String x;
        // x = sc.next();
        // System.out.println("Voce digitou: " + x);

        // sc.close();

        // int y;
        // y = sc.nextInt();
        // System.out.println("Voce digitou: " + y);

        // sc.close();

        // double z;
        // z = sc.nextDouble();
        // System.out.println("Voce digitou: " + z);
        // //System.out.printf("Voce digitou: %.2f %n", z);

        // sc.close();

        // char x;
        // x = sc.next().charAt(0);
        // System.out.println("Voce digitou: " + x);

        // sc.close();

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        sc.close();
    }
}