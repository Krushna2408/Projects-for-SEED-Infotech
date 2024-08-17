package array;

public class array_linear_search {

	public static void main(String[] args) {
		
//		min value
		
		int a[]= {4,3,5,1,2,6};
		
		int max=a[0];
		
		for (int i=1;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println(max);
		
//		max value
		
//		int min=a[0];
//		
//		for (int i=0;i<a.length;i++)
//		{
//			if(a[i]<min)
//			{
//				min=a[i];
//			}
//			
//		}
//		System.out.println(min);
	}

}
