package section15;
/*
 * 1.얕은 복사(shallow copy) :
 * - 참조형 변수의 주소값만 복사.
 * - 동일한 객체를 참조하게 된다.
 * 
 * 
 * 2.깊은 복사 (deep copy)
 * - 객체 멤버 변수 값과 객체가 참조하는 객체까지 모두 복사하는 방식.
 * - 새로운 (다른) 객체를 참조하게 된다.
 * 
 * 
 */
import section15.access1.Soccer;

public class javaLang02 {
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Soccer soccer1 = new Soccer("리버풀","리버풀","프리미엄 리그",1892);
		Soccer soccer2 = soccer1;
		
		Soccer soccer4 = (Soccer) soccer1.callclon(); // clone은 똑같은 값을 복사한 객체를 만들어줌.해당 값을 바꿔도 바꾸지 전 값이 나옴.
		soccer1.team = "리버풀 fc";
		
		
		
		if(soccer1.equals(soccer2)) { 
			System.out.println("soccer1과 soccer2는 같다");
		}else {
			System.out.println("soccer1과 soccer2는 다르다");
		
	}
		if(soccer1.equals(soccer4)) {
			System.out.println("soccer1과 soccer4는 같다");
		}else {
			System.out.println("soccer1과 soccer4는 다르다");
			
		}
		System.out.println("=== 주소값 비교하기 ===");
		
		System.out.println(System.identityHashCode(soccer1));
		System.out.println(System.identityHashCode(soccer2));
		System.out.println(System.identityHashCode(soccer4));
		
		System.out.println("==== 값 비교 하기 =====");
		
		System.out.println(soccer1);
		System.out.println(soccer2);
		System.out.println(soccer4);
	
	
	}}
