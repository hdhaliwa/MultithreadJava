// Main thread to display 10 number, and child thread to display even numbers

package co.edureka.thread;

class MyThread2 extends Thread
{
	public void run(){
		for (int n=2;n<=20;n+=2)
		{
			System.out.println("Even ="+n);
		}
	}
}




public class Thread4
{

	public static void main(String[] args)
	{
		MyThread2 obj = new MyThread2();
		obj.start();
		for(int i=1;i<=10;i++)
		{
			System.out.println("Natu = "+i);
		}
		
	}
	
	

}
