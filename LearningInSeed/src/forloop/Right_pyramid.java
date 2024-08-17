package forloop;

public class Right_pyramid {

	public static void main(String[] args) {
		for(int i=0;i<=4;i++)
		{
			for (int q=0;q<=i;q++)
			{
				System.out.println(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.println("*");
			}
			System.out.println();
		}

	}

}
