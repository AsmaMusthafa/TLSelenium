package week1day2;
/**Assignment 1: Print Fibbinocci series for first 11 be numbers

Fibonacci Series - 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233 

Goal: To understand the arthimetic operation and loop

a) Create a class by name: Fibbinocci
b) Create a main method using shortcut
c) Write a logic to print fibbinocci from 0 to 56

Hints: 

Initialize 3 int variables (Tip: firstNum = 0, secNum = 1, sum = 0)
Print first number
Iterate from 1 to the 11
Add first and second number assign to sum
Assign second number to the first number
Assign sum to the second number
Print sum**/

public class Fibonacci {

	public static void main(String[] args) {
		int num = 11, first_number = 0, second_number = 1, sum = 0;
		System.out.print("Fibonacci series from 0 to 56 :");
		for(int iteration = 0; iteration<num; iteration++) {
			sum = sum+first_number;
			first_number = second_number;
			second_number = sum;
			System.out.print(" "+sum);
		}

	}

}
