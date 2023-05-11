import java.util.Locale;
import java.util.Scanner;

import entities.Rectangle;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rectangle rectangle = new Rectangle();
        System.out.println("Enter the rectangle width:");
        rectangle.width = sc.nextDouble();
        System.out.println("Enter the rectangle height:");
        rectangle.height = sc.nextDouble();

        System.out.println();
        System.out.println("AREA = " + rectangle.Area());
        System.out.println("PERIMETER = " + rectangle.Perimeter());
        System.out.println("DIAGONAL = " + rectangle.Diagonal());

    }
}
