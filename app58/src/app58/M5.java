package app58;

import java.security.KeyStore.Entry;

class E < T > {
	T field;
}
public class M5 {
	public static void main(String[] args) {
		E<Integer> e1 = new E<Integer>();
		e1.field = 34;
		
		System.out.println(e1.field);
		
		E<String> e2 = new E<String>();
		e2.field = "abc";
		
		System.out.println(e2.field);
		
		E<Boolean> e3 = new E<Boolean>();
		e3.field = true;
		System.out.println(e3.field);
	}
}
