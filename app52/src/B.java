class B
{
	static int i = 20;
	public static void main(String []args)
	{
		Integer obj1 = Integer.valueOf(i);
		Integer obj = Integer.valueOf(i); // boxing
		int j = obj.intValue(); //unboxing
		System.out.println(i);  //obj.toString()
		System.out.println(j);	
	}
}
