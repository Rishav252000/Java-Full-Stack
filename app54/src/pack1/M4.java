package pack1;

import java.io.FileNotFoundException;
import java.io.IOException;

class Foo  {
	
	static void test() throws IOException {
		
	}
}
class D extends Foo {
	static void test() throws  IOException {
		
	}
}
class C extends D{
	static void test() throws FileNotFoundException {
		
	}
}
public class M4 {
	public static void main(String[] args) {
		C c1 = new C();
		
	}
}
