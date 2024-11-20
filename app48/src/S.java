class S 
{
	final int i;
	
	S(int p)
	{
		i = 20;
	}
	S()
	{
		i = 400;
	}
	S(int x, int y)
	{
		i = 300;
	}
	public static void main(String[] args) 
	{
		S s1 = new S();
		S s2 = new S(10);
		S s3 = new S(1, 3);
		System.out.println("done");
	}
}
