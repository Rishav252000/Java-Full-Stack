package pack1;

public class M38 {
	public static void main(String[] args) {
		try {
			//some statement
		}catch(ArithmeticException ex) {
			//some statement
			throw new ArithmeticException(ex.getMessage());
		}
	}
}