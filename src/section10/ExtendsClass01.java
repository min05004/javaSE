package section10;

import section10.access1.*; //.*; - section10.access1 에 있는 모든 값 호출 가능.

/*
 * 상속
 * 부모 클래스 (상위 클래스)와 자식 클래스(하위 클래스)가 있으며
 * 자식 클래스는 부모 클래스를 상속받아 그 부모의 멤버(변수,메소드) 사용이 가능하다.
 * 
 * 
 * 상속 방법
 * class 하위 클래스명 extends 상위 클래스명
 * 
 * 
 */


public class ExtendsClass01 {
	public static void main(String[] args) {
		Latte latte = new Latte(); //ctrl + space 눌러서 Latte class를 import 해줌/클래스명 잘 확인하기
		latte.name = " 카페라떼";
		latte.isCold = false;
		latte.brand = "별다방";
		latte.price = 5000;    //카페라떼라는 객체 정보 만듬
		
		latte.getInfo(); // 출력
		
	}

}
