
public class AbsChild extends Abs {
	@Override
	public void add() {
		System.out.println("abdul");
		
	}
	@Override
	public void sub() {
		System.out.println("bai");
	}

	public static void main(String[] args) {
		AbsChild ab=new AbsChild();
		ab.add();
		ab.sub();
		ab.mul();
		

	}

}
