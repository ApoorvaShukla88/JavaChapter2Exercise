package chapter9;

public class ex_9_8{
	
	public static void main(String[] args) {
		
		Fan fan = new Fan();
		
		fan.setSpeed(Fan.FAST);
		fan.setColor("red");
		fan.setRadius(10);
		fan.setOn(true);
		
		System.out.println(fan.toString());
		
	}
	
	
}

class Fan {
	
	public static final int SLOW = 1, MEDIUM = 2, FAST = 3;
	private int speed = SLOW;
	private boolean on = false;
	private double radius = 5;
	private String color = "blue";
	
	
	public int getSpeed() {
		return this.speed;
		
	}
	public boolean getOn() {
		return this.on;
		
	}
	public double getRadius() {
		return this.radius;
		
	}
	public String getColor() {
		return this.color;
		
	}
	
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public void setOn(boolean on) {
		this.on = on;
	}
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	Fan(){
//		this.color = color;
//		this.on = on;
//		this.radius = radius;
//		this.speed = speed;
	}
	
	public String toString() {
		String str;
		if(this.on) 
			str = "Fan Speed : " + this.speed + " ,Color is " + this.color + " ,Fan Radius " + this.radius;
		else 
			str = "Fan is OFF";
		return str;
		
		
	}
	
	
}

