class H
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		if(true)
		{
			int i = 10;
			System.out.println("if start:" + i);
			i++;
			System.out.println("if body:" + i);
			boolean j = false;
			System.out.println("if end:" + i + ", " + j);
		}
		System.out.println(i);
		System.out.println(j);
		System.out.println(3);
	}
}
