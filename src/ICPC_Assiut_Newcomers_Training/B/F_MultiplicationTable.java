package ICPC_Assiut_Newcomers_Training.B;

import java.util.Scanner;

public class F_MultiplicationTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int baseNumber = sc.nextInt();

        for (int i = 1; i <= 12; i++) {
            System.out.println(baseNumber + " * " + i + " = " + baseNumber * i);
        }
    }
}
