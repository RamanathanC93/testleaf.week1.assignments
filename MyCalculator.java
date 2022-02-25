package week1.assignments;

public class MyCalculator {

	public static void main(String[] args) {
	
		Calculator cal = new Calculator();
		
		int result5 = cal.addition(100, 50, 17);
		System.out.println("Addition whose method from another class is : " + result5 );
		
		int result6 = cal.subtraction(150, 70);
		System.out.println("Subtraction whose method from another class is : " + result6 );
		
		double result7 = cal.multiplication(55.44540, 6.378995);
		System.out.println("Product whose method from another class is : " + result7 );

		float result8 = cal.division(10.05f, 4.57f);
		System.out.println("Division whose method from another class is : " + result8);
	}

}
