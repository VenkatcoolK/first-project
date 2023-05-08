public class WaterBill implements VenMonExpen{
	
	public void billCalculation(int waterUsedInJan){
		
		if (waterUsedInJan > 0){
			int MonthlyWaterBill = (waterUsedInJan * waterPriceperLetter);
			System.out.println("Water  Bill For Jan:" + MonthlyWaterBill);
		}
		else {
			System.out.println("No Water Bill For Jan:");
		}
	}
	
}