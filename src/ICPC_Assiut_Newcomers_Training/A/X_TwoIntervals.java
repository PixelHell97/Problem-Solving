package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class X_TwoIntervals {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();

        int lBoundary = 0;
        int rBoundary = 0;

        if (l1 <= r1 && l2 <= r2 && r1 >= l2) {
            for (int i = l1; i <= r1; i++) {
                if (i == l2 || i == l1) {
                    lBoundary = i;
                }
                if (i <= r2) {
                    rBoundary = i;
                }
            }
            if (lBoundary <= rBoundary) {
                System.out.println(lBoundary + " " + rBoundary);
            }else{
                System.out.println("-1");
            }
        }else {
            System.out.println("-1");
        }
    }
}
