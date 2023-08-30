package section12.access1;

public class Jinro extends Alcohol {

	@Override //추상메서드 오버라이드 됨.(빨간 밑줄 눌러서 add~ )
	public void setTaste(String taste) {
		this.taste = taste;
		//부모의 멤버여서 super로 해도됨.
		
		
	}

}
