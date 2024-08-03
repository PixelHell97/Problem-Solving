package ICPC_Assiut_Newcomers_Training.B;

import java.util.Scanner;

public class C_EvenOddPositiveAndNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int numberOfValues = sc.nextInt();

        int numberOfPositives = 0;
        int numberOfNegatives = 0;
        int numberOfOdds = 0;
        int numberOfEvens = 0;

        for (int i = 0; i < numberOfValues; i++) {
            int value = sc.nextInt();
            if (value % 2 == 0) {
                if (value > 0) {
                    numberOfPositives++;
                } else if (value < 0) {
                    numberOfNegatives++;
                }
                numberOfEvens++;
            } else {
                if (value > 0) {
                    numberOfPositives++;
                } else {
                    numberOfNegatives++;
                }
                numberOfOdds++;
            }
        }
        System.out.println("Even: " + numberOfEvens);
        System.out.println("Odd: " + numberOfOdds);
        System.out.println("Positive: " + numberOfPositives);
        System.out.println("Negative: " + numberOfNegatives);
    }
}
