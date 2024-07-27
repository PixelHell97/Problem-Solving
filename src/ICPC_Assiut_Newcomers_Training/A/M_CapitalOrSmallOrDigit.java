package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class M_CapitalOrSmallOrDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input = sc.nextLine().charAt(0);

        if (Character.isDigit(input)) {
            System.out.println("IS DIGIT");
        } else if (Character.isLetter(input)) {
            System.out.println("ALPHA");
            if (Character.isUpperCase(input)) {
                System.out.println("IS CAPITAL");
            } else {
                System.out.println("IS SMALL");
            }
        }
    }
}
