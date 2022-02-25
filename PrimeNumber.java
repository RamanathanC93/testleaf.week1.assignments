package week1.assignments;

public class PrimeNumber {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		int checkNum = 17;
		boolean isPrime = false;
		
		for (int i = 2; i < checkNum/2; i++) {
			
			if (checkNum % i == 0)
			{
				isPrime = true;
			}
			break;
		}
		
		if (isPrime==false)
			System.out.println(checkNum + " is a Prime Number");
		else
			System.out.println(checkNum + " is a Non-Prime Number");

	}

}
