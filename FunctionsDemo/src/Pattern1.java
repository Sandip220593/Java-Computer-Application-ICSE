import java.util.Scanner;

public class Pattern1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		String s = "";
		
		for(int i=0;i<row;i++)
		{
			s = s+"*";
			System.out.println(s);
		}
	}

}
