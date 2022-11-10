package week3day3collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargestNumber {

	public static void main(String[] args) {
		int numbers[] = {3,2,11,4,6,7};
		List<Integer> list = new ArrayList<Integer>();
		
		for(int each : numbers)
		{
			list.add(each);
		}
		Collections.sort(list);
		System.out.print("Sorted numbers: ");
		for(int i=0; i<list.size();i++)
		{
			System.out.print(" "+list.get(i));
		}
		int secondLargestNumber = list.get((list.size())-2);
		System.out.println("\nSecond Largest Number is: "+secondLargestNumber);

	}

}
