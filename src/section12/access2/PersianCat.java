package section12.access2;
//인터페이스는 implements로 상속받음.

public class PersianCat implements Cat{

	@Override
	public void eat() {
		System.out.println(" 교양있게 먹어요 ");
	}

	@Override
	public void sleep() {
		System.out.println(" 우아하게 잡니다. ");
		
	}

	@Override
	public void hunt() {
		System.out.println(" 도도하게 사냥을 해요 ");
		
	}

	@Override
	public void play() {
		// TODO Auto-generated method stub
		
	}

}
