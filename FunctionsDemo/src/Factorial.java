
public class Factorial {
	int a;
	int fact = 1;
	
	public Factorial(int a)
	{
		this.a = a;
	}
	
	public int factorial()
	{
		for(int i=1;i<=a;i++)
			fact = fact*i;
		return fact;
		//System.out.println("Factorial of number "+a+" is : "+fact);
	}
	
	public static void main(String[] args) {
		Factorial f = new Factorial(6); //Parameterized constructor
		int res = f.factorial();
		System.out.println(res);
		/*Factorial f1 = new Factorial(6);
		f1.factorial();*/
	}

}
