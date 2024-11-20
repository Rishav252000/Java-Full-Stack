class M20 
{
	public static void main(String[] args) 
	{
		A a1 = new C();
		B b1 = (B) a1;
		System.out.println("------11--------");
		C c1 = (C) a1;
		System.out.println("------22--------");
		D d1 = (D) a1;
		System.out.println("------33--------");
	}
}
