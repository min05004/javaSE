package section15;
/*
 * java.lang 패키지
 *  자바에서 기본 제공해주는 패키지
 *  import 없이 사용이 가능.
 *  
 *  Object 클래스
 *   자바에서 모든 클래스의 최상위 부모 클래스
 *   명시하지 않아도 모든 클래스는 object 를 상속 받는다.
 *   
 * equals() 메서드 : 두객체가 동일하면 true 동일하지 않으면 false
 * 
 * hashcode() 메서드 : 객체의 메모리 번지를 이용 해시코드를 만들어 리턴
 * 
 * toString() 메서드 : 객체의 문자 정보를 리턴, 즉 객체를 문자열로 표현
 * 
 * clone () 메서드 : 새로운 객체로 복사, Clonable 인터페이스 상속받은 객체만 사용가능.
 * 
 * 
 */

import section15.access1.Soccer;

public class JavaLang01 {
	public static void main(String[] args) {
		
		Soccer soccer1 = new Soccer("리버풀","리버풀","프리미엄 리그",1892);
		Soccer soccer2 = new Soccer("리버풀","리버풀","프리미엄 리그",1892); //1,2는 값이 같아도 객체가 다른 객체임.
		Soccer soccer3 = soccer1; //참조 값이 같아짐. 같은객체가 됨.
		
	System.out.println(soccer1); // System.out.println(soccer1.toString); 와 동일.
	System.out.println(soccer1.toString());
	
	if(soccer1.equals(soccer2)) { 
		System.out.println("soccer1 과 soccer2 는 같습니다.");
	}else {
		System.out.println("soccer1 과 soccer2 는  다릅니다.");
	}
			System.out.println("============System.identityHashCode==============");
		System.out.println(System.identityHashCode(soccer1));
		System.out.println(System.identityHashCode(soccer2));
		System.out.println(System.identityHashCode(soccer3));
		
		System.out.println("============HashCode==============");
		System.out.println(soccer1.hashCode());
		System.out.println(soccer2.hashCode());
		System.out.println(soccer3.hashCode());
	
	
	}

}
