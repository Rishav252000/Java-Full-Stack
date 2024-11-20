class M 
{
	static int i;
	
	public static void main(String[] args) 
	{
		System.out.println(i);
		System.out.println(M.i);
		i = 500;
		System.out.println(i);
		System.out.println(M.i);
	}
}
