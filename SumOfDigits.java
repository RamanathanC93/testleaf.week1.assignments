package week1.assignments;

public class SumOfDigits {
	
	public void summation (int data) {
		int sum = 0;
		while (data > 0) {
			int remainder=data % 10;
			System.out.println(remainder);
			sum= sum + remainder;
			System.out.println(sum);
			
			data = data / 10;
			//System.out.println(data);
		}
		System.out.println("Final Sum of the given digits is " + sum);	
	}
	
	public static void main(String[] args) {
		SumOfDigits s = new SumOfDigits();
		s.summation(123);
	}

}
