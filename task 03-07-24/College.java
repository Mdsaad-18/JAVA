public class College{
	public static  boolean college_name(){
			boolean college_name=true;
			if (college_name){
				System.out.println("Audisankara");
				
				
			}else{
				System.out.println("Nothing");
			
			}
			if (college_name){
				System.out.println("Narayana");
				
			return true;	
			}else{
				System.out.println("Nothing");
			}
			return false;	
			
		}
		public static  boolean college_details(){
			boolean college_detail=true;
			if (college_detail){
				System.out.println("Btech B.E  MBA  MCA");
				
				
			}else{
				System.out.println("Nothing");
				
			}
			if (college_detail){
				System.out.println("Btech B.E");
				
			return true;	
			}else{
				System.out.println("Nothing");
				
			}
			return false;
		}
		public static  boolean college_branch(){
			boolean college_branch=true;
			if (college_branch){
				System.out.println("ME  CSE  ECE  EEE");
				
				
			}else{
				System.out.println("Nothing");
				
			}
			if (college_branch){
				System.out.println("CE  ME  CSE  EEE");
				
			return true;	
			}else{
				System.out.println("Nothing");
				
			}
			return false;
		}
		public static  boolean college_Principal_name(){
			boolean college_Principal_name=true;
			if (college_Principal_name){
				System.out.println("Pechalayya");
				
				
			}else{
				System.out.println("Nothing");
				
			}
			if (college_Principal_name){
				System.out.println("Narayana");
				
			return true;	
			}else{
				System.out.println("Nothing");
				
			}
			return false;
		}
		public static  boolean college_location(){
			boolean college_location=true;
			if (college_location){
				System.out.println("Gudur");
				
				
			}else{
				System.out.println("Nothing");
			
			}
			if (college_location){
				System.out.println("Nellore");
				
			return true;	
			}else{
				System.out.println("Nothing");
				
			}
			return false;
		}
		public static  boolean college_numbered(){
			boolean college_numbered=true;
			
			if (college_numbered){
				System.out.println("Good"+"college_number is 7");
				
				
			}else{
				System.out.println("Nothing");
				
			}
			
			if (college_numbered){
				System.out.println("Good"+"college_number is 5");
				
			return true;	
			}else{
				System.out.println("Nothing");
				
			}
			return false;
		}
		public static  int subjects(){
			int subjects=12;
			
			if (subjects>5){
				System.out.println("Good"+subjects);
				
				
			}else{
				System.out.println("Nothing");
				
			}
			
			if (subjects<20){
				System.out.println("Good"+subjects);
				
				
			}else{
				System.out.println("Nothing");
				
			}
			return 3;
		}
		public static  String subjects_name(){
			String subject_name="Maths";
			
			
			if (subject_name=="Maths"){
				System.out.println("Good"+subject_name);
				
				
			}else{
				System.out.println("Nothing");
				
			}
			String subject_name1="Physics";	
			if (subject_name1=="Physics"){
				System.out.println("Good"+subject_name1);
				
			return "Physics";	
			}else{
				System.out.println("Nothing");
				
			}
			return "Maths" ;
		}
}