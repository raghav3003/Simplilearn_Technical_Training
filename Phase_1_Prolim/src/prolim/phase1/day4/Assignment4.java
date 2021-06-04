package prolim.phase1.day4;

abstract class Pen {
	abstract void write();
	abstract void refill();
}

class FountainPen extends Pen {

	@Override
	void write() {
		// TODO Auto-generated method stub
		System.out.println("Inside the write method");
	}

	@Override
	void refill() {
		// TODO Auto-generated method stub
		System.out.println("Inside the refill method");
	}
	
	void changeNib() {
		System.out.println("Inside the changeNib method");
	}
	
}

class Monkey {
	
	void jump() {
		System.out.println("Inside the jump method");
	}
	
	void bite() {
		System.out.println("Inside the bite method");
	}
	
}

interface basicAnimal {
	void eat();
	void sleep();
}

class Human extends Monkey implements basicAnimal {

	@Override
	public void eat() {
		System.out.println("Inside the eat method");
	}

	@Override
	public void sleep() {
		System.out.println("Inside the sleep method");
	}
	
}

public class Assignment4 {

	public static void main(String[] args) {
		Monkey m = new Human();
		System.out.println("Methods of object with monkey reference");
		m.jump();
		m.bite();
		
		System.out.println("\nMethods of object with human reference");
		Human h = new Human();
		h.jump();
		h.bite();
		h.eat();
		h.sleep();
		
		System.out.println("\nMethods of object with pen reference");
		Pen p = new FountainPen();
		p.write();
		p.refill();
		
		System.out.println("\nMethods of object with fountain pen reference");
		FountainPen f = new FountainPen();
		f.write();
		f.refill();
		f.changeNib();
	}

}




