class O 
{
	int i;
	
	public static void main(String[] args) 
	{
		O r1 = new O();
		O r2 = r1;
		O r3 = r2;
		O r4 = r1;
		System.out.println(r1.i);
		System.out.println(r2.i);
		System.out.println(r3.i);
		System.out.println(r4.i);
		System.out.println("-----------------");
		r3.i = 45; 
		System.out.println(r1.i);
		System.out.println(r2.i);
		System.out.println(r3.i);
		System.out.println(r4.i);
		System.out.println("-----------------");
	}
}
