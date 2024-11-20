class C
{
	public static void main(String []args)
	{
		byte i = 20;
		Byte obj = Byte.valueOf(i); // boxing
		Byte j = obj.byteValue(); //unboxing
		System.out.println(obj);  //obj.toString()
		System.out.println(i);
		System.out.println(j);	
	}
}
