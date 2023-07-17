package section02;
/*
 * 4.실수형
 * 소수부나 지수부가 있는 수를 가르킨다
 * 실수를 저장할 수 있는 자료형
 * 
 * float (4byte) : (3.4*10^-38) ~ (3.410^38) 소수점 7자리 표현
 * double (8byte) : 소수점 15자리 표현 
 * 
 * alt +ctrl  아래 위 방향키 줄복사
 * 
 */
public class Variable05 {
	public static void main(String[] args) {
		float nFloat = 10.1f; 
		double nDouble = 10.1d;
		double nDouble2 = 10.1; // d생략 가능.
		
		System.out.println("float 형: "+ nFloat);
		System.out.println("double 형" + nDouble);
		System.out.println("double 형" + nDouble2);
		
}
}
