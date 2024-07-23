public class Book{
	String title;
	String author;
	double price;
	
	
	public Book(String title,String author){
    this.title=title;
    this.author=author;
    System.out.println("the book title is " + title +" and author is:  "+author);	
		
	}
	
	
public Book(String title,String author, double price){
    this.title=title;
    this.author=author;
	this.price=price;
    System.out.println( "and author is:  "+author+ " the price is "+ price);
    System.out.println( "and author is:  "+author+ " the price is "+ price+ "title is "+ title);	
	
		
	}
		
	
}