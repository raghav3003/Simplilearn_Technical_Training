package prolim.phase1.day5;

class MyThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 10; i++) {
//			System.out.println("Executing thread: " + Thread.currentThread().getName());
			System.out.println("Learning java");
		}
	}
	
}

class YourThread extends Thread {
	
	public void run() {
		for (int i = 0; i < 5; i++) {
//			System.out.println("Executing thread: " + Thread.currentThread().getName());
			System.out.println("We are into Phase 1");
		}
	}
	
}

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyThread t1 = new MyThread();
		YourThread t2 = new YourThread();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		
		t1.start();
		t2.start();
	}

}
