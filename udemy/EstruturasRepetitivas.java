import java.util.Scanner;

public class EstruturasRepetitivas {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // WHILE
        // EXERCICIO 1
        // Escreva um programa que repita a leitura de uma senha até que ela seja
        // válida. Para cada leitura de senha
        // incorreta informada, escrever a mensagem "Senha Invalida". Quando a senha for
        // informada corretamente deve ser
        // impressa a mensagem "Acesso Permitido" e o algoritmo encerrado. Considere que
        // a senha correta é o valor 2002.

        // int rightPassword = 2022;
        // int password;

        // System.out.println("Digite sua senha:");
        // password = sc.nextInt();

        // if (password == rightPassword) {
        // System.out.println("Acesso garantido...");
        // } else {
        // while (password != rightPassword) {
        // System.out.println("Senha invalida...");
        // System.out.println("Digite sua senha:");
        // password = sc.nextInt();
        // }
        // System.out.println("Acesso garantido...");
        // }

        // EXERCICIO 2
        // Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
        // indeterminada de pontos no sistema
        // cartesiano. Para cada ponto escrever o quadrante a que ele pertence. O
        // algoritmo será encerrado quando pelo
        // menos uma de duas coordenadas for NULA (nesta situação sem escrever mensagem
        // alguma).

        // int x, y;
        // boolean status = true;
        // while (status == true) {
        // System.out.println("Digite o ponto do eixo X:");
        // x = sc.nextInt();
        // System.out.println("Digite o ponto do eixo Y:");
        // y = sc.nextInt();

        // if (x >= 0 && y >= 0) {
        // if (x == 0 || y == 0) {
        // break;
        // } else {
        // System.out.println("primeiro");
        // }
        // } else if (x <= 0 && y >= 0) {
        // if (x == 0 || y == 0) {
        // break;
        // } else {
        // System.out.println("segundo");
        // }
        // } else if (x <= 0 && y <= 0) {
        // if (x == 0 || y == 0) {
        // break;
        // } else {
        // System.out.println("terceiro");
        // }
        // } else {
        // if (x == 0 || y == 0) {
        // break;
        // } else {
        // System.out.println("quarto");
        // }

        // }
        // }

        // EXERCICIO 3
        // Um Posto de combustíveis deseja determinar qual de seus produtos tem a
        // preferência
        // de seus clientes. Escreva um algoritmo para ler o tipo de combustível
        // abastecido
        // (codificado da seguinte forma: 1.Alcool 2.Gasolina 3.Diesel 4.Fim). Caso o
        // usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
        // solicitado
        // um novo código (até que seja válido). O programa será encerrado quando o
        // código
        // informado for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a
        // quantidade de clientes que abasteceram cada tipo de combustível, conforme
        // exemplo.

        // int idAlcool = 1;
        // int idGasolina = 2;
        // int idDiesel = 3;
        // int idFim = 4;
        // int countAlcool = 0;
        // int countGasolina = 0;
        // int countDiesel = 0;
        // int entrada = 0;

        // while (entrada != 4) {
        // System.out.println("Digite uma das opções abaixo:");
        // System.out.println("1- Alcool ");
        // System.out.println("2- Gasolina");
        // System.out.println("3- Diesel");
        // System.out.println("4- Fim");
        // entrada = sc.nextInt();
        // if (entrada == 1) {
        // countAlcool += 1;
        // } else if (entrada == 2) {
        // countGasolina += 1;
        // } else if (entrada == 3) {
        // countDiesel += 1;
        // }
        // }
        // if (entrada == 4) {
        // System.out.println("MUITO OBRIGADO!");
        // System.out.println("Alcool: " + countAlcool);
        // System.out.println("Gasolina: " + countGasolina);
        // System.out.println("Diesel: " + countDiesel);
        // }

        // FOR
        // EXERCICIO 1
        // Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares de 1
        // até X,
        // um valor por linha, inclusive o X, se for o caso.

