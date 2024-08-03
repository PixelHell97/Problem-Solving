package ICPC_Assiut_Newcomers_Training.B;

import java.util.Scanner;

public class B_EvenNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        for (int i = 1; i <= x; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
