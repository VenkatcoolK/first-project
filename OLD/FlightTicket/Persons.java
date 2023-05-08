public class Persons{
	public static int totalSeats = 5;
	public int total = 10;
	int A = 10;
	int B = 25;
	
		public static void methodOne(){
			
			
			if(totalSeats > 0){
				System.out.println("Tickets Available");
				 totalSeats = (totalSeats -1);
				System.out.println("totalSeats:" + totalSeats );
				
			}
			else{
					System.out.println("Tickets Not available");
					
				}	
			
		}
		
		public void methodFive(){
			int total = (A + B);
			System.out.println("My Total Ammount Is:" + total);
		
	}
}
	