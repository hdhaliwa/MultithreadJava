package co.edureka.thread;

class MyTask extends Thread {
	public void run(){
	for(int i = 1; i < 10; i++ ) {
		System.out.println("##My Task " +i);
	}
	}
}
class YourTask extends Thread implements Runnable{
	public void run(){
		for(int i = 1; i < 10; i++ ) {
			System.out.println("##Your Task " +i);
		}
	}
}
public class ThreadsApp {

	public static void main(String [] args){
		//Job1
		System.out.println("App Started");
		//Job2
		MyTask mref = new MyTask();
		
		//polymorphic statement
		Runnable r = new YourTask();
		Thread yref = new Thread(r);
		mref.start();
		yref.start();
		//Job3
		for(int i = 1; i < 10 ; i ++){
			System.out.println("Main Thread");
		}
		//Job4
		System.out.println("App Finished");
	}

}
