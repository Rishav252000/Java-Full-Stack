class M 
{
	public static void main(String[] args) 
	{
		String s1 = "abcdefabcdef";
		//			 0123456789
		int i = s1.lastIndexOf("cde");
		int j = s1.lastIndexOf("dem");
		System.out.println(i);
		System.out.println(j);
		int k = s1.lastIndexOf("abc", 4);
		int m = s1.lastIndexOf("fabc", 4);
		System.out.println(k);
		System.out.println(m);
	}
}