        // int x;
        // System.out.println("Digite um valor para x:");
        // x = sc.nextInt();

        // for (int i = 0; i <= x; i++) {
        // if ((i % 2) != 0) {
        // System.out.println(i);
        // }
        // }

        // EXERCICIO 2
        // Leia um valor inteiro N. Este valor será a quantidade de valores inteiros 
        // X que serão lidos em seguida. Mostre quantos destes valores X estão dentro 
        // do intervalo [10,20] e quantos estão fora do intervalo, mostrando essas 
        // informações conforme exemplo (use a palavra "in" para dentro do intervalo, 
        // e "out" para fora do intervalo).

        // int n;
        // int countIn = 0;
        // int countOut = 0;

        // System.out.println("Digite um valor para N:");
        // n = sc.nextInt();

        // for (int i = 0; i < n; i++) {
        // int x = sc.nextInt();
        // if (x >= 10 && x <= 20) {
        // countIn += 1;
        // } else {
        // countOut += 1;
        // }
        // }
        // System.out.println(countIn + " in");
        // System.out.println(countOut + " out");

        // EXERCICIO 3
        // Leia 1 valor inteiro N, que representa o número de casos de teste que vem
        // a seguir. Cada caso de teste consiste de 3 valores reais, cada um deles
        // com uma casa decimal. Apresente a média ponderada para cada um destes
        // conjuntos
        // de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem peso
        // 3
        // e o terceiro valor tem peso 5.

        // int n;
        // double a, b, c;

        // System.out.println("Digite o valor de N:");
        // n = sc.nextInt();

        // for (int i = 0; i < n; i++) {

        // a = sc.nextDouble();
        // b = sc.nextDouble();
        // c = sc.nextDouble();

        // double media = (a * 2.0 + b * 3.0 + c * 5.0) / 10.0;

        // System.out.printf("%.1f%n", media);

        // }

        // EXERCICIO 4
        // Fazer um programa para ler um número N. Depois leia N pares de números e
        // mostre a
        // divisão do primeiro pelo segundo. Se o denominador for igual a zero, mostrar
        // a
        // mensagem "divisao impossivel".

        // int n;
        // double a, b;

        // System.out.println("Digite o valor de N:");
        // n = sc.nextInt();

        // for (int i = 0; i < n; i++) {

        // a = sc.nextDouble();
        // b = sc.nextDouble();
        // if (b == 0) {
        // System.out.println("DIVISAO IMPOSSIVEL");
        // } else {
        // double media = a / b;
        // System.out.println(media);
        // }

        // }

        // EXERCICIO 5
        // Ler um valor N. Calcular e escrever seu respectivo fatorial. Fatorial de
        // N = N * (N-1) * (N-2) * (N-3) * ... * 1. Lembrando que, por definição,
        // fatorial de 0 é 1.

        int n;
        int fatorial = 1;
        System.out.println("Informe o valor de n:");
        n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            fatorial = fatorial * i;
        }
        System.out.println(n + "! = " + fatorial);

        // EXERCICIO 6
        // Ler um número inteiro N e calcular todos os seus divisores.

        // int n;

        // System.out.println("Digite um valor n:");
        // n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // if (n % i == 0) {
        // System.out.println(i);
        // }
        // }

        // EXERCICIO 7
        // Fazer um programa para ler um número inteiro positivo N. O programa
        // deve então mostrar na tela N linhas, começando de 1 até N. Para cada
        // linha, mostrar o número da linha, depois o quadrado e o cubo do valor,
        // conforme exemplo.

        // int n;
        // double square, cube;
        // System.out.println("Digite um valor n:");
        // n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
        // System.out.print(i);
        // square = Math.pow(i, 2);
        // System.out.printf(" %.0f ", square);
        // cube = Math.pow(i, 3);
        // System.out.printf(" %.0f", cube);
        // System.out.println();
        // }

        sc.close();
    }

}
