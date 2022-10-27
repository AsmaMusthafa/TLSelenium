package week1day2;
/** Assignment 2: Print if the given number is prime

Goal: To understand the problem solving, looping and conditional statement

a) Create a class by name: IsPrime
b) Create a main method using shortcut
c) Write a logic to find if the given number is prime or not
d) Print if it is prime or not

Hint: Iterate through all numbers from 2 to n-1 (input) and 
for every number check if it divides n (input). 
If we find any number that divides, then print non prime number.
If nothing divides(other than 1 or same number), print prime.
 */

public class IsPrime {

	public static void main(String[] args) {
		int number = 1919;
		boolean isPrime = false;
		System.out.print(number+" dividends are: ");
		for(int dividend = 2; dividend<number; dividend++)
		{
			int reminder = number%dividend;
			if(reminder==0) {
				System.out.print(dividend+" ");
				isPrime = true;
			}
		}
		System.out.println();
		if(!isPrime)
			System.out.println(number+" is a prime number");
		else
			System.out.println(number+" is not a prime number");

	}

}
