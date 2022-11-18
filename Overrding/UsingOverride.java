class Shape {
	public Shape next;
	public Shape() { next = null;}
	
	public void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	@Override
	public void draw() {				//�޼ҵ� �������̵�
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	public void draw() {				//�޼ҵ� �������̵�
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	public void draw() {				//�޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

public class UsingOverride {
	public static void main(String[] args) {
		Shape start, last, obj;
		
		//��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		start = new Line();
		last = start;
		obj = new Rect();
		last.next = obj;
		last = obj;
		obj = new Line();
		last.next = obj;
		last = obj;
		obj = new Circle();
		last.next = obj;
		
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
		
	}

}
