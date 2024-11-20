class A 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(48));
		System.out.println(Integer.parseInt("110000", 2));
	}
}
/*
	Decimal to binary
	
	48 / 2		=	24		+		0
	24 / 2		=	12		+		0
	12 / 2		=	 6		+		0
	 6 / 2		=	 3		+		0
	 3 / 2		=	 1		+		1
	 1 / 2		=	 0		+		1
	=============================================
									110000

	binary to decimal:
	------------------------
	110000
	
	(2 power 0) * 0 = 1 * 0 = 0
	(2 power 1) * 0 = 2 * 0 = 0
	(2 power 2) * 0 = 4 * 0 = 0
	(2 power 3) * 0 = 8 * 0 = 0
	(2 power 4) * 1 = 16 * 1 = 16
	(2 power 5) * 1 = 32 * 1 = 32
	------------------------------
							   48




*/








