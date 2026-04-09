package application;

import java.util.Scanner;

import com.calculator.utils.Calculator;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("Enter your first value: ");
			double number1 = sc.nextDouble();

			System.out.print("Enter your second value: ");
			double number2 = sc.nextDouble();

			System.out.println("Sum: " + Calculator.sum(number1, number2));
			System.out.println("Subtraction: " + Calculator.sub(number1, number2));
			System.out.printf("Multiplication: %.2f%n", Calculator.mul(number1, number2));

			try {
				System.out.printf("Division: %.2f%n", Calculator.div(number1, number2));
			} catch (ArithmeticException e) {
				System.out.println("Error: " + e.getMessage());
			}
		} catch (Exception e) {
			System.out.println("Invalid input. Please enter numbers only.");
		}

		sc.close();
	}

}
