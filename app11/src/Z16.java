class Z16
{
	public static void main(String[] args) 
	{
		{
			System.out.println("block1-stmt1");
			System.out.println("block1-stmt2");
			System.out.println("block1-stmt3");
			System.out.println("block1-stmt3");
		}
		{
			System.out.println("block2-stmt1");
			System.out.println("block2-stmt2");
		}
		{
			int i = 20;
			System.out.println("block3-stmt1:" + i);
		}
		System.out.println(3);
	}
}
