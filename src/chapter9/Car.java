package chapter9;

public class Car{
	
	private static final char[] getSize = null;
	String size;
	boolean iAutomatic;
	int iMaxspeed;
	
	public static void main(String[] args) {
		
		Car c = new Car();
		System.out.println(c.getSize());
		
		
		
		
		
	}
	
	public Car(){
		size = "mid Size";
		iAutomatic = true;
	    iMaxspeed = 100;
		
	}
	
	public String getSize() {
		return size;
	}
	public int getSpeed() {
		return iMaxspeed;
	}
	public boolean getType() {
		return iAutomatic;
	}
	
}