package ObjectClass;

class D{
    int i, j;
    D(int i, int j) {
            this.i = i;
            this.j = j;
    }
    @Override
    public boolean equals(Object obj) {
            // TODO Auto-generated method stub
            return (this.i == ((D)obj).i && this.j == ((D)obj).j);
    }
}
public class M3 {
//    public static void main(String[] args) {
//            D d1 = new D(10,20);
//            D d2 = new D(10,20);
//            
//            System.out.println(d1 == d2);
//            System.out.println(d1.equals(d2));
//            System.out.println(d1.i == d2.j && d1.j == d2.j);
//    }
//	public static void main(String[] args) {
//        Thread t1 = Thread.currentThread();
//        System.out.println(t1.getPriority());
//        t1.setPriority(11);
//        System.out.println(t1.getPriority());
//}
	public static void main(String[] args) {
        Thread t1 = Thread.currentThread();
        System.out.println(t1.getPriority());
        t1.setPriority(11);
        System.out.println(t1.getPriority());
}
}