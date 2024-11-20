class K implements Runnable
{
	Runnable r1;
	K()
	{
		
	}
	K(Runnable r1)
	{
		this.r1 = r1;
	}
	public void run()
	{
		if(r1 != null)
		{
			r1.run();
		}
	}

	public void start()
	{
		//registring with thread schedular
		run();
	}

	// other member
	
	
}
