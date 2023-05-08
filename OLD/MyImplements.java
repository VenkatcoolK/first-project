public class MyImplements implements MyInterface {
	public static int Mangos = 10;
	int apples = 20;
	int orangs = 15;
	public  void methodOne(){
		 Mangos = (Mangos - 2);
		 if (Mangos > 0){
			 System.out.println("Mangos Availabel:!");
		 }
		 else {
			 System.out.println("Mangos Not Availabel:!");
			 
		 }
		System.out.println("Interface methodOne:!" + Mangos);
	}
	public void methodThree(){
		System.out.println("Total apples:" + apples);
	}
	
	
	
	
}