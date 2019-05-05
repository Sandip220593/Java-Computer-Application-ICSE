
public class SumSeries {

	public SumSeries(int a)
	{
		System.out.println("The Value of a = "+a);
	}
	
	public SumSeries(String s)
	{
		System.out.println("Hello "+s);
	}
	
	public static void main(String[] args) {
		
		SumSeries s = new SumSeries(5);
		
		SumSeries s1 = new SumSeries("Divya");
	}

}
