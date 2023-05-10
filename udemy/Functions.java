import java.util.Scanner;

public class Functions {

    // EXERCICIO 7
    // Fazer um programa para ler um número inteiro positivo N. O programa
    // deve então mostrar na tela N linhas, começando de 1 até N. Para cada
    // linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
    // conforme exemplo.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // double n = sc.nextDouble();

    // for (double i = 1; i <= n; i++) {
    // System.out.print(n);
    // System.out.printf(" %.0f ", square(n));
    // System.out.printf(" %.0f", cube(n));
    // System.out.println();
    // }

    // sc.close();
    // }

    // public static double square(double a) {
    // double square = Math.pow(a, 2);
    // return square;
    // }

    // public static double cube(double a) {
    // double cube = Math.pow(a, 3);
    // return cube;
    // }

    // EXERCICIO 6
    // Ler um número inteiro N e calcular todos os seus divisores.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Digite um valor N:");
    // int n = sc.nextInt();

    // divisor(n);

    // sc.close();
    // }

    // public static int divisor(int a) {
    // for (int i = 1; i <= a; i++) {
    // if (a % i == 0) {
    // System.out.println(i);
    // }
    // }
    // return a;
    // }

    // EXERCICIO 5
    // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de
    // N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição,
    // fatorial de 0 é 1.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Digite um valor N:");
    // int n = sc.nextInt();

    // System.out.println(factorial(n));

    // sc.close();
    // }

    // public static int factorial(int a) {
    // int result = 1;
    // for (int i = 2; i <= a; i++) {
    // result *= i;
    // }
    // return result;
    // }

    // EXERCICIO 4
    // Fazer um programa para ler um número N. Depois leia N pares de números e
    // mostre a divisão do primeiro pelo segundo. Se o denominador for igual a
    // zero, mostrar a mensagem "divisao impossivel".

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Digite um valor N:");
    // int n = sc.nextInt();

    // readPairs(n);

    // sc.close();

    // }

    // public static int readPairs(int a) {
    // Scanner sc = new Scanner(System.in);
    // for (int i = 1; i <= a; i++) {
    // double x = sc.nextDouble();
    // double y = sc.nextDouble();
    // isPossible(x, y);
    // }
    // sc.close();
    // return a;
    // }

    // public static void isPossible(double x, double y) {
    // if (y == 0) {
    // System.out.println("DIVISAO IMPOSSIVEL");
    // } else {
    // double media = x / y;
    // System.out.println(media);
    // }
    // }

    // EXERCICIO 3
    // Leia 1 valor inteiro N, que representa o número de casos de teste que vem
    // a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles
    // com uma casa decimal. Apresente a média ponderada para cada um destes
    // conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo
    // valor tem peso 3 e o terceiro valor tem peso 5.

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Digite um valor N:");
    // int n = sc.nextInt();

    // readValues(n);
    // sc.close();

    // }

    // public static void readValues(int x) {
    // Scanner sc = new Scanner(System.in);
    // for (int i = 0; i < x; i++) {
    // System.out.println("Digite um valor a:");
    // double a = sc.nextInt();
    // System.out.println("Digite um valor b:");
    // double b = sc.nextInt();
    // System.out.println("Digite um valor c:");
    // double c = sc.nextInt();
    // System.out.printf("Média Ponderada: %.1f%n", poundedMedia(a, b, c));
    // }
    // sc.close();
    // }

    // public static double poundedMedia(double a, double b, double c) {
    // double poundedMedia = (2.0 * a + 3.0 * b + 5.0 * c) / 10.0;
    // return poundedMedia;
    // }

    // EXERCICIO 2
    // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros
    // X que serão lidos em seguida. Mostre quantos destes valores X estão dentro
    // do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas
    // informações conforme exemplo (use a palavra "in" para dentro do intervalo,
    // e "out" para fora do intervalo).

    // public static void main(String[] args) {
    // Scanner sc = new Scanner(System.in);
    // System.out.println("Digite um valor N:");
    // int n = sc.nextInt();

    // readValues(n);

    // sc.close();
    // }

    // public static void readValues(int a) {
    // Scanner sc = new Scanner(System.in);
    // int value;
    // int counterIn = 0;
    // int counterOut = 0;
    // for (int i = 1; i <= a; i++) {
    // System.out.println("Digite um valor:");
    // value = sc.nextInt();
    // if (value >= 10 && value <= 20) {
    // counterIn += 1;
    // } else {
    // counterOut += 1;
    // }
    // }
    // System.out.println(counterIn + " in");
    // System.out.println(counterOut + " out");
    // sc.close();
    // }

    // EXERCICIO 1
    // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
    // até X,
    // um valor por linha, inclusive o X, se for o caso.

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um valor N:");
        int n = sc.nextInt();

        isInInterval(n);

        sc.close();
    }

    public static void isInInterval(int value) {
        if (value >= 1 && value <= 1000) {
            printInterval(value);
        } else {
            while (value < 1 && value > 1000) {
                Scanner sc = new Scanner(System.in);
                System.out.println("Digite um valor N:");
                int n = sc.nextInt();
                sc.close();
            }
        }
    }

    public static void printInterval(int value) {
        for (int i = 0; i <= value; i++) {
            if ((i % 2) != 0) {
                System.out.println(i);
            }
        }
    }
}
