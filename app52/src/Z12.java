class Z12
{
	public static void main(String []args)
	{
		Integer obj = Integer.valueOf(100);
		int j = obj.intValue();
		double k = obj.doubleValue();
		byte b = obj.byteValue();

		System.out.println(j);
		System.out.println(k);
		System.out.println(b);
	}
}