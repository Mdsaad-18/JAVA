public class Year{
	int year=2000;
	
public void isLeapYear(){
	
	if((year % 4) ==0 && (year % 100) != 0){
	System.out.println("the year is leap year" + year);
	}
	
	else {
	System.out.println("the year is not leap year" + year);
	}
	
}	  
}