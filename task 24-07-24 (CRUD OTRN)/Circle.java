public class Circle{
	double radius;
   double area;
	
	double circumference;
	
	public void area(double radius){
		this.radius = radius;
		area=3.14*radius*radius;
		System.out.println("the rea of a circle is :"+ area );
	}
	public void circumference(){
		circumference=2*3.14*this.radius;
		System.out.println("the rea of a circumference is :"+ circumference );
		
	}
}