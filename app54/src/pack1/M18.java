package pack1;

public class M18 {
	public static void main(String[] args) {
		try {
			Class.forName("");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		System.out.println("done");
	}
}
