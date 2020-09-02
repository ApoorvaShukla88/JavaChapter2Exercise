package chapter9;

public class Rectangle{
	
		private double width;
		private double height;
	
	
	public Rectangle () {
		
	}
public Rectangle(double width, double height) {
	this.height = height;
	this.width = width;
	}

public double getHeight() {
	return this.height;
}
public double getWidth() {
	return this.width;
}
public double getArea() {
	double area = 2 * (width * height);
	return area;
}
public double getPerimeter() {
	double perimeter = 2 * (width + height);
	return perimeter;
}

	
}