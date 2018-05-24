package holloway.matt;

public class Circle extends Shape {

	public static final double PI = 3.14159265;
	protected double r;

	public Circle(double r) {
		this.r = r;
	}

	public double getRadius() {
		return r;
	}

	public double area() {
		return PI*r*r;
	}

	public double circumference() {
		return 2*PI*r;
	}
}