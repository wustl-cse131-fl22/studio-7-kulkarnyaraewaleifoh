package studio7;

public class Rectangle {
	
	private double height;
	private double width; 
	
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height; //this.height calls directly height
	}
	public double getWidth() {
		return width;
	}
	public void setWidth(double width) {
		this.width = width;
	}
	
	public Rectangle (double height, double width) { //this is the constructor
		this.height = height;
		this.width = width;
	}
	

	public double area() {
		return this.height * this.width;
	}
	
	public double perimeter() {
		return (2*this.height) + (2 * this.width);
	}
	
	public boolean isSquare () {
		if (this.height == this.width) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean isSmaller (Rectangle rectangleTwo) {
		if (this.area() > rectangleTwo.area()) {
			return false;
		}
		else {
			return true;
		}
	}
	
	public String toString() {
		return "Height: " + this.height + "Width: " + this.width;
	}
	
	

}
