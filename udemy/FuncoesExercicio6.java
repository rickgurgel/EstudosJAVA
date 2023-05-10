import java.util.Scanner;

public class FuncoesExercicio6 {
    // EXERCICIO 6
    // Ler um número inteiro N e calcular todos os seus divisores.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor N:");
        int n = sc.nextInt();

        divisor(n);

        sc.close();
    }

    public static int divisor(int a) {
        for (int i = 1; i <= a; i++) {
            if (a % i == 0) {
                System.out.println(i);
            }
        }
        return a;
    }

}
