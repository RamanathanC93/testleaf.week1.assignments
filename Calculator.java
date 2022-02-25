package week1.assignments;

public class Calculator {
	
	public int addition (int num1, int num2, int num3) {
		int sum = num1+ num2 + num3;		
		return sum;		
	}
	
	public int subtraction (int num1, int num2) {
		int difference = num1 - num2;
		return difference;
	}
	
	public double multiplication (double num1, double num2) {
		double Product = num1 * num2;
		return Product;
	}
	
	public float division (float num1, float num2) {
		float divide = num1 / num2;
		return divide;
	}
	
	public static void main(String[] args) {
		
		  Calculator cal = new Calculator(); 
		  
		  int result1 = cal.addition(10, 5, 2);
		  System.out.println("Sum of the numbers is " + result1);
		  
		  int result2 = cal.subtraction(10, 5);
		  System.out.println("Diff of the numbers is " + result2);
		  
		  double result3 = cal.multiplication(10.25, 5);
		  System.out.println("Product of the numbers is " + result3);
		  
		  float result4 = cal.division(100.0f, 5.27f);
		  System.out.println("Quotient of the divided numbers is " + result4);

	}

}
