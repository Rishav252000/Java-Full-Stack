class O 
{
	public static void main(String[] args) 
	{
		System.out.println("main begin");
		test1();
		System.out.println("main end");
	}
	public static void test1()
	{
		System.out.println("test1 begin");
		test2();
		System.out.println("test1 end");
	}
	public static void test2()
	{
		System.out.println("test2 begin");
		test1();
		System.out.println("test2 end");
	}
}

/*
	according to industry standards
	
	valid method names:
	test1, hello, calculateInterestRate, readAllRecordsFromDatabase
	
	invalid:
	Test,  Hello, calculate_interest_rate, read_all_records_from_database








*/

