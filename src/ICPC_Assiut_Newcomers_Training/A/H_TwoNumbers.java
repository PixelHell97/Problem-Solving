package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class H_TwoNumbers {

    static int getTheFloorResult(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

    static int getTheCielResult(int firstNumber, int secondNumber) {
        double result = ((double) firstNumber / secondNumber);
        if(result == 1)
            return 1;
        else
            return (int) (result + 1);
    }

    static int getTheRoundResult(int firstNumber, int secondNumber) {
        double result = (double) firstNumber / secondNumber;
        String resultInString = String.valueOf(result);
        String firstDecimalNumber = resultInString.substring(resultInString.indexOf('.') + 1, resultInString.indexOf('.') + 2);
        int firstDecimal = Integer.parseInt(firstDecimalNumber);
        if (firstDecimal < 5) {
            return (int) result;
        } else {
            return (int) result + 1;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();


        System.out.println("floor " + a + " / " + b + " = " + getTheFloorResult(a, b));
        System.out.println("ceil " + a + " / " + b + " = " + getTheCielResult(a, b));
        System.out.println("round " + a + " / " + b + " = " + getTheRoundResult(a, b));
    }
}
