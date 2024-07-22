package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int firstNumber = sc.nextInt();
        int secondNumber = sc.nextInt();
        int thirdNumber = sc.nextInt();
        int fourthNumber = sc.nextInt();

        long difference = ((long) firstNumber * secondNumber) - ((long) thirdNumber * fourthNumber);
        System.out.println("Difference = " + difference);
    }
}
