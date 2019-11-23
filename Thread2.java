package co.edureka.thread;

class MyThread implements Runnable
{
	public void run(){
		Thread t = Thread.currentThread();
		System.out.println(t);
	}
}




public class Thread2 
{

	public static void main(String[] args)
	{
		System.out.println("No of active thread "+Thread.activeCount());
		Thread t = Thread.currentThread();
		System.out.println(t);
		
		MyThread obj = new MyThread();
		Thread ct = new Thread(obj);
		ct.start();//call stack
		System.out.println("No of active thread "+Thread.activeCount());

	}

}
