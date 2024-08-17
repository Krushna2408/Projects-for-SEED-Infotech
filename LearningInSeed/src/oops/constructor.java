package oops;

public class constructor {
	
	String emp_name;
	int emp_id;
	
	constructor(String  n,int i)
	{
		this.emp_name=n;
		this.emp_id=i;
	}

	public static void main(String[] args) {
		constructor e1=new constructor ("java",100);
		constructor e2=new constructor ("python",101);
		constructor e3=new constructor ("c#",102);
		System.out.println(e1.emp_name+""+e1.emp_id);
		System.out.println(e2.emp_name+""+e2.emp_id);
		System.out.println(e3.emp_name+""+e3.emp_id);

	}

}
