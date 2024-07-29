package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class W_Mathematical_Expression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        char operator = sc.next().charAt(0);
        int b = sc.nextInt();
        char equal = sc.next().charAt(0);
        int inputResult = sc.nextInt();

        int result = switch (operator) {
            case '+' -> a + b;
            case '-' -> a - b;
            case '*' -> a * b;
            default -> 0;
        };

        if (result != inputResult) {
            System.out.println(result);
        } else {
            System.out.println("Yes");
        }
    }
}
