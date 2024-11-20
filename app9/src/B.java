class B 
{
	public static void main(String[] args) 
	{
		System.out.println(Integer.toBinaryString(63));
		System.out.println(Integer.parseInt("111111", 2));
	}
}

/*
	63 / 2	=	31		+		1
	31 / 2	=	15		+		1
	15 / 2	=	 7		+		1
	 7 / 2	=	 3		+		1
	 3 / 2	=	 1		+		1
	 1 / 2	=	 0		+		1
	 -----------------------------
								111111
								
								
	(2 power 0)	* 1	=	1 * 1 = 1	+							
	(2 power 1)	* 1	=	2 * 1 = 2	+							
	(2 power 2)	* 1	=	4 * 1 = 4	+							
	(2 power 3)	* 1	=	8 * 1 = 8	+							
	(2 power 4)	* 1	=	16 * 1 = 16	+							
	(2 power 5)	* 1	=	32 * 1 = 32	+
	---------------------------------
								63
								
								
								
								
								
								
								



