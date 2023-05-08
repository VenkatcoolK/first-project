public class ElectricityBill implements  VenMonExpen{
	
		public void billCalculation(int totalUnits){
		
			if (totalUnits > 0){
			int MonthlyEBill = (totalUnits * unitCost);
			System.out.println("Electricity Bill For Jan:" + MonthlyEBill);
		
			}
			else {
			System.out.println("No Electricity Bill For Jan:");
			}
		}
	
	}
		
	
	
