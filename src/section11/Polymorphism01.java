package section11;

import section11.access1.Bus;
import section11.access1.Car;

/*
 * 다형성(Polymorphism)
 * 같은 인터페이스 또는 부모 클래스를 공유하는 객체가 여러 유형의
 * 타입을 가질수 있는 기능.
 * 
 * 
 * 
 */



public class Polymorphism01 {
	public static void main(String[] args) {
		Bus bus = new Bus();
		bus.drive();
		bus.bell();
		
		
		Car car = new Bus(); //car 값에 Bus 주소값을 넣어줌.
		car.drive();// 
		((Bus)car).bell(); // Car와 type이 달라서 출력을 못함(문법적으로 틀려서 컴파일 에러가 뜸.) 
		
		Bus bus2 = (Bus) car; // car가 bus의 주소값을 가지고 잇어서,bus2에 bus주소값이 들어감.(car과 같은 값을 참조)
		bus2.drive();
		bus2.bell();
		
	}
	
	
	
}
