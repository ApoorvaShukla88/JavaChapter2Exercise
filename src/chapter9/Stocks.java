package chapter9;

public class Stocks{
	
	String symbol;
	String stockName;
	double previousClosingPrice = 34.5;
	double currentPrice;
	
	
	public Stocks(String symbol, String stockName) {
		this.symbol =symbol;
		this.stockName=stockName;
		
	}
	
	public double getChangePercent() {
		
		
double percentChange = (Math.round((previousClosingPrice - currentPrice) / previousClosingPrice))* 100;
System.out.println((previousClosingPrice - currentPrice));
		return percentChange;
	}
	
	public void setChangePercent(double currentPriceA) {
		this.currentPrice = 80;
		
		
	}
	
	
	
}