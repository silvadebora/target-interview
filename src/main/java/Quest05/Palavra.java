package Quest05;

import java.util.Scanner;

public class Palavra {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Insira uma palavra:");
        String input = scanner.next();
        System.out.println("Resultado " + myReverse(input));
    }


    public static String myReverse(String userInput) {

        byte[] strAsByteArray = userInput.getBytes();
        byte[] result = new byte[strAsByteArray.length];

        for (int i = 0; i < strAsByteArray.length; i++)
            result[i] = strAsByteArray[strAsByteArray.length - i - 1];

        return new String(result);
    }
}