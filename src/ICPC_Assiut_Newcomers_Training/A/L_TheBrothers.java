package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class L_TheBrothers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String firstName = sc.nextLine();
        String firstFatherName = firstName.trim().substring(firstName.indexOf(" "));
        String secondName = sc.nextLine();
        String secondFatherName = secondName.trim().substring(secondName.indexOf(" "));

        if (firstFatherName.equals(secondFatherName)) {
            System.out.println("ARE Brothers");
        } else {
            System.out.println("NOT");
        }
    }
}
