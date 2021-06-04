package prolim.phase1.day4;

interface Drawable {
	public int salary = 100;
	
	void draw();
	void show();
}

interface Shape {
	public int salary = 200;
	void shape();
	void show();
}

public class InterfaceDemo implements Drawable, Shape {
	
	

	public static void main(String[] args) {
		InterfaceDemo obj = new InterfaceDemo();
		obj.draw();
		obj.show();
		obj.shape();
		
		Drawable dr = new InterfaceDemo();
		Shape sh = new InterfaceDemo();
		
		System.out.println(dr.salary);
		System.out.println(sh.salary);
	}

	@Override
	public void shape() {
		System.out.println("Inside shape");		
	}

	@Override
	public void draw() {
		System.out.println("Inside draw");
	}

	@Override
	public void show() {
		System.out.println("Inside show");
	}

}
