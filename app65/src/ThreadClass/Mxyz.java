package ThreadClass;

public class Mxyz extends Thread{
	String name ;
	Mxyz(String name){
		super(name);
	}
	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("hii");
	}
	public static void main(String[] args) {
		Mxyz m1 = new Mxyz("mota");
	}
}
