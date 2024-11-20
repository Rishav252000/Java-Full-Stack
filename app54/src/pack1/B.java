package pack1;

import java.io.FileNotFoundException;
import java.io.IOException;

class A {
//	void test1() throws Class{
//		//some implementation 
//	}
	
	void test2() throws InterruptedException{
		//some implementation 
	}
	
	
	void test3() throws IOException{
		//some implementation 
	}
	
	void test4() throws ArithmeticException{
		//some implementation 
		// if we are overririding the test4 with checked in the sub class
	}
	void test5() {
		//some implementation 
		// if we are overriding the test 5 without throws in subclass
	}
}
public class B extends A{
	void test1() throws ClassNotFoundException
	{
		
	}
	void test2() {
		//some implementation 
	}
	public static void main(String[] args) {
		
	}
	void test3() throws FileNotFoundException{
		//some implementation 
	}
	void test4() throws NumberFormatException{
		//some implementation 
		// if we are overririding the test4 with checked in the sub class
	}
}
