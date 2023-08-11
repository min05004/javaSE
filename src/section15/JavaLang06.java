package section15;

public class JavaLang06 {
	public static void main(String[] args) {
		Integer num1 = 10;
		Integer num2 = 10000;
		
		/*
		 * compareTo() : 비교 메서드
		 * 결과가 음수 양수 0 이렇게 나눠서 나옴.
		 * 
		 * 예) num1.compareTo(num2)
		 * 결과가 양수이면 num1 > num2
		 * 결과가 음수이면 num1 < num2
		 * 결과가 0이면 num1 = num2
		 */
		
		
		if(num1.compareTo(num2) > 0) {
			System.out.println("num1 > num2");
			
		}else if (num1.compareTo(num2)==0) {
			System.out.println("num1 = num2");
			
		}else {
			System.out.println("num1 < num2");
		}
		//문자열 숫자 값을 Integer로 변환.
		String strNum = "999";
		Integer num3 = Integer.parseInt(strNum); //자주 사용됨.
		
		num3 += 1;
		
		//Integer 값 문자열로 변환. - 숫자를 문자로
		String strNum2 = num3.toString();
		
		System.out.println("strNum2: " + strNum2);

		System.out.println("Int Max:"+Integer.MAX_VALUE); //최대 , 최소 값 표시
		System.out.println("Int Min:"+Integer.MIN_VALUE);
		
		
		
		//최소값 최대값 비교
		
		int minValue = Integer.min(num1,num2);
		int maxValue = Integer.max(num1,num2);

		System.out.println("최소값 : " + minValue);
		System.out.println("최대값 : " + maxValue);
		
		
		//true ,false값으로 나옴.
		
		System.out.println("문자 입니까?" + Character.isLetter('아')); // 문자일때
		System.out.println("숫자 입니까?" + Character.isDigit('5')); // 숫자일때
		System.out.println("공백 입니까?" + Character.isWhitespace(' ')); 
		
		
}
}