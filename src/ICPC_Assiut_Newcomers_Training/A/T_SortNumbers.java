package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class T_SortNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a <= b && a <= c) {
            System.out.println(a);
            System.out.println(Math.min(b, c));
            System.out.println(Math.max(b, c));
        } else if (b < a && b < c) {
            System.out.println(b);
            System.out.println(Math.min(a, c));
            System.out.println(Math.max(a, c));
        } else {
            System.out.println(c);
            System.out.println(Math.min(a, b));
            System.out.println(Math.max(a, b));
        }

        System.out.println();

        System.out.println(a + "\n" + b + "\n" + c);
    }
}
