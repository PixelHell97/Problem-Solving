package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class N_Char {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char input = sc.next().charAt(0);

        if (Character.isLowerCase(input)) {
            input -= 32;
            System.out.println(input);
        } else {
            input += 32;
            System.out.println(input);
        }
    }
}
