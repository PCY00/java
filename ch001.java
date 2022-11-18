package onlystudy;

public class ch001 {
	int radius;
	void set(int r) {radius = r;}
	double getArea() {
		return 3.14 * radius * radius;
	}
	public ch001() {}
	
	public ch001(int r) {
		radius = r;
	}
	public static void main(String[] args) {
		ch001 pizza = new ch001(10);
		System.out.println(pizza.getArea());
		
		ch001 donut = new ch001();
		System.out.println(donut.getArea());

	}

}
