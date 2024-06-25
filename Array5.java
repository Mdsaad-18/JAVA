//array5 example

  public class Array5 {
      public static void main(String args[]){
	    // by taking the example of Employees
		
		String Employeesnames[] = {"Veeresh","Kumar","Scahin","Raam","Pramod"};
		int  Employeessalary[] = {10000,12000,14000,15000,90000};
		long EmployeesIDNum[] = {990210,636408,147852,369852,123654};
		char Employeesgrade[] = {'A','B','C','D','E'};
		
		for (int e=0; e<Employeesnames.length; e++){
			System.out.println("Employees names   "  +Employeesnames[e]);
			System.out.println("Employees Fruitrate   "  +Employeessalary[e]);
			System.out.println("Employees FruitOwnerNum is   "  +EmployeesIDNum[e]);
			System.out.println("Employees FruitModel  "  +Employeesgrade[e]);
			
			System.out.println("\n");
		}
	  }
  }
			
		
		
		
		