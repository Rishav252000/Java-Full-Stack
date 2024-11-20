class Y
{
	public static void main(String [] args)
	{
		String s1 = "100.345D";
		Double obj3 = Double.valueOf(s1);
		double m = obj3.doubleValue();
		float n = obj3.floatValue();
		
		System.out.println(m);  //obj.toString()
		System.out.println(n);
		System.out.println(obj3); 
	}
}
