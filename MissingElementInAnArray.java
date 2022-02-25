package week1.assignments;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		
		int[] values = {1,2,3,4,7,6,8};
		
		Arrays.sort(values); // {1,2,3,4,6,7,8}
		
		for (int i = 1; i < values.length; i++) {
			
			if(i != values[i-1])  // 1 != values [1-1] ===>  1 != values[0] ===> 1!= 1 ===> failed
			{
				System.out.println("First missing element in the Array is : " + i);
				break;
			}
		}
	}
}
