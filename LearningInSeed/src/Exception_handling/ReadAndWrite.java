package Exception_handling;

import java.io.FileInputStream;
import java.io.FileOutputStream;

class ReadAndWrite 
{
	void read() throws Exception
	{
		FileInputStream fis=new FileInputStream("C:\\Program Files");
	}
	void Write() throws Exception
	{
		FileOutputStream f=new FileOutputStream("C:\\Program Files");
	}
}
class text
{
	public static void main(String[] args)
	{
		ReadAndWrite rw=new ReadAndWrite();
		
		try
		{
			rw.read();
		}
		catch(Exception e)
		{
			System.out.println(e);
			
		}
		
		try
		{
			rw.Write();
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		
	}
}