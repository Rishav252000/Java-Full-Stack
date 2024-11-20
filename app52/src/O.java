class O
{
	public static void main(String []args)
	{
		String s1 = "100";
		Short obj = Short.valueOf(s1); // boxing
		Byte obj1 = Byte.valueOf(s1);
		short j = obj.shortValue(); //unboxing
		byte k = obj.byteValue(); //unboxing
		System.out.println(obj);  //obj.toString()
		System.out.println(obj1);  //obj.toString()
		System.out.println(s1);
		System.out.println(j);	
	}
}
