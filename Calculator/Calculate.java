import java.util.Scanner;

public class Calculate {
    public static void main(String[] args) {
        boolean verdadeiro = true;
        while (verdadeiro) {
            System.out.println("Digite um valor para x: \n");
            Scanner scannerX = new Scanner(System.in);
            String valorX = scannerX.nextLine();
            int x = Integer.parseInt(valorX);
            System.out.println("Digite um valor para x: \n");
            Scanner scannerY = new Scanner(System.in);
            String valorY = scannerY.nextLine();
            int y = Integer.parseInt(valorY);
            System.out.println("Valores de x e y: ");
            System.out.println(x);
            System.out.println(y);

            System.out.println("MENU DE OPÇÕES: \n");
            System.out.println("1 - SOMAR");
            System.out.println("2 - SUBTRAIR");
            System.out.println("3 - MULTIPLICAR");
            System.out.println("4 - DIVIDIR");
            System.out.println("Digite 0 para SAIR");
            Scanner option = new Scanner(System.in);
            String valorOption = option.nextLine();
            int intOption = Integer.parseInt(valorOption);

            if (intOption == 1) {
                sum(x, y);
            } else if (intOption == 2) {
                subtract(x, y);
            } else if (intOption == 3) {
                multiply(x, y);
            } else if (intOption == 4) {
                divide(x, y);
            } else if (intOption == 0) {
                verdadeiro = false;
            } else {
                System.out.println("INVALID ARGS");
            }
        }
    }

    static void sum(int x, int y) {
        System.out.println(x + y);
    }

    static void subtract(int x, int y) {
        System.out.println(x - y);
    }

    static void multiply(int x, int y) {
        System.out.println(x * y);
    }

    static void divide(int x, int y) {
        System.out.println(x / y);
    }
}