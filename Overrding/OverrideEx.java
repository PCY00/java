class Weapon{
	protected int fire() {
		return 1;
	}
}
class cannon extends Weapon{
	
	@Override
	protected int fire() {
		return 10;
	}
}

public class OverrideEx {

	public static void main(String[] args) {
		Weapon base;
		
		base = new Weapon();
		System.out.println("�⺻ ������ ��� �ɷ��� " + base.fire());
		
		base = new cannon();
		System.out.println("cannon�� ��� �ɷ��� " + base.fire());
	}

}
