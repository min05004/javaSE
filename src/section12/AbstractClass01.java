package section12;

import section12.access1.Jinro;

/*
 * 추상 클래스 (Abstract Class)
 * 미완성 클래스 ,구현 되지않은 추상메서드가 존재하는 클래스
 * Abstract 키워드를 사용하여 선언된다.
 * 객체 생성 불가.상속 후 추상메서드 구현하여 사용가능.
 * (오버라이딩)
 * 
 * 추상메서드
 * 메서드의 선언부만 있고 실제 구현되지 않으 메서드. 
 * 상속받은 하위클래스에서 구현이 이루어진다(오버라이딩)
 * Abstract 키워드를 사용하여 선언된다.
 * 
 */
public class AbstractClass01 {

	public static void main(String[] args) {
		
		// 추상클래스는 객체 생성불가
		//Alcohol alcol = new Alcohol();
		
		Jinro jinro = new Jinro();
		jinro.name = "진로";
		jinro.proof = 16;
		jinro.price = 5000;
		
		jinro.setTaste("복숭아");
		jinro.getInfo();
		
	}
}
