package pack1;

public class M24 {
	public static void main(String[] args) {
		try {
			Thread.sleep(10000);
			Class.forName("");
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
	}
}
