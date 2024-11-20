package pack1;

public class M13 {
	// class.forName("")  ==>  classNotFoundExeception
	//	
	//	clone ();, join() sleep(), , wait()  ==> InterruptedException
	//	file handling statements	==> IOException/FileNotFoundException
	//	parse method in DataFormat ==> ParseException
	//	JDBC (java database connector) ==> SQLException
	//	java networking 	==>	MalformedURLException
	//	
	
	//mallForward Exception
	public static void main(String[] args) {
		System.out.println(1);
		test1();
		System.out.println();
	}
	public static void test1()
	{
		System.out.println(3);
		//Class.forName(""); try catch is not there or also not there is throws and not handled
		System.out.println(4);
	}
}
