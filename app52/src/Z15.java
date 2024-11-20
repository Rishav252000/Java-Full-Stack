class Z15
{
	public static void main(String [] args)
	{
		byte i = 10;
		Byte obj1 = Byte.valueOf(i);
	//	Integer obj2 = obj1;  it will get CTE
		Number obj2 = obj1;
		Object obj3 = obj1;
		System.out.println("done");
	}
}