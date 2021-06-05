package prolim.phase1.day5;

public class Assignment1 extends Thread {

	public void run() {
		System.out.println("Thread name: " + Thread.currentThread().getName());
		System.out.println("Thread name: " + Thread.currentThread().getName() + " Thread id: " + Thread.currentThread().getId());
		System.out.println("Thread name: " + Thread.currentThread().getName() + " Status: " + Thread.currentThread().getState());
		System.out.println("Thread name: " + Thread.currentThread().getName() + " Group: " + Thread.currentThread().getThreadGroup());
		System.out.println("Thread name: " + Thread.currentThread().getName() + " Priority: " + Thread.currentThread().getPriority());
		System.out.println("Thread name: " + Thread.currentThread().getName() + " IsAlive: " + Thread.currentThread().isAlive());
		System.out.println("Thread name: " + Thread.currentThread().getName() + " Daemon: " + Thread.currentThread().isDaemon());
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment1 t1 = new Assignment1();
		Assignment1 t2 = new Assignment1();
		Assignment1 t3 = new Assignment1();
		Assignment1 t4 = new Assignment1();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
		t3.setName("Thread 3");
		t4.setName("Thread 4");
		
		t1.setPriority(MIN_PRIORITY);
		t2.setPriority(MIN_PRIORITY);
		t3.setPriority(MAX_PRIORITY);
		t4.setPriority(MAX_PRIORITY);
		
		t1.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		
	}

}
