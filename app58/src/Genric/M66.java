package Genric;
class BA
{
        static <T> void test(T obj1, T obj2)
        {
        }
}
public class M66
{
	
        public static void main(String[] args) 
        {
        //	BA a = new BA();
              BA.test(100, 200);
                BA.test(2000, "avxc");
                System.out.println("done");
        }
}
