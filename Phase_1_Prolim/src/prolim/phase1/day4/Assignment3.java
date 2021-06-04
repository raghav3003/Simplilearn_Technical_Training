package prolim.phase1.day4;

abstract class Marks {
	abstract double getPercentage();
}

class A extends Marks {
	int marksSubject1;
	int marksSubject2;
	int marksSubject3;
	
	A(int marksSubject1, int marksSubject2, int marksSubject3) {
		this.marksSubject1 = marksSubject1;
		this.marksSubject2 = marksSubject2;
		this.marksSubject3 = marksSubject3;
	}
	
	double getPercentage() {
		return (marksSubject1 + marksSubject2 + marksSubject3) / 3.0;
	}
	
}

class B extends Marks {
	int marksSubject1;
	int marksSubject2;
	int marksSubject3;
	int marksSubject4;
	
	B(int marksSubject1, int marksSubject2, int marksSubject3, int marksSubject4) {
		this.marksSubject1 = marksSubject1;
		this.marksSubject2 = marksSubject2;
		this.marksSubject3 = marksSubject3;
		this.marksSubject4 = marksSubject4;
	}
	
	double getPercentage() {
		return (marksSubject1 + marksSubject2 + marksSubject3 + marksSubject4) / 4.0;
	}
	
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Marks studentA = new A(90, 96, 93);
		Marks studentB = new B(90, 96, 93, 94);
		
		System.out.println("Percentage of student A: " + studentA.getPercentage() + "%");
		System.out.println("Percentage of student B: " + studentB.getPercentage() + "%");
		
	}

}
