public class MyMain{
	
		public static void main(String[] args){
		System.out.println("Venkat Monthly Expencess:");
		
		VenMonExpen Bill1 = new ElectricityBill();
		Bill1.billCalculation(150);
		
		VenMonExpen Bill2 = new InternetBill();
		Bill2.billCalculation(100);
		
		VenMonExpen Bill3 = new WaterBill();
		Bill3.billCalculation(1500);
		
		
	}
	
}