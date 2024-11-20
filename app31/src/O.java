class O 
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		for(int i = 0; i < elements.length;i++)
		{
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
		for(int i = elements.length - 1; i >= 0;i--)
		{
			System.out.print(elements[i] + ", ");
		}
		System.out.println();
	}
}
