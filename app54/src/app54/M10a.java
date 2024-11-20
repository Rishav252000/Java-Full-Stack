package app54;

public class M10a {
	public static void main(String[] args) {
		try
		{
			Class.forName("pack1.M10");
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
