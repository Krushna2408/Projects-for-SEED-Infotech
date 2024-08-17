package String;

public class stringbuffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		StringBuffer sb=new StringBuffer();
		System.out.println(sb.capacity());//16+length
		
		sb.append("i am in java");
		System.out.println(sb.capacity());//(old capacity*2)+2
		
//		System.out.println(sb.reverse());
		System.out.println(sb.deleteCharAt(0));
		System.out.println(sb.substring(1));
		System.out.println(sb.insert(1, "hello"));

	}

}
