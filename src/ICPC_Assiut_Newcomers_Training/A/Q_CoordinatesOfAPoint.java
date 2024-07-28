package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class Q_CoordinatesOfAPoint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double xAxis = sc.nextDouble();
        double yAxis = sc.nextDouble();

        if (xAxis == 0 && yAxis == 0) {
            System.out.println("Origem");
        } else if (xAxis == 0) {
            System.out.println("Eixo Y");
        } else if (yAxis == 0) {
            System.out.println("Eixo X");
        } else if (xAxis > 0 && yAxis > 0) {
            System.out.println("Q1");
        } else if (xAxis < 0 && yAxis < 0) {
            System.out.println("Q3");
        } else if (xAxis > 0 && yAxis < 0) {
            System.out.println("Q4");
        } else if (xAxis < 0 && yAxis > 0) {
            System.out.println("Q2");
        }
    }
}
