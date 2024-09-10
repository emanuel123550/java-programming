import java.util.Scanner;

public class AdmissionEligibilityChecker {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);


        System.out.print("Input the marks obtained in Physics: ");
        int physics = scanner.nextInt();

        System.out.print("Input the marks obtained in Chemistry: ");
        int chemistry = scanner.nextInt();

        System.out.print("Input the marks obtained in Mathematics: ");
        int mathematics = scanner.nextInt();


        int totalMarks = physics + chemistry + mathematics;


        int totalMathsPhysics = mathematics + physics;


        if (mathematics >= 65 && physics >= 55 && chemistry >= 50) {
            if (totalMarks >= 190 || totalMathsPhysics >= 140) {
                System.out.println("The candidate is eligible for admission.");
            } else {
                System.out.println("The candidate is not eligible for admission.");
            }
        } else {
            System.out.println("The candidate is not eligible for admission.");
        }

        scanner.close();
    }
}
