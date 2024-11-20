class G
{
	public static void main(String []args)
	{
	//	float i = 20.0; possible lossy conversion from double to float
		float i = 20.0f;
		Float obj = Float.valueOf(i); // boxing
		Float j = obj.floatValue(); //unboxing
		System.out.println(obj);  //obj.toString()
		System.out.println(i);
		System.out.println(j);	
	}
}
