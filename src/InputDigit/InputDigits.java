package InputDigit;

import java.util.Scanner;

public class InputDigits {

    static boolean isPrimeNumber(int digit) {

        boolean isPrimeNumber = true;

        if (digit == 1) {
            isPrimeNumber = false;
        } else if (digit == 2 | digit == 3) {
            isPrimeNumber = true;
        } else {
            for (int i = 2; i <= digit / 2; i++) {
                if (digit % i == 0) {
                    isPrimeNumber = false;
                    break;
                }
            }
        }
        return isPrimeNumber;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter digits, for exit enter finish");

        while (true) {
            if (input.hasNextInt()) {
                int digit = input.nextInt();
                if (digit > 0) {
                    if (isPrimeNumber(digit)) {
                        System.out.println("Digit is prime");
                    } else {
                        System.out.println("Digit is not prime");
                    }
                } else {
                    System.out.println("Input error - please enter integer more than zero, for exit enter finish");
                }
            } else {
                String digit = input.next();
                if (digit.equals("finish")) {
                    break;
                } else {
                    System.out.println("Input error - please enter the digit, for exit enter finish");
                }
            }
        }
    }
}