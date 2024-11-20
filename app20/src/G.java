import java.io.*;

class G 
{
	public static void main(String[] args) throws Exception 
	{
		FileReader f1 = new FileReader("G.java");
		BufferedReader b1 = new BufferedReader(f1);
		String s1 = b1.readLine();
		while(s1 != null)
		{
			System.out.println(s1);
			s1 = b1.readLine();
		}
		System.out.println("end of the program");
	}
}
