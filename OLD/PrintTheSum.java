public class PrintTheSum {
	public static void main(String[] args){
		System.out.println("Print The Sum");
		int FirstNum = 150;
		int SecoundNum = 250;
		int ThirdNum = 350;
		
		Calculations calculatingNumbers = new Calculations();
		calculatingNumbers.multiplyingMyNumber(FirstNum, SecoundNum, ThirdNum);
		
		calculatingNumbers.subtractMyNumber(FirstNum, SecoundNum, ThirdNum);
		
		calculatingNumbers.divideMyNumber(FirstNum, SecoundNum, ThirdNum);
		calculatingNumbers.sumOffMyNumber(FirstNum, SecoundNum, ThirdNum);
		//calculatingNumbers.remainderofOffMyNumber(ThirdNum, FirstNum);
	}
	
	
}