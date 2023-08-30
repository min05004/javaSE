package section03;
/*
 * 7. 쉬프트 연산자
 *  << : 지정한 수만큼 비트를 전부 왼쪽으로 이동시킴
 *  >> : 부호를 유지하면서 지정한 수만큼 비트를 전부 오른쪽으로 이동시킴
 * 
 * 
 * 
 * 8.삼항 연산자(boolean 타입)
 * 조건식 ?  조건식이 참 일 경우 반환 : 조건식이 거짓일 경우 반환
 * 
 * 
 */
public class Operator07 {
	public static void main(String[] args) {
		int num =10;
		String result = num > 0 ? "num은 양수" : "num은 음수"; 
		// 조건식이 true일 경우 앞 결과 반환.false경우 뒤 결과 반환.
		// 한줄로 사용해야 하는 경우에 사용을 많이 함
		System.err.println(result);
		// 보통 if 조건문을 많이 사용함.
		if(num > 10) {
			result = "num은 양수";
		} else {
			result = "num은 음수";
		}
		System.out.println(result);
		
		
		int x = 3;
		int y = 7;
		
		System.out.println(x << 2); // 0011 << 2 -> 1100
		System.out.println(y >> 7);
		
		}
	
	
		
	
}

