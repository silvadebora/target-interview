package Quest02;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int input = scanner.nextInt();
        System.out.println("Pertence a sequência fibonnacci " + isFibonacci(input));
    }

    public static boolean isFibonacci(int userInput) {

        int term1 = 0;
        int term2 = 1;
        if (userInput == term1 || userInput == term2) return true;
        int counter = term1 + term2;
        while (counter <= userInput) {
            if (counter == userInput) return true;
            term1 = term2;
            term2 = counter;
            counter = term1 + term2;
        }
        return false;
    }
}
