package forloop;

public class pyramid {

	public static void main(String[] args) {
		
//		pyramid
		
		for(int i=1;i<=6;i++)
		{
			for(int j=6;j>1;j--)
				if(j>i)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print(" *");
				}
			
			System.out.println();
		}
		
//		upside down pyramid
		
//		for (int i = 6; i >= 1; i--) {
//		    for (int j = 1; j <= 6 - i; j++) {
//		        System.out.print(" ");
//		    }
//		    for (int k = 1; k <= i; k++) {
//		        System.out.print("* ");
//		    }
//		    System.out.println();
//		}
		
//		right angle 123 pyramid
				
//				int i=1;
//				
//				for(i=1;i<=4;i++)
//				{
//					for(int j=1;j<=i;j++)
//					{
//						System.out.print(j);
//					}
//					
//					System.out.println();
//				}
		
//		right angle triange 1,23,345 print
				
//                int sum=0;
//				
//				for(int a=1;a<5;a++)
//				{
//					for(int j=1;j<=a;j++)
//					{
//						
//						sum =sum+1;
//						
//						System.out.print(sum);
//					}
//					
//					System.out.println();
//				}
				

			}
	}


