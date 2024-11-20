class D
{
	public static void main(String []args)
	{
		short i = 20;
		Short obj = Short.valueOf(i); // boxing
		Short j = obj.shortValue(); //unboxing
		System.out.println(obj);  //obj.toString()
		System.out.println(i);
		System.out.println(j);	
	}
}
