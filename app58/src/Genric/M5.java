package Genric;

class PC
{
}
class ABC < X >
{
        X obj;
}
class M5
{
        public static void main(String[] args) 
        {
                ABC < ? > a1 = null;
                a1 = new ABC();
             //   a1.obj = new PC();
                System.out.println("done");
        }
}