class N 
{
	static int i;
	public static void main(String[] args) 
	{
		N n1 = new N();
		N n2 = new N();
		N n3 = new N();
		System.out.println(i);
		System.out.println(N.i);
		System.out.println(n1.i);	//	N.i
		System.out.println(n2.i);	//	N.i
		System.out.println(n3.i);	//	N.i
		System.out.println("-------------");
		n1.i = 450;		//	N.i = 450;
		System.out.println(i);
		System.out.println(N.i);
		System.out.println(n1.i);
		System.out.println(n2.i);
		System.out.println(n3.i);

	}
}
