public class MethodOverload {
	public static void main(String[] args) {
			System.out.println("Method Overload");
		MethodOne method = new MethodOne();
		method.testMethod();
		method.testMethod(10, 15);
		method.testMethod(10, 12, 10);
		method.testMethod(10.5, 20.5);
		method.testMethod(250.50f, 250.50f);
	    method.testMethod(10, 20);
		
	}
	
}