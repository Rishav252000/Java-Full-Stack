class G 
{
	int i;
	
	G(int i)
	{
		//	i = i;
		this.i = i;
	}
	public static void main(String[] args) 
	{
		G g1 = new G(200);
		System.out.println(g1.i);
	}
}
