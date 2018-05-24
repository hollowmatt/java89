package holloway.matt;

public class Sample extends Object {
  private static String message = new String();
  private static Shape[] shapes = new Shape[2];


  static {
  	message = "This is a static initialized message";
  }

  public Sample() {
  	super();
	}

  public static void main(String ... args) {
    System.out.println("matt");
    for(String arg : args) {
    	System.out.println(arg);
    }
    System.out.println(message);
    shapes[0] = new Circle(2.0);
    shapes[1] = new Rectangle(2.0, 3.0);

    System.out.println(shapes[0].area());
    System.out.println(shapes[1].area());
  }
}
