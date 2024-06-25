 //4.Write a program to display the count of even and odd numbers.
 public class EvenOddCount{
  public static void main(String args[]){
	  
	  int numbers[] = {10,22,11,54,88,96,33,66,55,11,66,51,31,35,};
	  
	  int sum1 =0;
	  int sum2=0;
	  
	  for (int j=0; j<numbers.length; j++){
		  if (numbers[j] % 2==0){
			  
			  sum1 = sum1 + numbers[j];
			  
		  }
		  else
		  {
			  sum2 = sum2+numbers[j];
		  }
		  
	  }
	  
	  System.out.println("the total sum of even numbers   "+sum1);
	  System.out.println("the total sum of odd numbers    "+sum2);
	  
  }
 }
			  