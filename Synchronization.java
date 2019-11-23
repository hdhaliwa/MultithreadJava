package co.edureka.thread;

class Printer{
	 void printdocuments(String docName,int copies){
		for(int i = 0; i < copies ; i ++){
			System.out.println("documents are "+ docName +" copies are " + i);
		}
	}
}
class Computer extends Thread{
	Printer pRef;
	Computer(Printer p){
		pRef = p;
		
	}
	public void run(){
		synchronized(pRef){
			try {
				pRef.wait();
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		pRef.printdocuments("Johns documents.pdf", 10);}
	}
}
class MobilePhone extends Thread{
	Printer pRef;
	MobilePhone(Printer p){
		pRef = p;
		
	}
	public void run(){
		synchronized(pRef){
		pRef.printdocuments("WorkingwithJavaProgram.pdf", 10);
		pRef.notify();
		}
	}
}
public class Synchronization {


	public static void main(String[] args) {
		Printer printer = new Printer();  //printer is the hashcode with a reference
		//Computer and Mobile are working on same printer
		Computer cRef = new Computer(printer);
		MobilePhone mRef = new MobilePhone(printer);
		cRef.start();
		mRef.start();
	}

}
