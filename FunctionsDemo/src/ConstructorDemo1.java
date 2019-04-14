
public class ConstructorDemo1 {

	int a;
	boolean b;
	public ConstructorDemo1()
	{
		a = 0;
		b = false;
	}
	public static void main(String[] args) {
		ConstructorDemo1 d = new ConstructorDemo1();
		System.out.println("a = "+d.a);
		System.out.println("b = "+d.b);
	}

}
