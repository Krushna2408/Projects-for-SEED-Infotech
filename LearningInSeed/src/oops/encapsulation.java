package oops;

class encapsulation 
{
	private int empid;
	
	public void setEmpId(int empid1)
	{
		empid=empid1;
	}
	public int getEmpID()
	{
		return empid;
	}

	public static void main(String[] args) 
	{
		encapsulation e1=new encapsulation();
		e1.setEmpId(101);
		System.out.println(e1.getEmpID());
	}

}
