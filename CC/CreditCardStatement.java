public class CreditCardStatement {
	public static void main(String [] args) {
	      System.out.println("Credit card statement");
		  
			int totalCreditCardLimit = 10000; // Can be change
			int monthlySpent = 2000; // Can be change
			
			CreditCardExpencess creditCard = new CreditCardExpencess();

			// 1. Find montly bill with intrest 
			int monthlyBill = creditCard.countMonthlyBillWithIntrest(monthlySpent);
			// 2. Find remaning balance from the total limit
			int TotalBill = creditCard.countRemaianingBalance(totalCreditCardLimit, monthlyBill);
			
			// 3. Find total amount with penanalty for nextmonth(assume customer not paid current month)
			
			int afterTwoMonthsRemainingBalance = creditCard.totalAmountWithPenanaltyForNextmonth(TotalBill);
			
			
			
			
			
			// int monthBillWithIntrest = creditCard.calculateMonthlyBillWithInterest("ABC", monthlySpent);
			
			// creditCard.findRemainingBalance(totalCreditCardLimit, monthBillWithIntrest);
			
			// creditCard.totalAmountWithPenaltyForNextMonth(findRemainingBalance, totalAmountWithPenaltyForNextMonth );
			
			
			
	}
		
	
}