package entities;

public class Rectangle {
	
	public double width;
	public double height;
	
	public double area() {
		return width * height;
	}
	
	public double perimeter() {
		return 2 * (width + height);
	}
	
	public double diagonal() {
		return Math.sqrt(width * width + height * height);
	}
	
	public String toString() {
		 return "Area: " + String.format("%.2f", area()) + " Perimetro: " + String.format("%.2f", perimeter()) + " Diagonal: " + String.format("%.2f", diagonal());
	}

}
