//Find out wheather student is Pass or Fail and find grade
public class StudentsMarks{
	
		int telugu = 90;
		int english = 85;
		int hindi = 90;
		
		public void mehodsMarks(){
			
			int totalMarks = (telugu + english + hindi);
			int Percentage =  (totalMarks /3);
			
				System.out.println("totalMarks:" + totalMarks);
				System.out.println("Percentage:" + Percentage +"%");
				
			if (Percentage >= 80){
				System.out.println("Grade A");
			}
			else if (Percentage >= 70){
				System.out.println("Grade B");
			}
			else if (Percentage >= 60){
				System.out.println("Grade C");
			}
			else{
				System.out.println("Grade D");

			}
	
	
}
}