class S
{
	public static void main(String [] args)
	{
		String s1 = "100f";
		Float obj3 = Float.valueOf(s1);
		float m = obj3.floatValue();
		
		System.out.println(m);  //obj.toString()
		System.out.println(obj3); 
	}
}
