package pack1;

public class M23 {
	public static void main(String[] args) {
		try {
			Class.forName("");
			Thread.sleep(10000);
		}
		catch(ClassNotFoundException ex)
		{
			ex.printStackTrace();
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}
