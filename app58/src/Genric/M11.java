package Genric;
class D{
	static <T, S> S test(S obj1, T obj2)
	{
		return obj1;
	}
}
public class M11 {
	public static void main(String[] args) {
		String s1 = D.<Integer, String>test("avc", 12);
		Integer t1 = D.<String, Integer>test(12, "asd");
		System.out.println(s1);
	}
}
