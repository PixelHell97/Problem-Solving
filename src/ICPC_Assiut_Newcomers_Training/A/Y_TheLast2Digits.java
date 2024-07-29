package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class Y_TheLast2Digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        long result = (a * b % 100 * c % 100 * d % 100) % 100;

        System.out.printf("%02d%n", result);
    }
}
