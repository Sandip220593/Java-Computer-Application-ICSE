import java.util.Scanner;

public class TrianglePattern {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		/*String s = "";
		for(int i=0;i<row;i++)
		{
			s+="*";
			System.out.print(s);
			System.out.println();
		}*/
		for(int i=0;i<row;i++)
		{
			for(int j=row-i;j>0;j--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
