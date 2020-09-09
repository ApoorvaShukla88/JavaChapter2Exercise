// data elements: isbn, author, price, boolean(rare)
	// two constructors(no-arg, 4-arg)
	// 4 get 4 set methods
	// static data specify publisher
	// create 2 instances of book (1 from each const)
	// print out two attributes of each
	// both books will print out the name of the publisher
package chapter9;

public class Book{
	public static void main(String[] args) {
		
		randomProblem r = new randomProblem();
		randomProblem r1 = new randomProblem(1, "Apoorva", 1000, true);
		System.out.println("Defalt Book attributes = ");
		System.out.println(r.publisher);
		System.out.println(r.getAuthor());
		System.out.println(r.getPrice());
		System.out.println("Book attribute = ");
		System.out.println(r1.getAuthor());
		System.out.println(r1.getPrice());
		System.out.println(r1.publisher);
		
		
		
		
	}
	
	
}
class randomProblem {
	private int isbn;
	private String author;
	private double price;
	private boolean isRare;
	static String publisher = "Marvel";
	
	public randomProblem() {
		this.setAuthor("J.K.Rowling");
		this.setIsbn(11);
		this.setRare(true);
		this.setPrice(100);
		
	}
	
	public randomProblem(int isbn, String author, double price, boolean isRare) {
		this.setAuthor(author);
		this.setIsbn(isbn);
		this.setRare(isRare);
		this.setPrice(price);
		
	}

	public boolean isRare() {
		return isRare;
	}

	public void setRare(boolean isRare) {
		this.isRare = isRare;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getIsbn() {
		return isbn;
	}

	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}
	
}