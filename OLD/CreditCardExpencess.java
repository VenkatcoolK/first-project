public class CreditCardExpencess {
	
	/*public int calculateMonthlyBillWithInterest(String CardHolderName, int monthlySpends) {
		System.out.println("Credit Card Holder Name :" + CardHolderName);
		int totalMonthlySpentWithInterest =  (monthlySpends + monthlySpends/100 * 5 );
		System.out.println("Monthly Bill With Interest :" + totalMonthlySpentWithInterest);
		return totalMonthlySpentWithInterest;
	}
	
	public void findRemainingBalance(int totalCreditlimit, int totalMonthlySpentWithInterest ) {
		int remainingBalance = totalCreditlimit - totalMonthlySpentWithInterest;
		System.out.println("remainingBalance:" + remainingBalance);
	}
	
	public int totalAmountWithPenaltyForNextMonth( int remainingBalance, int totalMonthlySpentWithInterest ) {
		int totalAmountWithPenaltyForNextMonth = (totalMonthlySpentWithInterest + totalMonthlySpentWithInterest/100 * 5);
		System.out.println("totalAmountWithPenaltyForNextMonth:" + totalAmountWithPenaltyForNextMonth);
		return totalAmountWithPenaltyForNextMonth;
	} */

	public int countMonthlyBillWithIntrest(int monthlySpent) {
		int totalMonthlySpentWithInterest =  (monthlySpent + monthlySpent/100 * 5 );
		System.out.println("totalMonthlySpentWithInterest:" + totalMonthlySpentWithInterest);
		return totalMonthlySpentWithInterest;
	}
	
	
	public int countRemaianingBalance(int totalCreditlimit, int totalMonthlySpentWithInterest) {
		int remainingBalance = totalCreditlimit - totalMonthlySpentWithInterest;
		System.out.println("remainingBalance:" + remainingBalance);
		return remainingBalance;
	}
	
	public int totalAmountWithPenanaltyForNextmonth(int remainingBalance) {
		
		int afterpenalityRemainingBalance = (remainingBalance - remainingBalance/100 *5);
		System.out.println("afterpenalityRemainingBalance:" + afterpenalityRemainingBalance );
		return afterpenalityRemainingBalance;
		
		
		
	}
}



