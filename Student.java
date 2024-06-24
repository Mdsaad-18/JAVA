/*Assignment: class 24-06-24

->Declare 9 Array(Ex: int ,String ,char, short,byte,float,double,boolean, long)
 ->Print All Array elements and it's length.*/
 
 public class Student {
	 
	public static void main(String args[]) {
		 
		int rollnumbers[] = {0, 1, 2, 3, 4, 5, 7, 8};
		String name[] = {"varun", "raam", "ritesh", "taufiq", "rohan", "veeresh", "abuzar", "mudassir", "haris"};
		String address[] = {"karmadi", "havnoor", "mallur", "sirbadgi", "attigeri", "haveri", "yadgeri", "mulla", "yadgeri"};
		short dexnum[] = {11, 12, 13, 14, 15, 16, 17, 18, 19};
		byte indexnum[] = {21, 22, 23, 24, 25, 26, 27, 28, 29};
		float fees[] = {10000.00f, 20000.00f, 30000.00f, 40000.00f, 50000.00f, 60000.00f, 70000.00f, 80000.00f, 90000.00f};
		double idnumber[] = {51, 52, 53, 54, 55, 56, 57, 58, 59};
		boolean attendance[] = {true, false, true, false, true, false, true, false, true};
		long phonenumbers[] = {6364, 9902, 8792, 6364, 7676, 8095, 6364, 9036, 6362};

		for (int a = 0; a < rollnumbers.length; a++) {
			System.out.println("The roll number of the student: " + rollnumbers[a]);
		}
		 
		for (int b = 0; b < name.length; b++) {
			System.out.println("The name of the student: " + name[b]);
		}
		 
		for (int c = 0; c < address.length; c++) {
			System.out.println("The address of each student: " + address[c]);
		}
		 
		for (int d = 0; d < dexnum.length; d++) {
			System.out.println("The dex number of the student: " + dexnum[d]);
		}
		 
		for (int e = 0; e < indexnum.length; e++) {
			System.out.println("The index number of the student: " + indexnum[e]);
		}
		 
		for (int f = 0; f < fees.length; f++) {
			System.out.println("The fees of the student: " + fees[f]);
		}
		 
		for (int g = 0; g < idnumber.length; g++) {
			System.out.println("The ID number of the student: " + idnumber[g]);
		}
		 
		for (int h = 0; h < attendance.length; h++) {
			System.out.println("The attendance of the student: " + attendance[h]);
		}
		 
		for (int i = 0; i < phonenumbers.length; i++) {
			System.out.println("The phone number of the student: " + phonenumbers[i]);
		}
	}
}

		
		 