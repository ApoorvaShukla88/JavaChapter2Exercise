package JUNIT;

public class Stopwatch {
	
	private int seconds;
	private int minutes;
	private int hours;
	
	public Stopwatch() {
		this.seconds = 0;
		this.minutes = 0;
		this.hours = 0;
	}
	
	public int getSeconds() {
		return seconds;
	}
	
	public int getMinutes() {
		return minutes;
	}
	
	public int getHours() {
		return hours;
	}
	
	public void tick() {
		
		this.seconds++;
		
		if(this.seconds == 60) {
			this.minutes++;
			this.seconds = 0;
		}
		
		if(this.minutes == 60) {
			this.hours++;
			this.minutes = 0;
		}
		
	}
	

}
