/* 1. Create 2 class
1. declare 10 properties for each class and define no-argument constructor, 
all argument constructor and intialize instance variables
2. declare the 4 instance methods using 4 ways
*/

  public class Bookss{
  //10 instance variables
  
  String bookName;
  int bookPrice;
  int bookPages;
  String bookAuthor;
  char bookGrade;
  float bookRating;
  double bookSize;
  String bookColor;
  String bookType;
  boolean isAvailable;
  
  //no-argument constructor
  public Bookss(){
	  System.out.println("the constructor with a no argument is defined");
	  
  }
  
  // constructor with all arguments
  
  public Bookss(String bookName, int bookPrice, int bookPages,String bookAuthor,char bookGrade,
                 float bookRating, double bookSize,String bookColor,String bookType, boolean isAvailable){
         this.bookName=bookName;
		this.bookPrice=bookPrice;
		this.bookPages=bookPages;
		this.bookAuthor=bookAuthor;
		this.bookGrade=bookGrade;
		this.bookRating=bookRating;
		this.bookSize=bookSize;
		this.bookColor=bookColor;
		this.bookType=bookType;
		this.isAvailable=isAvailable;
				 }
				 
	// 4 instance methods using 4 ways
	  public void bookSelling(){
		  System.out.println("Book is Selling");
		  
	  }
     public void bookDisplay(String bookName){
		System.out.println("book name is :"+bookName);
		
	 }	
	 
	 public boolean bookAvailable(){
		 System.out.println("Book is Available");
		 return true;
		 
	 }
	 
	 public String bookDetails(String bookName, int bookPrice){
		System.out.println("Book Name:"+bookName);
		System.out.println("Book Price:"+bookPrice);
		return "Book is Good";
	 }
	 
	 // main methode 
	 
	 public static void main(String args[])
	 {
      Bookss book1= new Bookss();
	  Bookss book2 = new Bookss("Fire", 220,300,"APJ Abdul kalam",'A',9.8f,20,"Black","Motivation",true);
	  Bookss book3= new Bookss();
	  book3.bookSelling();
	  book3.bookDisplay("Heaven");
	  book3.bookAvailable();
	  book3.bookDetails("Wings of fire",220);
	  
	  
	 }}