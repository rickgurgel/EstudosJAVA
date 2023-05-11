import java.util.Locale;
import java.util.Scanner;

import entities.Employee;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Employee employee = new Employee();
        System.out.println("Input the data about your employee: ");
        System.out.println("Name: ");
        employee.name = sc.nextLine();
        System.out.println("Gross Salary: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Tax deductions: ");
        employee.tax = sc.nextDouble();

        System.out.println("Employee: " + employee);

        System.out.println("Which percentage to increase salary? ");
        double percentage = sc.nextDouble();
        employee.increaseSalary(percentage);
        System.out.println("Updated data:" + employee);

        sc.close();
    }
}
