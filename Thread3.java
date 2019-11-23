package co.edureka.thread;

class MyThread1 extends Thread
{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}


public class Thread3
{

	public static void main(String[] args)
	{
		
		System.out.println("No of active threads "+Thread.activeCount());
		Thread t = Thread.currentThread();
		
		System.out.println(t);
		
		MyThread1 ct = new MyThread1();
		ct.start();
	}

}
