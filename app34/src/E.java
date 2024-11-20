class E 
{
	E(int i)
	{
		System.out.println("E(int):" + i);
	}
	public static void main(String[] args) 
	{
		E e1 = new E(90);
		System.out.println("-------------------");
		E e2 = new E(190);
		System.out.println("-------------------");
		E e3 = new E(901);
		System.out.println("-------------------");
	}
}
