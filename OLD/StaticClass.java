public class StaticClass{
		int A = 10;
		static int B = 25;
	public void methodOne(){
		System.out.println("This is my First Method");
		 
	}
	public void methodTwo(){
		System.out.println("count:" + A);	
		
	}
	public void methodThree(){
		int count = 25;
		System.out.println("count:" + A);		
	}
	public void methodFour(){
		System.out.println("count:" + A);
		
	}
	public static void methodFive(){
		StaticClass G = new StaticClass();
		System.out.println("count:" +G.A);
	}
	public void methodSix(){
			int count = 100;
		System.out.println("count:" + count);
	}
	public static void methodSiven(){
		System.out.println("count:" + B);
		
	}
	public void methodEight(){	
		int total = (A + B);
		System.out.println("total:" + total);
		
		
	}
}