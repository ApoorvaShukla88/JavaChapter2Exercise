package chapter9;

public class ex9_2Stock{
	public static void main(String[] args) {
		
		Stocks stock = new Stocks("ORCL ", "Oracle Corporation");
	
		stock.setPreviousClosingPrice(34.5);
		stock.setCurrentPrice(34.35);
		
		System.out.println("Percentage change : " + stock.getChangePercent());
		
	}
}