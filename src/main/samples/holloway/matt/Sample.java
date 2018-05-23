package holloway.matt;

public class Sample {
  private static String message = new String();

  static {
  	message = "This is a static initialized message";
  }

  public static void main(String ... args) {
    System.out.println("matt");
    for(String arg : args) {
    	System.out.println(arg);
    }
    System.out.println(message);
  }
}
