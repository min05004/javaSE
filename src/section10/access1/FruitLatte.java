package section10.access1;

public class FruitLatte extends Latte {
	//선언 및 정의를 안하더라도 부모명을 받을 수 있음. 세부적인 카테고리명 클래스를 만들어 따로 추가.
	public String fruit;
	public String origin;
	 
	@Override //@ 어노테이션  - 클래스, 메서드, 필드 등 추가적인 메타 정보 제공
	
	public void getInfo() {
		super.getInfo(); // super 는 부모를 참조 하는 키워드. 부모꺼에 추가로 속성 값을 넣을때.
		System.out.println("fruit :" + fruit); 
		System.out.println("origin : " + origin);
		
	}

}
