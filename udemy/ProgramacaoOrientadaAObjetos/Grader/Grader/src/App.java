import java.util.Locale;
import java.util.Scanner;

import entities.Student;

public class App {
    public static void main(String[] args) throws Exception {

        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        Student student = new Student();
        System.out.println("Inform the data about the student: ");
        System.out.println("Name: ");
        student.name = sc.nextLine();
        System.out.println("First Trimerster Grade: ");
        student.firstTrimester = sc.nextDouble();
        System.out.println("Second Trimerster Grade: ");
        student.secondTrimester = sc.nextDouble();
        System.out.println("Third Trimerster Grade: ");
        student.thirdTrimester = sc.nextDouble();

        student.checkGrade();
        System.out.println("FINAL GRADE = " + student.sumOfGrades());
        System.out.println(student.resultMessage());

        sc.close();
    }
}
