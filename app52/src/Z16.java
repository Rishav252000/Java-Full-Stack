class Z16
{
	public static void main(String [] args)
	{

		Integer obj1 = Integer.valueOf(10);
	//	Integer obj2 = obj1;  it will get CTE
		Number obj2 = obj1;
		
		Byte obj5 = new Byte(10);
		Byte obj4 = (Byte) obj2;
		Object obj3 = obj1;
		System.out.println("done");
	}
}