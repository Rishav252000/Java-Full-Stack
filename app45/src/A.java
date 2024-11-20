
//	byte  <  short   <   int  <   long   <   float   <   double


class A 
{
	public static void main(String[] args) 
	{
		int i = 10;
		double j = 23.6l;
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
		j = i;	//	auto widening
				//	j = (double) i;
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
		j = (double) i;
		System.out.println(i);
		System.out.println(j);
		System.out.println("--------------");
	}
}
