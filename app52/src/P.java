class P
{
	public static void main(String []args)
	{
		String s1 = "100";
		Short obj = Short.valueOf(s1); // boxing
		short j = obj.shortValue(); //unboxing
		

		Byte obj1 = Byte.valueOf(s1);
		byte k = obj.byteValue(); //unboxing

		Long obj2 = Long.valueOf(s1);
		long l = obj2.longValue();

		Float obj3 = Float.valueOf(s1);
		float m = obj3.floatValue();
		
		System.out.println(obj);  //obj.toString()
		System.out.println(obj1);  //obj.toString()
		System.out.println(obj2);
		System.out.println(obj3);
		System.out.println(s1);
		System.out.println(j);
		System.out.println(l);
		System.out.println(m);	
	}
}
