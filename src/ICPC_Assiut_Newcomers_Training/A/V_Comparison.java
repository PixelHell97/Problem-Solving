package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class V_Comparison {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char s = sc.next().charAt(0);
        int b = sc.nextInt();

        switch (s) {
            case '<':
                if (a < b) System.out.println("Right"); else System.out.println("Wrong");
                break;
            case '>':
                if (a > b) System.out.println("Right"); else System.out.println("Wrong");
                break;

            case '=':
                if (a == b) System.out.println("Right"); else System.out.println("Wrong");
        }
    }
}
