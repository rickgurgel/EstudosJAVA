import java.util.Scanner;

public class EstruturasCondicionais {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // EXERCICIO 1
        // Fazer um programa para ler um número inteiro, e depois dizer se este número é
        // negativo ou não.
        // int x;
        // System.out.println("Digite um número inteiro:");
        // x = sc.nextInt();

        // if (x < 0) {
        // System.out.println("O número é negativo");
        // } else if (x == 0) {
        // System.out.println("O número é nulo");
        // } else {
        // System.out.println("O número é positivo");
        // }

        // EXERCICIO 2
        // Fazer um programa para ler um número inteiro e dizer se este número é par ou
        // ímpar.
        // int x;
        // System.out.println("Digite um número inteiro:");
        // x = sc.nextInt();

        // if ((x % 2) == 0) {
        // System.out.println("O número é par!");
        // } else {
        // System.out.println("O número é ímpar");
        // }

        // EXERCICIO 3
        // Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
        // "Sao Multiplos" ou "Nao sao
        // Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
        // números devem
        // poder ser digitados em ordem crescente ou decrescente.

        // double a, b, divide;

        // System.out.println("Digite 2 números inteiros: ");
        // a = sc.nextDouble();
        // b = sc.nextDouble();

        // if (a > b) {
        // if ((a % b) == 0) {
        // System.out.println("São Múltiplos");
        // } else {
        // System.out.println("Não são Múltiplos");
        // }
        // } else {
        // if ((b % a) == 0) {
        // System.out.println("São Múltiplos");
        // } else {
        // System.out.println("Não são Múltiplos");
        // }
        // }

        // EXERCICIO 04
        // Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
        // jogo, sabendo que o mesmo pode
        // começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
        // máxima de 24 horas

        // int horaInicio, horaTermino, duracaoJogo;
        // System.out.println("Informe a hora do inicio do jogo: ");
        // horaInicio = sc.nextInt();
        // System.out.println("Informe a hora do fim do jogo: ");
        // horaTermino = sc.nextInt();
        // duracaoJogo = horaTermino - horaInicio;
        // if (duracaoJogo < 0) {
        // System.out.println("Valores informados inválidos!!!");
        // } else if (0 < duracaoJogo && duracaoJogo <= 1) {
        // System.out.printf("O jogo durou o tempo mínimimo regulamentar de : 1 hora.");
        // } else if (duracaoJogo == 0) {
        // System.out.printf("O jogo durou o tempo máximo regulamentar de : 24 horas.");
        // } else {
        // System.out.printf("O jogo durou o tempo de : " + duracaoJogo + " horas.");
        // }

        // EXERCICIO 5
        // Com base na tabela abaixo, escreva um programa que leia o código de um item e
        // a quantidade deste item. A
        // seguir, calcule e mostre o valor da conta a pagar

        int itemId, qtdeItem;
        double conta;

        System.out.println("LANCHONETE DA CRAUDINHA, COMA E DÊ UMA RISADINHA!!");
        System.out.println("____/CODIGO/____/       ITEM    /____/ PREÇO /____");
        System.out.println("----/  1   /----/CACHORRO QUENTE/----/R$ 4,00/----");
        System.out.println("----/  2   /----/   X-SALADA    /----/R$ 4,50/----");
        System.out.println("----/  3   /----/   X-BACON     /----/R$ 5,00/----");
        System.out.println("----/  4   /----/TORRADA SIMPLES/----/R$ 2,00/----");
        System.out.println("----/  5   /----/  REFRIGERANTE /----/R$ 1,00/----");
        System.out.println("__________________________________________________");
        System.out.println("-----------/INSIRA O CÓDIGO DO PRODUTO:/----------");
        System.out.println("__________________________________________________");
        itemId = sc.nextInt();

        if (itemId == 1) {
            System.out.println("DIGITE A QUANTIDADE:");
            qtdeItem = sc.nextInt();
            conta = qtdeItem * 4.00;
            System.out.println("TOTAL A PAGAR: R$ " + conta);
        } else if (itemId == 2) {
            System.out.println("DIGITE A QUANTIDADE:");
            qtdeItem = sc.nextInt();
            conta = qtdeItem * 4.5;
            System.out.println("TOTAL A PAGAR: R$ " + conta);
        } else if (itemId == 3) {
            System.out.println("DIGITE A QUANTIDADE:");
            qtdeItem = sc.nextInt();
            conta = qtdeItem * 5.00;
            System.out.println("TOTAL A PAGAR: R$ " + conta);
        } else if (itemId == 4) {
            System.out.println("DIGITE A QUANTIDADE:");
            qtdeItem = sc.nextInt();
            conta = qtdeItem * 2.00;
            System.out.println("TOTAL A PAGAR: R$ " + conta);
        } else if (itemId == 5) {
            System.out.println("DIGITE A QUANTIDADE:");
            qtdeItem = sc.nextInt();
            conta = qtdeItem * 1.00;
            System.out.println("TOTAL A PAGAR: R$ " + conta);
        } else {
            System.out.println("ENTRADA INVALIDA");
        }

        sc.close();
    }

}
