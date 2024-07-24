package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class B_BasicDataTypes {

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);

        int newInt = cin.nextInt();
        long newLong = cin.nextLong();
        char newChar = cin.next().charAt(0);
        float newFloat = cin.nextFloat();
        double newDouble = cin.nextDouble();

        System.out.println(newInt + "\n" + newLong + "\n" + newChar + "\n" + newFloat + "\n" + newDouble);
    }
}
