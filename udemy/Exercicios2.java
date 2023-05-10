import java.util.Scanner;

public class Exercicios2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EXERCICIO 1
        // Faça um programa para ler dois valores inteiros, e depois mostrar na tela a
        // soma desses números com uma
        // mensagem explicativa, conforme exemplos.
        // int x, y;
        // System.out.println("Este programa receberá 2 números e fará a soma dos mesmos
        // exibindo o resultado...");
        // System.out.println("Digite o primeiro numero a ser somado: ");
        // x = sc.nextInt();
        // System.out.println("Digite o segundo numero a ser somado: ");
        // y = sc.nextInt();
        // System.out.println("Numeros digitados: " + x + " e " + y);
        // System.out.print("Soma: ");
        // System.out.println(x + y);

        // EXERCICIO 2
        // Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
        // valor da área deste círculo com quatro
        // casas decimais conforme exemplos.
        // Fórmula da área: area = π . raio2
        // Considere o valor de π = 3.14159
        // double radius, area;
        // double pi = 3.14159;
        // System.out.println("Digite o valor do raio: ");
        // radius = sc.nextDouble();
        // area = Math.pow(radius, 2) * pi;
        // System.out.println("Para o raio: " + radius);
        // System.out.println("A área é de: " + area);

        // EXERCICIO 3
        // Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
        // calcule e mostre a diferença do produto
        // de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C *
        // D).
        // int a, b, c, d, diff;
        // System.out.println("Digite um valor para a: ");
        // a = sc.nextInt();
        // System.out.println("Digite um valor para b: ");
        // b = sc.nextInt();
        // System.out.println("Digite um valor para c: ");
        // c = sc.nextInt();
        // System.out.println("Digite um valor para d: ");
        // d = sc.nextInt();

        // diff = (a * b - c * d);

        // System.out.println("A diferença é:" + diff);

        // EXERCICIO 4
        // Fazer um programa que leia o número de um funcionário, seu número de horas
        // trabalhadas, o valor
        // que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o
        // número e o salário
        // do funcionário, com duas casas decimais.
        // int idNumber;
        // double laborHours, hourlyPay, employeePaycheck;
        // System.out.println("Informe a matrícula do funcionário:");
        // idNumber = sc.nextInt();
        // System.out.println("Informe o numero de horas trabalhadas:");
        // laborHours = sc.nextFloat();
        // System.out.println("Informe o valor por hora:");
        // hourlyPay = sc.nextFloat();
        // employeePaycheck = (laborHours * hourlyPay);
        // System.out.println("Funcioario de matrícula nº: " + idNumber);
        // System.out.printf("Salario: R$ %.2f %n", employeePaycheck);

        // EXERCICIO 5
        // Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
        // valor unitário de cada peça 1, o
        // código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
        // Calcule e mostre o valor a ser pago.
        // int piece1Id, piece2Id, piece1Qtt, piece2Qtt;
        // double piece1Price, piece2Price, total;
        // System.out.println("Digite o código da peça: ");
        // piece1Id = sc.nextInt();
        // System.out.println("Digite a quantidade de peças: ");
        // piece1Qtt = sc.nextInt();
        // System.out.println("Digite o valor da peça: ");
        // piece1Price = sc.nextDouble();
        // System.out.println("Digite o código da peça: ");
        // piece2Id = sc.nextInt();
        // System.out.println("Digite a quantidade de peças: ");
        // piece2Qtt = sc.nextInt();
        // System.out.println("Digite o valor da peça: ");
        // piece2Price = sc.nextDouble();

        // total = piece1Price * piece1Qtt + piece2Price * piece2Qtt;
        // System.out.printf("VALOR A PAGAR: R$ %.2f %n", total);

        sc.close();
    }

}