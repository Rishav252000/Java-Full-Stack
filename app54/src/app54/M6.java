package app54;

public class M6 {
	public static void main(String[] args) {
		System.out.println(1);
		
		
		
		try {
			StringBuffer [] array = new StringBuffer[999999999];
			System.out.println(11);
			
			for(int i = 0; i< array.length; i++)
			{
				array[i] = new StringBuffer("abc");
			}
		} 
		catch(OutOfMemoryError e)
		{
			System.out.println(e);
		}
		System.out.println(22);
	}
}
