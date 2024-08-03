package ICPC_Assiut_Newcomers_Training.B;

import java.util.Scanner;

public class D_FixedPassword {
    public static void main(String[] args) {
        final int password = 1999;
        Scanner sc = new Scanner(System.in);

        while (true) {
            int enteredPassword = sc.nextInt();

            if (enteredPassword != password) {
                System.out.println("Wrong");
            } else {
                System.out.println("Correct");
                break;
            }
        }
    }
}
