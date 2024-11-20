package app55;

class B{
	B(){
		System.out.println("B()");
	}
	B(int i){
		System.out.println("B(int i)");
	}
	void test() {
		System.out.println("test(B)");
	}
	
	{
		System.out.println("B-IIB");
	}
	
}

public class M9 {
	public static void main(String[] args) {
		B b1 = new B() {
		void test() {
			System.out.println("B-AIC-begin");
			super.test();
			System.out.println("B- AIC - end");
			}
			{
				System.out.println("B-IIB");
			}
		};
		b1.test();
		System.out.println("----------------");
		B b2 = new B(10) {
			void test() {
				System.out.println("B-AIC-begin");
				super.test();
				System.out.println("B- AIC - end");
				}
				{
					System.out.println("B-IIB");
				}
		};
		System.out.println("---------------------");
	}
}