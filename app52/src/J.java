class J
{
	public static void main(String []args)
	{
	//	float i = 20.0; possible lossy conversion from double to float
		String s1 = "1.12d";
		Integer obj = Integer.valueOf(s1); // boxing
		int j = obj.intValue(); //unboxing

		Integer obj1 = Integer.valueOf(s1);
		Float obj2 = Float.valueOf(s1);
		Short obj3 = Short.valueOf(s1);
		Byte obj4 = Byte.valueOf(s1);
		Boolean obj5 = Boolean.valueOf(s1);
		Long obj6 = Long.valueOf(s1);
		Double obj7 = Double.valueOf(s1);

		System.out.println("Obj " + obj);  //obj.toString()
		System.out.println("Obj1 " + obj1);  //obj.toString()
		System.out.println("Obj2 " + obj2);  //obj.toString()
		System.out.println("Obj3 " + obj3);  //obj.toString()
		System.out.println("Obj4 " + obj4);  //obj.toString()
		System.out.println("Obj5 " + obj5);  //obj.toString()
		System.out.println("Obj6 " + obj6);  //obj.toString()
		System.out.println("Obj7 " + obj7);  //obj.toString()

		System.out.println(s1);
		System.out.println(j);	
	}
}
