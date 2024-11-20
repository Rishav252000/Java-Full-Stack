class Z13
{
	public static void main(String []args)
	{
		double d = 3.4;
		Double obj = Double.valueOf(d);
 
		int j = obj.intValue();
		double k = obj.doubleValue();
		byte b = obj.byteValue();
		short s = obj.shortValue();
		long l = obj.longValue();
		float f = obj.floatValue();	
		System.out.println(j);
		System.out.println(k);
		System.out.println(b);
		System.out.println(s);
		System.out.println(l);
		System.out.println(f);
	}
}