package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class P_FirstDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int input = sc.nextInt();

        if (getTheFirstDigit(input) % 2 == 0) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }
    }

    private static int getTheFirstDigit(int input) {
        int firstDigit = 0;

        while (input != 0) {
            firstDigit = input % 10;
            input /= 10;
        }

        return firstDigit;
    }
}
