package section02;

import java.math.BigDecimal;

/*
 * 데이터 표현 방식
 * 정수 표현
 * 		컴퓨터는 2진수로 표현(bit)
 * 		부호비트 (msb) + 수치비트
 * 		음의 값을 표현할 때 2의 보수 표현
 * 
 * 실수 표현(부동소수표현)
 * 	지수부(e)비트 + 가수부(m)비트
 * 
 * 실수표현 수식
 * 	 ±(1.m)*2^(e-127) : 0이 나오지 못함 ,근사치 까지 표현
 * 부동소수점 오차
 *  정확한 실수 표현 불가능 근사치 값으로 인해 생긴 오차
 * 	: 예외처리를 해야함.(소수 2자리 또는 4자리 등) - 금액과 같은 부분들에 대해 사전에 미리 협의해야서 진행해야함(달러나,비트코인등)
 * 
 * 
 */
public class Variable06 {
public static void main(String[] args) {
	 float f = 0.0f;
	 double d = 0.0;
	 BigDecimal bd = new BigDecimal(0.0); // Java 라이브러리 안에 있는 만들어진 서식.(근사치를 줄이기 위해서 만든 서식)
	 
	 for (int i = 0; i < 100; i++) {
		 f += 0.1f;
		 // f = f+ 0.1f;
		 // for 반복문 : 위에 {} 안에 서식을 100번 반복.
		 d += 0.1;
		 bd = bd.add(new BigDecimal(0.1));
		 
	 
	 }
	 System.out.println(f);
	 System.out.println(d); //float 보다 근사치가 적음
	 System.out.println(bd);
	 

	 
}

}
