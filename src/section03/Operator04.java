package section03;
/*
 * 
 * 4.논리연산자
 * 	&& : And 조건, 교집합 개념, 두 항 모두 true 일때 true / 하나만 true 일땐 ,false나옴
 * 	|| : Or 조건 , 합집합 개념, 두 항 중 하나 이상 true 일때 true
 * 	 ! : Not 조건, 여집합 개념, 논리(boolaen)값 반전 시킨다.
 * 
 * 
 * 
 */ 
public class Operator04 {
	public static void main(String[] args) {
		boolean result = true && false;
		System.out.println("true && false: " + result);
		
		result = true || false;
		System.out.println("true || false:" + result);
		
		result = !result;
		System.out.println("!result: " + result);
		
		// 예문1. 내가 주문한 '의류'라는 상품이 할인 적용 대상 상품인지.
		String order = "의류";
		if (order =="식품" || order == "전기전자" || order == "의류") {
			System.out.println("20% 할인 행사 중 입니다.");
		} else {
			System.out.println("할인 미적용 상품입니다.");
		}
		// (안에 있는 것은 우선순위 연산자) 
		result = !(true && true && true) || false;
		System.out.println(result);
		
		
	}

}
