class X
{
	public static void main(String [] args)
	{
		String s1 = "100.345d";
		Double obj3 = Double.valueOf(s1);
		double m = obj3.doubleValue();
		
		System.out.println(m);  //obj.toString()
		System.out.println(obj3); 
	}
}
