class J 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefabcdef";
		//			 0123456789
		int i = s1.lastIndexOf('d');
		int j = s1.lastIndexOf('a');
		System.out.println(i);
		System.out.println(j);
		int k = s1.lastIndexOf('d', 2);
		int m = s1.lastIindexOf('c', 3);
		System.out.println(k);
		System.out.println(m);
	}
}
