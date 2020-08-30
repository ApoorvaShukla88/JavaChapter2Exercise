package chapter9;

public class ex9_2Stock{
	public static void main(String[] args) {
		
		Stocks stock = new Stocks("ORCL ", "Oracle Corporation");
	
		System.out.println("Stock change percent " + stock.getChangePercent());
		
	}
}