package practice;
public class M15 {
	public static void main(String[] args) {
		if(args.length == 0) {
			System.out.println("please provide Input");
			return;
		}
		
		for(String s1 : args)
		{
			Integer c1 = Integer.valueOf(s1);
			System.out.println(c1);
		}
	}
}
