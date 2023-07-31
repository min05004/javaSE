package section10;
/*
 * 오버라이딩 ( Overriding)
 * 상속받은 메서드를 하위 클래스에서 재정의 하여 상용하는것을 말한다.
 * 
 * super 키워드
 * 부모객체를 참조하는 키워드.
 * 
 * 
 * 
 */
import section10.access1.FruitLatte;

public class ExtendsClass02 {
	public static void main(String[] args) {
		FruitLatte fLatte = new FruitLatte();
		fLatte.name = "딸기라떼";
		fLatte.brand = "메가커피";
		fLatte.isCold = true;
		fLatte.price = 3700;
		fLatte.fruit = "딸기"; //부모의 getInfo(); 여서 보여지지 않음.
		fLatte.origin = "페루";
		
		fLatte.getInfo();
	}

}
