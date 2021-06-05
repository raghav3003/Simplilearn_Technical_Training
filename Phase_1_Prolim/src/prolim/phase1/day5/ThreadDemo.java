package prolim.phase1.day5;

class ThreadDemo extends Thread {
	
	public void run() {
		synchronized (this) {
			for (int i = 0; i < 10; i++) {
				System.out.println(i);
				try {
					Thread.sleep(200);
				} catch (InterruptedException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
//		ThreadDemo t3 = new ThreadDemo();
//		ThreadDemo t4 = new ThreadDemo();
		
		t1.setName("Thread 1");
		t2.setName("Thread 2");
//		t3.setName("Thread 3");
//		t4.setName("Thread 4");
		
//		t1.setPriority(MIN_PRIORITY);
//		t2.setPriority(MIN_PRIORITY);
//		t3.setPriority(MAX_PRIORITY);
//		t4.setPriority(MAX_PRIORITY);
		
		t1.start();
		t2.start();
//		t3.start();
//		t4.start();
		
	}

}
