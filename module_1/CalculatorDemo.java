package module_1;

import java.util.*;

class MyCalculator {
	double a, b;

	MyCalculator(double num1, double num2) {
		a = num1;
		b = num2;
	}

	double Add() {
		return (a + b);
	}

	double Subtract() {
		return (a - b);
	}

	double Multiply() {
		return (a * b);
	}

	double Divide() {
		return (a / b);
	}
}

public class CalculatorDemo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int choice;
		char continueCal = 'y';
		do {

			System.out.println("Calculator Menu \n");
			System.out.println("1.Add \n");
			System.out.println("2.Subtract \n");
			System.out.println("3.Multiply \n");
			System.out.println("4.Divide \n");
			System.out.println("Enter your choice (1-4): ");
			choice = sc.nextInt();
			double num1, num2;
			System.out.println("Enter two numbers: \n");
			num1 = sc.nextDouble();
			num2 = sc.nextDouble();
			sc.nextLine();
			MyCalculator b1 = new MyCalculator(num1, num2);

			switch (choice) {
				case 1: {

					double add = b1.Add();
					System.out.println("Add value = " + add);
					break;
				}
				case 2: {

					double Subtract = b1.Subtract();
					System.out.println("Subtract value = " + Subtract);
					break;
				}
				case 3: {

					double Multiply = b1.Multiply();
					System.out.println("Multiply value = " + Multiply);
					break;
				}
				case 4: {

					double Divide = b1.Divide();
					System.out.println("Divide value = " + Divide);
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + choice);

			}
			System.out.println("Do you want to continue? (Y/N):");
			continueCal = sc.next().charAt(0);
		} while (continueCal == 'Y' || continueCal == 'y');
		System.err.println("Thank you for using the calculator");
		sc.close();
	}
}
