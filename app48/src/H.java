class H 
{
	int a;
	public static void main(String[] args) 
	{
		final H h1 = new H();
		h1.a = 10;
		System.out.println(h1.a);
		h1.a = 20;
		System.out.println(h1.a);
	}
}
