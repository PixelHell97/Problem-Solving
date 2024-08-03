package ICPC_Assiut_Newcomers_Training.B;

import java.util.Scanner;

public class E_Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfValues = sc.nextInt();

        int maxNumber = Integer.MIN_VALUE;
        int i = 0;
        while (i < numberOfValues) {
            int number = sc.nextInt();
            if (number > maxNumber) {
                maxNumber = number;
            }
            i++;
        }
        System.out.println(maxNumber);
    }
}
