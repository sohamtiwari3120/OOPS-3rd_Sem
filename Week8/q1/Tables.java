import java.util.*;
class multiply
{
	synchronized void generateTable(int num)
	{
		try
		{
			for(int i=1;i<11;i++)
			{
				System.out.println(num + "X" +i+"="+(num*i));
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted");
		}
	}
}
class table implements Runnable
{
	multiply m;
	int num;
	Thread t;
	public table(multiply m,int num)
	{
		this.num=num;
		this.m=m;
		t=new Thread(this);
		t.start();
	}
	public void run()
	{
		m.generateTable(num);
	}
}
class Tables 
{
	public static void main(String args[])
	{
		multiply m=new multiply();
		table t1=new table(m,5);
		table t2=new table(m,7);
		try
		{
			t1.t.join();
			t2.t.join();
		}
		catch(InterruptedException e)
		{
			System.out.println("interrupted");
		}
	}
}
