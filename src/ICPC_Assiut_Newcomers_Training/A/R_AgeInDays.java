package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class R_AgeInDays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int personAgeWithDays = sc.nextInt();

        System.out.println(personAgeWithDays / 365 + " years");
        System.out.println((personAgeWithDays % 365) / 30 + " months");
        System.out.println((personAgeWithDays % 365) % 30 + " days");
    }
}
