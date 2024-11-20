class M26 
{
	public static void main(String[] args) 
	{
		B b1 = new D();
		System.out.println(b1.i);
		System.out.println(b1.j);
		//System.out.println(b1.k);
		//System.out.println(b1.l);
		b1.test1();
		b1.test2();
		//b1.test3();
		//b1.test4();
		
		if(b1 instanceof D)
		{
			D d1 = (D) b1;
			System.out.println(d1.i);
			System.out.println(d1.j);
			System.out.println(d1.k);
			System.out.println(d1.l);
			d1.test1();
			d1.test2();
			d1.test3();
			d1.test4();
			
		}
		
	}
}
