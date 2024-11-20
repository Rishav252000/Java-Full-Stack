package app59;
class G {
	int i;
	G(int i){
		this.i = i;
	}
	@Override
	public int hashCode() {
		String s1 =Integer.toString(i);
		int hash = s1.hashCode();
		return hash;
	}
}
public class M7 {
	public static void main(String[] args) {
		G g1 = new G(90);
		System.out.println(g1.hashCode());
		
		G g2 = new G(90);
		System.out.println(g2.hashCode());
		
		G g3 = new G(90);
		System.out.println(g3.hashCode());
		G g4 = g3;
		System.out.println(g4.hashCode());
	}
}
