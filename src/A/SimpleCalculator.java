package A;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int firstNum = sc.nextInt();
        int secondNum = sc.nextInt();

        System.out.println(firstNum + " + " + secondNum + " = " + (firstNum + secondNum));
        System.out.println(firstNum + " * " + secondNum + " = " + ((long)firstNum * secondNum));
        System.out.println(firstNum + " - " + secondNum + " = " + (firstNum - secondNum));
    }
}
