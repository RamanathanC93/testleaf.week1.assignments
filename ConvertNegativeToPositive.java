package week1.assignments;

public class ConvertNegativeToPositive {
	
	public int conversion(int num){
		
		if (num <0) {
			num = -(num);
		}
		
		return num;
	}

	public static void main(String[] args) {
		
		ConvertNegativeToPositive conv = new ConvertNegativeToPositive();
		
		int result = conv.conversion(-50);
		System.out.println("The given number is converted to : " + result);
	}

}
