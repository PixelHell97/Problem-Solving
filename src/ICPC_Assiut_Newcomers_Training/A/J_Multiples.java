package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class J_Multiples {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a > b) {
            if (a % b == 0) {
                System.out.println("Multiples");
            } else {
                System.out.println("No Multiples");
            }
        } else {
            if (b % a == 0) {
                System.out.println("Multiples");
            } else {
                System.out.println("No Multiples");
            }
        }
    }
}
