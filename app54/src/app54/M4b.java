package app54;
class ABCD
{
	
}
public class M4b extends ABCD {
	public static void main(String[] args) {
		
		
		try
		{
			ABCD a1 = new ABCD();
			M4b m1 = (M4b) a1;
		}
		catch(ArrayIndexOutOfBoundsException ex)
		{
			System.out.println(ex);
			System.out.println("Complete Handling");
			
		}
	}
}
