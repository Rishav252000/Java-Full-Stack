class E 
{
	static float test1(short s1)	
	{
		return test2(s1);	//	return (float) test2((int) s1);
	}
	static long test2(int s1)
	{
		return s1;	//	return (long) s1;
	}
	public static void main(String[] args) 
	{
		byte b1 = 100;
		double d1 = test1(b1);		//	double d1 = (double) test1((short)b1);
		System.out.println(d1);
	}
}
