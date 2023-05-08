public class Marks {
	
	public static void main (String [] args){
		System.out.println("Tenth Class Total Marks");
		
		TenthClassMarks Tenth = new TenthClassMarks();
		int totalMarks = Tenth.totalMarks("Venkat",65,85,90,75,85,67);
		System.out.println("totalMarks:   " + totalMarks);
		
	}
	
	
	
}