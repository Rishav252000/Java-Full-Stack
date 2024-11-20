package app63;
class E extends Thread{
	public void run() {
		for(int i = 3000; i <= 4000; i++) {
			System.out.println(i);
		}
	}
}
public class M6 {
	public static void main(String[] args) {
		E e1 = new E();
		e1.start();//newly created a thread 
		e1.start(); //thread we can't start more than one time, other wise exception is raising 
		for(int i = 13000; i <= 14000; i++) {
			System.out.println(i);
		}
	}
}
