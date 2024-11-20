class I 
{
	public static void main(String[] args) 
	{
		if(args.length < 2)
		{
			System.out.println("supply 2 int type command line arguments");
			return;
		}
		String s1 = args[0];
		String s2 = args[1];
		int i = Integer.parseInt(s1);
		int j = Integer.parseInt(s2);
		int min = (i < j) ? i : j;
		int max = (i > j) ? i : j;
		System.out.println("min value b/w " + i + ", " + j + ":" + min);
		System.out.println("max value b/w " + i + ", " + j + ":" + max);
	}
}
