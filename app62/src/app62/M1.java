package app62;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class A{
	int i;
	int j;
	public A() {
		
	}
	public A(int p) {
		
	}
	
	void test1() {
		
	}
	void test2(int i) {
		
	}
	void test3(int i) {
		
	}
	void test4(int k) {
		
	}
}
public class M1 {
	public static void main(String[] args) {
		A a1 = new A();
		Class c1 = a1.getClass();
		System.out.println(c1);
		Field [] field = c1.getDeclaredFields();
		for(Field f1 : field) {
			System.out.println("Declared Fields  " + f1);
		}
		
		Method [] method = c1.getDeclaredMethods();
		for( Method m1 : method) {
			System.out.println("Declared Methods " + m1);
		}
		Constructor [] constructor = c1.getDeclaredConstructors();
		for( Constructor co1 : constructor) {
			System.out.println("Declared Constructors  " +co1);
		}
	}
}
