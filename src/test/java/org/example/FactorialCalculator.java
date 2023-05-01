package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigInteger;
import java.util.InputMismatchException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FactorialCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;

        try {
            System.out.print("Enter an integer: ");
             number = scanner.nextInt();

//            if (number < 0) {
//                throw new IllegalArgumentException("Number must be non-negative");
//            }

            BigInteger factorial = BigInteger.ONE;

            for (int i = 1; i <= number; i++) {
                factorial = factorial.multiply(BigInteger.valueOf(i));
            }

            System.out.println(number + "! = " + factorial);

        } catch (IllegalArgumentException e) {
            if (number < 0) {
                throw new  IllegalArgumentException("Number must be non-negative");
            }
            System.out.println("Error: number must be non-negative " + e.getMessage());

        } catch (InputMismatchException e) {
            System.out.println("Error, numbers only: ");

        } finally {
            scanner.close();
        }
    }
}

