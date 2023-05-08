public class Test{
		
			static int x = 10;
			static int y = 20;
		public static void main(String[] args){
			
			
			if(x + y > 20){
				System.out.println("x+y is greater than 20");
				Test sample = new Test();
				sample.methodOne();
				sample.methodTwo();
				System.out.println("x+y is greater than 20");
				sample.methodThree();
				System.out.println("Ternary Operator");
				sample.methodFour();
				System.out.println("For Control Statement");
				sample.methodFive();
			}
		}
		public void methodOne(){
			
			if(x + y < 10){
				
				System.out.println("x+y is less than 10");
			}else {
				System.out.println("x+y is greater than 10");
				
			}
			
		}
		public void methodTwo(){
			
			int i = 0;
			while(i<=20){
				System.out.println(i);
				i=i+2;
			}	
		}
		public void methodThree(){
			
			int x =10;
			System.out.println(x++);
			System.out.println(++x);
			System.out.println(x--);
			System.out.println(--x);
		}
		public void methodFour(){
			
			int a = 5;
			int b = 10;
			
			int main = (a<b)?b:a;
			
			System.out.println(main);
		}
		public void methodFive(){
			
			for (int i =1;i<=10;i++){
				
				System.out.println(i);
				
			}
			
			
		}
}