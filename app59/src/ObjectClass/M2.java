package ObjectClass;

class G{
    int i;
    G(int i){
            this.i = i;
    }
    @Override
    public boolean equals(Object obj) {
            return (obj instanceof G && i == ((G)obj).i);
    }
}
public class M2 {
    public static void main(String[] args) {
            G g1 = new G(10);
 //           F f1 = new F(10);
 //           A a1 = new A();
  //          a1.i = 10;
            
   //         System.out.println(g1.equals(f1));
     //       System.out.println(g1.equals(a1));
            System.out.println(g1.equals(10));
            System.out.println(g1.equals(10.0));
    }
}