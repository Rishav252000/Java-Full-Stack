class Z11
{
	public static void main(String [] args)
	{
		byte b1 = 10;
		String s1 = Byte.toString(b1);

		int i = 10;
		String s2 = Integer.toString(i);
		
		long l = 100;
		String s3 = Long.toString(l);
		
		boolean b2 = false;
		String s4 = Boolean.toString(b2);

		char c1 = 'c';
		String s5 = Character.toString(c1);

		System.out.println("done");
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println("done");
	}
}