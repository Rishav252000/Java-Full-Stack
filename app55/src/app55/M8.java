package app55;


class A {
	void test1() {
		System.out.println("A-test1");
	}
	void test2() {
		System.out.println("A-test2");
	}
}
public class M8 {
	
	
	public static void main(String[] args) {
		A a1 = new A();
		a1.test1();
		a1.test2();
		
		A a2 = new A()
		{
			void test3() {
				
			}
		};
		a2.test1();
		a2.test2();
		//a2.test3();
				
		A a3 = new A()
				{
					 void test1() {
//						
						{
							System.out.println("iib");
						}
						System.out.println("AIC-test1");
						{
							System.out.println("iib end");
						}
					}
				};
				
				a3.test1();
				a3.test2();
				
				System.out.println("------------");
				
				A a4 = new A()
				{
					void test1() {
						System.out.println("AIC-test1");
					}
					void test2() {
						System.out.println("AIC-test2");
					}
				};
				
				a4.test1();
				a4.test2();
				
				System.out.println("------------");
				
				A a5 = new A()
				{
					void test1() {
						System.out.println("AIC-test1");
					}
					void test2() {
						System.out.println("AIC-test2");
					}
					{
						System.out.println("IIB1");
					}
					static 
					{
						System.out.println("SIB2");
					}
				};
				
				a5.test1();
				a5.test2();
				
				A a6 = new A()
						{
							void test3() {
								
							}
						};
						
						//a6.test3();
						
						
				A a7 = new A()
						{
							void test3() {
								System.out.println("new test3");
							}
							void test1() {
								test3();
							}
						};
						
						a7.test1();
						a7.test2();
	}
}
