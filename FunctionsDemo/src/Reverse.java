
public class Reverse {

	int a;

	int res = 0;

	public Reverse(int a)
	{
		this.a = a;
	}
	
	public int reverseNumber() {
		while (a != 0) {
			int rem = a % 10;
			res = (res * 10) + rem;
			a = a / 10;
		}
		return res;
	}

	public static void main(String[] args) {
		Reverse r = new Reverse(256);
		int result = r.reverseNumber();
		System.out.println(result);
	}

}
