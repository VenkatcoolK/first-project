public class InternetBill implements VenMonExpen{
	
	public void billCalculation(int totalUnits){
		
		if (inetrUsedInJan > 0){
			int MonthlyInterBill = (inetrUsedInJan * costPerGB);
			System.out.println("Internet  Bill For Jan:" + MonthlyInterBill);
		}
		else {
			System.out.println("No Internet Bill For Jan:");
		}
	}
	
	
	 
	}