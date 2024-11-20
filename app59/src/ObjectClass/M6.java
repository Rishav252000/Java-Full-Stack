package ObjectClass;

class C
{
        int i;
        @Override
        public int hashCode() {
                return i;
        }
}
public class M6 {
//        public static void main(String[] args) {
//                C c1 = new C();
//                c1.i = 10;
//                C c2 = new C();
//                c2.i = 10;
//                
//                System.out.println(c1.hashCode());
//                System.out.println(c2.hashCode());
//        }
	public static void main(String[] args) {
        Integer obj1 = 100;
        Integer obj2 = new Integer(100);
        System.out.println(obj1.hashCode());
        System.out.println(obj2.hashCode());
}
}
