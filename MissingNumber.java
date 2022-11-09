package week2day4;

public class MissingNumber {

	public static void main(String[] args) {
		int[] arr = {1,2,3,4,7,6,8};
		for(int i=1;i<arr.length;i++)
		{
			if(i!=arr[i-1])
			{
				System.out.println("Missing number is: "+i);
				break;
			}
		}

	}

}
