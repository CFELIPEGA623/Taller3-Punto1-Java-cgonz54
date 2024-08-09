import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int A, B, C;

        System.out.print("Ingresa el valor de A: ");
        A = scanner.nextInt();
        System.out.print("Ingresa el valor de B: ");
        B = scanner.nextInt();
        System.out.print("Ingresa el valor de C: ");
        C = scanner.nextInt();

        if (A == B || A == C || B == C) {
            System.out.println("Los valores ingresados son iguales.");
        } else {
            if (A > B && A > C) {
                System.out.println("El mayor valor es: " + A);
                if (B > C) {
                    System.out.println("El menor valor es: " + C);
                } else {
                    System.out.println("El menor valor es: " + B);
                }
            } else if (B > A && B > C) {
                System.out.println("El mayor valor es: " + B);
                if (A > C) {
                    System.out.println("El menor valor es: " + C);
                } else {
                    System.out.println("El menor valor es: " + A);
                }
            } else {
                System.out.println("El mayor valor es: " + C);
                if (A > B) {
                    System.out.println("El menor valor es: " + B);
                } else {
                    System.out.println("El menor valor es: " + A);
                }
            }
        }

        scanner.close();
    }
}