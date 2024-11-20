class K 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		for(int i = 1; i <= 3; i++)
		{
			int j = 20;
			j += i;
		}
		System.out.println("main end:" + j);
	}
}
