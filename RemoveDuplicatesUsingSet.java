package week3day4setwebtable;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

/**
 	 * a) Use the declared String text as input
		String text = "We learn java basics as part of java sessions in java week1";		
	 * b) Initialize an integer variable as count	  
	 * c) Split the String into array and iterate over it 
	 * d) Initialize another loop to check whether the word is there in the array
	 * e) if it is available then increase and count by 1. 
	 * f) if the count > 1 then replace the word as "" 
	 
	 * g) Displaying the String without duplicate words
 */
public class RemoveDuplicatesUsingSet {

	public static void main(String[] args) {
		String lengthyString = "We learn java basics as part of java sessions in java week1";
		String[] splitString = lengthyString.split(" ");
		List<String> list = new ArrayList<String> ();
		
		for (String eachString : splitString) {
			list.add(eachString);
		}
		System.out.println("Size of the list is: "+list.size());
		System.out.println("Words added in list: "+list);	
		
		
		Set<String> set = new LinkedHashSet<String> (list);
		System.out.println("Size of the set is: "+set.size());
		System.out.println("Removed duplicate words using Set: "+set);
		
	}

}
