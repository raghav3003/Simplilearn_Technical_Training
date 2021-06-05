package prolim.phase1.day5;

class Line {
	synchronized public void getLine() {
		for (int i = 0; i < 3; i++) {
			System.out.println(i);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}

class Train extends Thread {
	
	Line line;
	
	Train (Line line) {
		this.line = line;
	}
	
	public void run() {
		line.getLine();
	}
	
}

public class SynchronizedDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Line l = new Line();
		Train t1 = new Train(l);
		Train t2 = new Train(l);
		
		t1.start();
		t2.start();
		
	}

}
