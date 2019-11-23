package co.edureka.thread;

public class Thread1 {

	public static void main(String[] args) throws InterruptedException 
	{
		System.out.println("No of active thread "+Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		for (int n=1;n<=10;n++)
		{
			System.out.println(n);
			Thread.sleep(2000);
		}
	}

}
