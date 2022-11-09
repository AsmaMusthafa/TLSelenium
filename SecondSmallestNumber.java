package week1day3;
import java.util.Arrays;

/**
 Classroom Assignment :1
Find the Second smallest number in the array {23,45,67,32,89,22 }
Hint: Use sort to
 */
public class SecondSmallestNumber {

	public static void main(String[] args) {
		int numbers[] = {23,45,67,32,89,22 };
		Arrays.sort(numbers);
		int secondLargest = numbers[(numbers.length)-2];
		System.out.println("Second smallest number of array is: "+numbers[1]);
		System.out.println("Second largest number of array is: "+secondLargest);
	}

}
