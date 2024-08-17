package firstcode;

public class if_statement {

	public static void main(String[] args) 
	{
		int e = 0,o=0;
		for (int i=1;i<=100;i++)
		{
			if (i%2==0)
			{  
				System.out.println("No is even = " + i);

			}
			else
			{
				System.out.println("No is odd = " + i);

			}
			if(e==100 || o==100)
			{
				break;
			}
		}
			

	}

}
