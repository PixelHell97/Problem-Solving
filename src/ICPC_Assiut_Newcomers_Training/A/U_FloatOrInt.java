package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class U_FloatOrInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String inputNumber = sc.nextLine();

        int realNumber = 0;
        int decimalNumber = 0;

        for (int i = 0; i < inputNumber.length(); i++) {
            if (inputNumber.charAt(i) == '.') {
                for (int j = i + 1; j < inputNumber.length(); j++) {
                    decimalNumber = (decimalNumber * 10) + Integer.parseInt(String.valueOf(inputNumber.charAt(j)));
                }
                break;
            }
            realNumber = (realNumber * 10) + Integer.parseInt(String.valueOf(inputNumber.charAt(i)));
        }
        if (decimalNumber == 0) {
            System.out.println("int " + realNumber);
        } else {
            System.out.println("float " + realNumber + " 0." + decimalNumber);
        }
    }
}
