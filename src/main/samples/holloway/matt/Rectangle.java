package holloway.matt;

public class Rectangle extends Shape {
	protected double w;
	protected double h;

	public Rectangle(double w, double h) {
		this.w = w;
		this.h = h;
	}

	public double getWidth() {
		return w;
	}

	public double getHeight() {
		return h;
	}

	public double area() {
		return h * w;
	}

	public double circumference() {
		return 2*(w + h);
	}
}