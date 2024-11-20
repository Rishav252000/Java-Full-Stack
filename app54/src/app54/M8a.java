package app54;

public class M8a {
	
	public static void main(String[] args) {
		System.out.println(1);
		try {
			main(null);
		}
		catch(StackOverflowError e){
			System.err.println(e);
		}
		System.out.println(222);
	}
}
