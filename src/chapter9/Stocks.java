package chapter9;

public class Stocks{
	
	private String symbol;
	private String stockName;
	private double previousClosingPrice;
	private double currentPrice;
	
	
	public Stocks(String symbol, String stockName) {
		this.symbol =symbol;
		this.stockName=stockName;
		
	}
	
	public double getChangePercent() {
		
		
double percentChange = ((previousClosingPrice - currentPrice) / previousClosingPrice)* 100;
//System.out.println((previousClosingPrice - currentPrice));
		return percentChange;
	}
	
	public void setCurrentPrice(double currentPrice) {
		this.currentPrice = currentPrice;
		
		
	}
	public void setPreviousClosingPrice(double previousClosingPrice) {
		this.previousClosingPrice = previousClosingPrice;
		
		
	}
	
	
	
}