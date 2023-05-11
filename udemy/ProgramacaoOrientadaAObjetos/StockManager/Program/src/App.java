
import java.util.Locale;
import java.util.Scanner;

import entities.Product;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Product product = new Product();
        System.out.println("Informe os dados do produto:");
        System.out.println("Nome:");
        product.name = sc.nextLine();
        System.out.println("Preço:");
        product.price = sc.nextDouble();
        System.out.println("Quantidade em estoque:");
        product.quantity = sc.nextInt();

        // System.out.println(product.name + ", " + product.price + ", " +
        // product.quantity);
        // System.out.println(product.toString());
        System.out.println();
        System.out.println("Product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be added in stock: ");
        int quantity = sc.nextInt();
        product.addProducts(quantity);

        System.out.println();
        System.out.println("Updated product data: " + product);

        System.out.println();
        System.out.println("Enter the number of products to be removed in stock: ");
        quantity = sc.nextInt();
        product.removeProducts(quantity);

        System.out.println();
        System.out.println("Updated product data: " + product);

        sc.close();

    }
}
