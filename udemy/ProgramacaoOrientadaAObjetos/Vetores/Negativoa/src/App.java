import java.util.Locale;
import java.util.Scanner;

import entities.Pessoas;

public class App {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        // 1
        //Faça um programa que leia um número inteiro positivo 
        // N (máximo = 10) e depois N números inteiros
        // e armazene-os em um vetor. Em seguida, mostrar na 
        // tela todos os números negativos lidos.
        // System.out.println("Quantos numeros você vai digitar? ");
        // int entry = sc.nextInt();
        // int[] negativos = new int[entry];
        
        // for (int i = 0; i < negativos.length; i++){
        //     sc.nextLine();
        //     System.out.println("Digite um número: ");
        //     negativos[i] = sc.nextInt();
        // }
        
        // System.out.println("NUMEROS NEGATIVOS:");
        // for (int j = 0; j < negativos.length; j++){
        //     if (negativos[j] < 0){
        //         System.out.println(negativos[j]);
        //     }
        // }
        
        
        // 2 
        // Faça um programa que leia N números reais e armazene-os
        // em um vetor. Em seguida:
        // - Imprimir todos os elementos do vetor
        // - Mostrar na tela a soma e a média dos elementos do vetor 

        // System.out.println("Quantos numeros você vai digitar? ");
        // int entry = sc.nextInt();
        // double[] valores = new double[entry];
        
        // for (int i = 0; i < valores.length; i++){
        //     sc.nextLine();
        //     System.out.println("Digite um número: ");
        //     valores[i] = sc.nextDouble();
        // }

        // System.out.println("VALORES: ");
        // double sum = 0;
        // for (int i = 0; i < valores.length; i++){
        //     System.out.println(valores[i]);
        //     sum += valores[i];
        // }
        // System.out.println("SOMA: " + sum);
        // double average = sum / valores.length;
        // System.out.println("MÉDIA: " + average);

        //3 
        //Fazer um programa para ler nome, idade e
        //altura de N pessoas, conforme exemplo.
        //Depois, mostrar na tela a altura média das pessoas,
        // e mostrar também a porcentagem de pessoas
        // com menos de 16 anos, bem como os nomes dessas pessoas 
        // caso houver. 
        
        System.out.println("Quantos pessoas você vai digitar? ");
        int entry = sc.nextInt();
        Pessoas[] pessoas = new Pessoas[entry];
        
        for (int i = 0; i < pessoas.length; i++){
            System.out.println("NAME:");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.println("AGE:");
            int age = sc.nextInt();
            System.out.println("HEIGHT:");
            double height = sc.nextDouble();
            pessoas[i] = new Pessoas(name, age, height);
        }
        for (int i = 0; i < pessoas.length; i++){
            System.out.println(pessoas[i]);
        }
        
        sc.close();
    }
}
