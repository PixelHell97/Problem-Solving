package A;

import java.util.Scanner;

public class SayHelloWithCPP {
    public static void main(String[] args) {

        Scanner cin = new Scanner(System.in);

        String inputName = cin.nextLine();

        System.out.println("Hello, " + inputName);
    }
}