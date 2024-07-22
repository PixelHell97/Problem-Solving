package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class AreaOfACircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        final double PI = 3.141592653;

        float radius = sc.nextFloat();
        double area = PI * radius * radius;

        System.out.printf("%.9f", area);
    }
}
