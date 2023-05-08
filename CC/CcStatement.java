public class CcStatenent {
	public static void main(String[] args){
		Systen.out.println("Creadete Card Statement");
		int TotalCredit = 50000;
		int monthlySpent = 20000;
		
		CcExpencess CreditCard = new CcExpencess();
		CreditCard.monSpentWithInterest(monthlySpent);
	}
	
	
}