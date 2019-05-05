
public class Demo {
	public static void sum(int a, int b)
	  {
	    System.out.println((a+b));
	  }

	  public static void sum(int a, int b, int c)
	  {
	    System.out.println((a+b+c));
	  }
	  
	  public static void sum(int a, double b)
	  {
	    System.out.println((a+b));
	  }
	  
	public static void main(String[] args) {
		Demo m = new Demo();
	    m.sum(2,3);
	    m.sum(4,5,6);
	    m.sum(2, 5.2);
	}
}
