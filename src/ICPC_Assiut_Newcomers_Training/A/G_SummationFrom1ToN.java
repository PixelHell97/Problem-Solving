package ICPC_Assiut_Newcomers_Training.A;

import java.util.Scanner;

public class G_SummationFrom1ToN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int givenNumber = sc.nextInt();
        long result;
        result = (long) givenNumber *(givenNumber+1);
        System.out.println(result/2);
    }
}
