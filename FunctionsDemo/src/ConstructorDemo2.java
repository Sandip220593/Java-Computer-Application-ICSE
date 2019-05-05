
public class ConstructorDemo2 {

	int a;
	int b;
	
	public ConstructorDemo2()
	{
		a = 0;
		b = 0;
	}
	
	public ConstructorDemo2(int x, int y)
	{
		/*this.a = a;     // this keyword to point out the instance variables
		this.b = b;*/
		a = x;
		b = y;
	}
	
	public void display()
	{
		System.out.println("a = "+a);
		System.out.println("b = "+b);
	}
	
	public static void main(String[] args) {
		/*ConstructorDemo2 d = new ConstructorDemo2();
		d.display();*/
		ConstructorDemo2 d1 = new ConstructorDemo2(5,9);
		d1.display();
	}

}
