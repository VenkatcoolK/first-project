public class CreditCardExpences{
	public int calculatingMonthlyBillWithExpances(String creditCardHolderName, int monthlySpent){
		System.out.println("Credit Card Holder Name:" + creditCardHolderName);
		int totalMonthlySpentWithInterest = (monthlySpent + monthlySpent/100 * 5);
		System.out.println("Monthly Bill With Interest:" + totalMonthlySpentWithInterest);
		return totalMonthlySpentWithInterest;
	}
	
}