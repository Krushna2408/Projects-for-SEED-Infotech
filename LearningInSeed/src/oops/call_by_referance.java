package oops;

public class call_by_referance {
	String name;
	int age;
	
	public static void main(String[]args) {
		call_by_referance shadow= new call_by_referance();
		shadow.name="shadow";
		shadow.age=10;
		System.out.println(shadow.name+" = "+shadow.age);
		
	}

}
