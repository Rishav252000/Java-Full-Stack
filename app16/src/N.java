class N 
{
	public static void main(String[] args) 
	{
		if(args.length < 1)
		{
			System.out.println("Pls supply 1 int type command line argument");
			return;
		}
		String s1 = args[0];
		int i = Integer.parseInt(s1);
		System.out.println(i + " is " + ((i % 2 == 0) ? "even" : "odd"));
	}
}



