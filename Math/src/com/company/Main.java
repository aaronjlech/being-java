package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String num1 = scanner.nextLine();
        String num2 = scanner.nextLine();

        double operand1 = Double.parseDouble(num1);
        double operand2 = Double.parseDouble(num2);
        sum(operand1, operand2);

        difference(operand1, operand2);

        division(operand1, operand2);

        multiply(operand1, operand2);
    }
    public static void sum(Double num1, Double num2) {
        System.out.print(num1 + num2 );
    }
    public static void difference(Double num1, Double num2) {
        System.out.print(num1 - num2);
    }
    public static void division(Double num1, Double num2) {
        System.out.print(num1 - num2);
    }
    public static void multiply(Double num1, Double num2) {
        System.out.print(num1 * num2);
    }
}