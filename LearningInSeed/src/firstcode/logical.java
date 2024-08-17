package firstcode;

public class logical {

	public static void main(String[] args) {

		int a=10;
		int b=20;
		int c=30;
		
		//logical operator
		/*System.out.println((b>a)&&(c>b));
		System.out.println((b>a)||(a>c));
		System.out.println(!(a>b));*/
		
		//Bitwise operator
		System.out.println((b>a)^(a>c));
		System.out.println((b>a)|(a>c));
		System.out.println(a>>b);
		System.out.println(a<<b);
		System.out.println(a>b);
		System.out.println(a&b);
		
		

	}

}
