package app59;
class H{
	int i;
	H(int i){
		this.i = i;
	}
	@Override
	public int hashCode() {
		String s1 = Integer.toString(i); // converting  integer to string 
		int hash = s1.hashCode();
		return hash;
	}
}
public class M9 {
	public static void main(String[] args) {
		H h1 = new H(90);
		H h2 = new H(90);
		H h3 = new H(901);
		H h4 = new H(901);
		
		System.out.println(h1.hashCode());
		System.out.println(h2.hashCode());
		System.out.println(h3.hashCode());
		System.out.println(h4.hashCode());
	}
}
