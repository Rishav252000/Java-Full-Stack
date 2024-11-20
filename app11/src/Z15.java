class Z15
{
	public static void main(String[] args) 
	{
		System.out.println(1);
		{
			System.out.println("block1-stmt1");
			System.out.println("block1-stmt2");
			System.out.println("block1-stmt3");
			System.out.println("block1-stmt3");
		}
		System.out.println(22);
		{
			System.out.println("block2-stmt1");
			System.out.println("block2-stmt2");
			System.out.println("block2-stmt3");
			System.out.println("block2-stmt3");
		}
		System.out.println(3);
	}
}
