package week3day3collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingNumbers {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,6,8,10};
		List<Integer> list = new ArrayList<Integer>();
		for(int each: arr)
		{
			list.add(each);
		}
		Collections.sort(list);
		List<Integer> missing = new ArrayList<Integer>();
		System.out.print("Missing numbers are:");
		for(int i=1; i<=list.size()-1; i++)
		{
			if((list.get(i)-list.get(i-1))!=1) 
				Collections.addAll(missing, list.get(i-1)+1);
		}
		System.out.println(missing);
	}

}
