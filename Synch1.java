class Printer 
{
	void print(String msg) 
	{
		System.out.print("[" + msg);
		try 
		{
			Thread.sleep(5000);
		} 
		catch (InterruptedException e) 
		{
			System.out.println("Interrupted");
		}
		System.out.println("]");
	}
}
class Caller implements Runnable 
{
	String msg;
	Printer target;
	Thread t;
	public Caller(Printer targ, String s) 
	{
		target = targ;
		msg = s;
		t = new Thread(this);
		t.start();
	}
	public void run() 
	{
		synchronized(target) 
		{
			target.print(msg);	
		}
	}
}
class Synch1 
{
	public static void main(String args[]) 
	{
		Printer target = new Printer();
		Caller ob1 = new Caller(target, "Hello");
		Caller ob2 = new Caller(target, "Programming");
		Caller ob3 = new Caller(target, "World");
		try 
		{
			ob1.t.join();
			ob2.t.join();
			ob3.t.join();
		}
		catch(InterruptedException e) 
		{
			System.out.println("Interrupted");
		}
	}
}