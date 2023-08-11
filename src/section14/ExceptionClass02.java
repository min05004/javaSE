package section14;

public class ExceptionClass02 {
	public static void main(String[] args) {
		
		String str = null; // 참조값 없음.
		int num1 = 10;
		int num2 = 0;
		int result = 0;
		
	
		try {
			System.out.println("str 첫번째 글자 : " + str.charAt(0));
			result = num1/num2;
			System.out.println("결과 : " + result);
		
		} catch(NullPointerException ne) {
			System.out.println("null 익셉션 발생하였습니다.");
			ne.printStackTrace();
		
		} catch(ArithmeticException ae) {
			System.out.println("어떠한 수를 0으로 나눌 수 없습니다.");
			ae.printStackTrace();
			
		}catch(Exception e){ // 제일 아래에 써줘야함!  예상하지 못한 그 외 에러가 발생하였을때 나오게~
		System.out.println("예외가 발생 하였습니다.");
		e.printStackTrace();
		}

		
	}

}
