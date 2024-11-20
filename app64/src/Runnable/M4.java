package Runnable;

import java.util.Iterator;

public class M4 {
	static Runnable getRunnable() {
		return new Runnable() {
			@Override
			public void run() {
				for(int i = 1; i <= 108; i++)
				{
					System.out.println("!! Narayn ji !!");
				}
			}
		};
	}
	
	public static void main(String[] args) {
		new Thread(getRunnable()).start();
		
		for(int i = 1; i <= 108; i++)
		{
			System.out.println("!! Shree Ram ji !!");
		}
	}
}
