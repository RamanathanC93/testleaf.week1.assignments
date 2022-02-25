package week1.assignments;

public class Fibonacci {

	public static void main(String[] args) {
		
		int range=8;
		int firstNum=0;
		int secondNum=1;
		System.out.println(firstNum);
		System.out.println(secondNum);
				
		for (int j = 1; j < range; j++) {
					
			int sum= firstNum + secondNum;
			firstNum = secondNum;
			secondNum = sum;
			
			System.out.println(sum);
		}
	}
}
