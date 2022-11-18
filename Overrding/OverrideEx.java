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
		System.out.println("기본 무기의 살상 능력은 " + base.fire());
		
		base = new cannon();
		System.out.println("cannon의 살상 능력은 " + base.fire());
	}

}
