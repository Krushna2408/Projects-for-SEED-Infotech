package String;

public class string {

	public static void main(String[] args) {

		String name="core java";
		
		
		System.out.println(name);
		System.out.println(name.length());
		System.out.println(name.isEmpty());
		System.out.println(name.trim());
		
//		case conversion
		
		System.out.println("case conversion");
		
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		String a="core", b="java";
		
		System.out.println(a+b);
		
		String s=String.valueOf(a);
		String s1=String.valueOf(b);
		System.out.println(s+s1);
	
//		concat method
		
		System.out.println("concat method");
		
		System.out.println(a+b);
		System.out.println(10+20+a+b);
		System.out.println(a+b+10+20);
		System.out.println(a.concat(b));
		
		
//		searching
		
		System.out.println("searching");
		
		System.out.println(a.indexOf("c"));
		System.out.println(a.charAt(0));
		System.out.println(a.contains("c"));
		
		System.out.println(a.startsWith("c"));
		System.out.println(a.endsWith("e"));
		System.out.println(a.equals(b));
		
//		compare method
		
		System.out.println("compare method");
		
		String a1="this is java";
		String a2="Java";
		
		System.out.println(a1.compareTo(a2));
		
		System.out.println(a1.equals(a2));
		System.out.println(a1.equalsIgnoreCase(a2));
		
//		replace method
		
		System.out.println("replace method");
		
		System.out.println(a1.replace("is","was"));
		System.out.println(a1.replaceFirst("is","was"));
		System.out.println(a1.replaceAll("is(.)*","was"));
		
		System.out.println(a1.substring(0, 5));

	}

}
