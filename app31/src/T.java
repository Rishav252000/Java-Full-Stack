import java.util.Arrays;
class T 
{
	public static void main(String[] args) 
	{
		int[] elements = {10, 20, 30, 40, 50};
		System.out.println("initial content:" + Arrays.toString(elements));
		
		//swap first element with 2nd element		
		int temp = elements[0];
		elements[0] = elements[1];
		elements[1] = temp;
		System.out.println("final content:" + Arrays.toString(elements));
	}
}
