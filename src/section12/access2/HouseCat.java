package section12.access2;
                                  //, 로 추가가능.
public class HouseCat implements Cat,Playable {

	@Override
	public void eat() {
		System.out.println("경계하며 먹어요");
	}

	@Override
	public void sleep() {
		System.out.println("밤에 잠을 안자요");
		
	}

	@Override
	public void hunt() {
		System.out.println("주인에게 사냥감을 선물해요");
		
	}

	@Override
	public void play() {
		System.out.println("공을 가지고 놀아요"); //다중 상속이 가능함.
		
	}

}
