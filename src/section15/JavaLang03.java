package section15;
/*
 * String 클래스
 *  자바에서 문자열을 다루기 위해 사용되는 클래스
 *  java.lang 패키지에 포함.
 * 
 * 불변의 객체 : 중간에 객체의 값을 추가하거나 변경하면, 추가나 변경이 된 새로운 영역이 생긴다는 뜻.
 * - 생성된 후 메모리에서 문자열 값이 변경되지 않는다. 
 * (변경 불가 객체)
 * 1. 메모리 절약이 가능.
 * 2. 보안성이 up
 * 3. Thread Safe  - 동시에 같은 수정 작업등을 했을 경우 용이함.
 */


public class JavaLang03 {
	public static void main(String[] args) {
		
		String str1 = "abc"; // new 연산자 사용안해도 객체생성 가능
		System.out.println(str1); // String은 주소값이 아닌 값이 나옴.  
		System.out.println(str1.toString()); // (오버라이딩 되어있다는 뜻.) 
		
		
		String str2 = "abc"; 
		String str3 = new String("abc"); // new 연산자를 사용하면 하나의 공간이 또 생김.주소값이 달라짐.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
	
		System.out.println("===========================");
		str2+="d"; // d라는 문자값을 추가했을 경우
		//String은 추가나 변경이 된 새로운 영역이 생긴다.
		
		System.out.println(System.identityHashCode(str1));
		System.out.println(System.identityHashCode(str2));
		System.out.println(System.identityHashCode(str3));
		
		System.out.println("============================");
		
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str3);
		
		
		if(str1==str2) {
			System.out.println("str1 == str2 ture");
		}else {
			System.out.println("str1 == str2 false");
		}
		

		if(str1==str3) {
			System.out.println("str1 == str2 ture");
		}else {
			System.out.println("str1 == str2 false");
	}
		//str1 = null; 일 경우 안에 객체가 없기 떄문에,에러가 뜸.
		
		if(str1.equals(str3)) { //문자열을 비교할 경우는 equals는 값을 비교하게 오버라이딩되어 있음.즉 같은 객체가 아닌 같은 값인지를 알수있다.
			//String은 equals로 사용.
			System.out.println("str1.equals(str3) true");
		}else {
			System.out.println("str1.equals(str3) true");
		}

}
}
