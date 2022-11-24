package entities;

public class Rectangle {

	public double Width;
	public double Height;
	
	public double area() {
		return Width * Height;
	}
	public double perimeter() {
		return (Width+ Height) *2.00;
	}
	public double diagonal() {
		return Math.sqrt(Width * Width + Height * Height);
	}
}
