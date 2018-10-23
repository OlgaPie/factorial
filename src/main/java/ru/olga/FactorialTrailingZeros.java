package main.java.ru.olga;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialTrailingZeros {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = s.nextInt();
        String fact = calculationFactorial(n);
        System.out.println("0's at the end: " + calculationTrailingZeros(fact));
    }

    public static int calculationTrailingZeros(String fact) {
        StringBuilder reverse = new StringBuilder(fact).reverse();
        int zeros = 0;
        for (int i = 0; i < reverse.length() - 1; i++) {
            if (reverse.charAt(i) == '0') {
                zeros++;
            } else {
                break;
            }
        }
        return zeros;
    }

    public static String calculationFactorial(int n) {
        BigInteger fact = new BigInteger("1");
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(new BigInteger(i + ""));
        }
        return fact.toString();
    }

}