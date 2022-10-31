package week1day3;
/**
 * Find the count of given character in a String
String str = "cognizant";
char ch = 'c'; // 1
Goal: To understand the String, loop, if 
a) Create a class by name: FindCharCount (with main method) in same package
b) Write a logic to find the number of occurances of a given character
c) Run and Confirm the correct character count is printed in console
Hint: Convert the String to character array, loop and compare with the input charac
 */
public class FindCount {

	public static void main(String[] args) {
		String str = "characterc";	
		char ch = 'c';

		// Creating array of string length
		char charArray[] = new char[str.length()];
		int count = 0;
		for(int i=0;i<str.length();i++)
		{
			charArray[i] = str.charAt(i);
			//System.out.println(charArray[i]);
			
			if(ch==charArray[i]) 
			{
				count++;
			}	
		}System.out.println(ch+" is appeared "+count+" times");


	}

}
