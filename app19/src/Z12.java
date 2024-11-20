class Z11
{
	public static void main(String[] args) 
	{
		int i;
		int j;
		for(i = 4, j = i; i == 4; i++, j = j + i)
		{
		}
		System.out.println(i);
		System.out.println(j);
	}
}
