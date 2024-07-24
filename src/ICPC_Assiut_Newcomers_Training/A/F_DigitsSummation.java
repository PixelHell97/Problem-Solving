package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class F_DigitsSummation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long firstDigit = sc.nextLong();
        long secondDigit = sc.nextLong();

        System.out.println((firstDigit % 10) + (secondDigit % 10));
    }
}
