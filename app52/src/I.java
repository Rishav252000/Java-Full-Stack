class I
{
	public static void main(String []args)
	{
	//	float i = 20.0; possible lossy conversion from double to float
		boolean i = true;
		Boolean obj = Boolean.valueOf(i); // boxing
		Boolean j = obj.booleanValue(); //unboxing
		System.out.println(obj);  //obj.toString()
		System.out.println(i);
		System.out.println(j);	
	}
}
