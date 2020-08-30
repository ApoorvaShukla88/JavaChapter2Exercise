package chapter9;

public class ex9_1Rectangle{
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(4, 40);
		Rectangle rectangle1 = new Rectangle(3.5, 35.9);
		System.out.println("Rectangle area is with" + rectangle.width + "width and "+ 
				rectangle.height + "height and the area is " + rectangle.getArea() + 
				"and the perimeter is " + rectangle.getPerimeter());
		
		
		
		System.out.println("Rectangle area is with" + rectangle1.width + "width and "+ 
				rectangle1.height + "height and the area is " + rectangle1.getArea() + 
				"and the perimeter is " + rectangle1.getPerimeter());
		
	}
}