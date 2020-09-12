package chapter10;

public class ex10_4{
	public static void main(String[] args) {
		
	}
	
	
}

class MyPoint{
	private static int x;
	private static int y;
	
	MyPoint(){
		this.x = 0;
		this.y = 0;
		
	}
	MyPoint(int x, int y){
		this.x = x;
		this.y = y;
		
	}
	
	public static int getX() {
		return x;
	}
	public static void setX(int x) {
		MyPoint.x = x;
	}
	public static int getY() {
		return y;
	}
	public static void setY(int y) {
		MyPoint.y = y;
	}
	
	public double distance(MyPoint m) {
		
		return 0;
		
	}
	
}