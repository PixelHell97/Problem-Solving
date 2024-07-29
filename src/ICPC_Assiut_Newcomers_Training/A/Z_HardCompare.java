package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class Z_HardCompare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();

        double logA = Math.log(a);
        double logC = Math.log(c);

        if (b * logA > d * logC) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}
