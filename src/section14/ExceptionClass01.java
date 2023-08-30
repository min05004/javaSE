package section14;
/*
 * 예외(Exception)
 * 자바 프로그램 구동 중에 나타나는 오류를 말한다.
 * 문법적으로 문제없어 보이지만 실제 운영 중에 생기는 문제들.
 * 
 * try ~ catch 예외 처리 방법
 * 
 * try {
 *      정상실행 코드 
 * } catch (익셉션클래스 매개변수명){
 * 해당 예외가 발생했을 경우 실행할 코드
 * }
 * 
 */


public class ExceptionClass01 {
	public static void main(String[] args) {
	 
		int num1 =10;
		int num2 =0;
		int result = 0;
		
		/*
		if(num2 == 0) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
		}else {
		
		result = num1/num2 ; //
		System.out.println("결과 : " + result);
		
		}*/
		
		try {
			result = num1/num2 ; //
			System.out.println("결과 : " + result); //정상실행 코드에서 에러가 나면 실행 안됨.
		}
			catch(Exception e) { //Exception e = new ArithmeticException(); - 가장 위에 상속으로 표현.
				e.printStackTrace(); // 에러가 난 상세를 보여지게 하는것.
				System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			}
		
	}

}
