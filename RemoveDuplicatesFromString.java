package week3day4setwebtable;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicatesFromString {

	public static void main(String[] args) {
		String str = "TestLeaf";
		
		//Convert String to charArray
		char c[] = str.toCharArray();
		
		Set<Character> set = new LinkedHashSet<Character>();
		
		for(Character each : c)
		{
			set.add(each);
		}
		System.out.println(set); //[T, e, s, t, L, a, f]

	}

}
