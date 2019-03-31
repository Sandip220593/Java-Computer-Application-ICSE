
public class Addition {

	public void sum(int a, int b)
	{
		int z = a+b;
		System.out.println(z);
	}
	
	public static void main(String[] args) {
		Addition add = new Addition();
		add.sum(10,20);
		add.sum(40, 60);
		add.sum(10, 15);
	}

}
