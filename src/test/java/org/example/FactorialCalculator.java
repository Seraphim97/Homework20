package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            int number = scanner.nextInt();

            if (number < 0) {
                throw new IllegalArgumentException("Number must be non-negative!");
            }

            BigInteger factorial = BigInteger.ONE;

            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println(number + "! = " + factorial);

        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());

        } catch (Exception e) {
            System.out.println("Error, numbers only: ");

        } finally {
            scanner.close();
        }
    }
}




