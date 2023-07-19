package section04;
/*
 * 1-2. if ~ else 문
 * if (조건식) {
 * 	조건식 true 일 때 실행 명령문
 * } else {
 * 		조건식  false 일 때 실행 명령문
 *  }
 * 
 */
public class Conditional02 {
	public static void main(String[] args) {
		int num = 11;
		// 같은 변수 일 경우는 한번에 묶어서 사용가능.
		if(num % 2 == 0) {
			System.out.println("num은 짝수 입니다."); //true 일 경우
		} else {
			System.out.println("num은 홀수 입니다."); //false 일 경우
		}
	}
    }

	
	