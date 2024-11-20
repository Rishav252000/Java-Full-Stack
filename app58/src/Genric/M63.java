package Genric;

class AAA 
{
	
        static <T> void test(T obj1, T obj2)
        {
        	
        }
}
public class M63
{

        
        
        class M64
        {
                public static void main(String[] args) 
                {
                        AAA.test(100, 200);
                        AAA.test("abc", "xyz");
                    //    AAA.<String, Integer>test("abc", 5000);
                    //    AAA.<Double, String >test(4.5, "test");
                        System.out.println("done");
                }
        }
}
//public static void main(String[] args) 
//{
//      A.<Integer>test(100, 200);
//      A.<String>test("abc", "xyz");
//      System.out.println("done");
//}