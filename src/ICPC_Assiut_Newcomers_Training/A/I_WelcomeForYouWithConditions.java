package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class I_WelcomeForYouWithConditions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if (a >= b) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
