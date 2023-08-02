package section11;

import section07.Car;
import section11.access1.Bus;
import section11.access1.SchoolBus;

public class Polymorphism02 {
	public static void main(String[] args) {
		/*
		 * 
		 * 
		 * 
		 */
		
		SchoolBus sb1 = new SchoolBus();
		sb1.drive(); //스쿨

			System.out.println(System.identityHashCode(sb1)); //주소값 확인해보기!
		
		Bus c1 =sb1; //스쿨
		c1.drive();
			System.out.println(System.identityHashCode(c1));
		
			
		Bus b1 =(Bus)c1; //스쿨 상위 클래스에서 하위 클래스 대입 강제형변환.
		b1.drive();
			System.out.println(System.identityHashCode(b1));
	
			System.out.println("sb1.color : "+ sb1.color);
			System.out.println("c1.color : "+ c1.color);
			System.out.println("b1.color : "+ b1.color);
			
			
			c1.color = "빨강";
			
			System.out.println("sb1.color : "+ sb1.color);
			System.out.println("c1.color : "+ c1.color);
			System.out.println("b1.color : "+ b1.color);
			
			
	}

}
