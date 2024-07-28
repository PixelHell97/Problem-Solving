package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class O_Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        char s;

        String inputValue = sc.nextLine();
        for (int i = 0; i < inputValue.length(); i++) {
            if (inputValue.charAt(i) == '+' || inputValue.charAt(i) == '-' || inputValue.charAt(i) == '*' || inputValue.charAt(i) == '/') {
                int result = 0;
                a = Integer.parseInt(inputValue.substring(0, i));
                b = Integer.parseInt(inputValue.substring(i + 1));
                s = inputValue.charAt(i);

                switch (s) {
                    case '+':
                        result = a + b;
                        break;

                    case '-':
                        result = a - b;
                        break;

                    case '*':
                        result = a * b;
                        break;

                    case '/':
                        result = a / b;
                        break;

                    default:
                        break;
                }

                System.out.println(result);
                break;
            }
        }
    }
}
