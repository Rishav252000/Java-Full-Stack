class Z1
{
	public static void main(String [] args)
	{
		String s1 = "100.123ed";
		Double obj3 = Double.valueOf(s1);
		double m = obj3.doubleValue();
		float n = obj3.floatValue();
		int o = obj3.intValue();
		
		
		System.out.println(m);  //obj.toString()
		System.out.println(n);
		System.out.println(o);
		System.out.println(obj3); 
	}
}
