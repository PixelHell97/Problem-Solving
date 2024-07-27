package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class K_MaxAndMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int maxNum;
        int minNum;

        if (a >= b && a >= c) {
            maxNum = a;
            minNum = Math.min(b, c);
        } else if (b >= a && b >= c) {
            maxNum = b;
            minNum = Math.min(a, c);
        } else {
            maxNum = c;
            minNum = Math.min(a, b);
        }

        System.out.println(minNum + " " + maxNum);
    }
}
