package main.java.ru.olga;

import java.util.Scanner;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        System.out.println("0's at the end: " + calculationTrailingZeros(n));
    }

    /**
     * Method to count the number of zeros at the end of factorial.
     * <p>
     * Number of zero at the end factorial is found by formula:
     * n/5+n/5^2••••••• till 5^k is less than or equal to n
     *
     * @param n non-negative integer value
     * @return number of zeros at the end of factorial
     */

    public static int calculationTrailingZeros(int n) {
        int zeros = 0;
        while (n != 0) {
            zeros += n / 5;
            n /= 5;
        }
        return zeros;
    }

}