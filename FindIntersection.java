package week3day3collection;

import java.util.ArrayList;
import java.util.List;

public class FindIntersection {

	public static void main(String[] args) {
		int arr1[] = {3,2,11,4,6,7};
		int arr2[] = {1,2,8,4,9,7};
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(int each : arr1)
		{
			list1.add(each);
		}
		
		List<Integer> list2 = new ArrayList<Integer>();
		for(int each : arr2)
		{
			list2.add(each);
		}
		System.out.println("Common numbers in both arrays: ");
		for(int i=0; i<list1.size(); i++)
		{
			for(int j=0; j<list2.size();j++)
			{
				if(list1.get(i)==list2.get(j))
					System.out.println(" "+list1.get(i));
			}
		}
		
	}

}
