package section07;

/*
 * 상수
 * 처음 할당된 값이 변경되지 않는 변수
 * final 예약어(키워드) 사용 
 * 보통 대문자로 선언
 * 
 * 
 */
public class Constant01 {
	static final double PI = 3.14; // 상수는 전역변수로 많이 사용. 사라지지않음.
	
	public static void main(String[] args) { //해당 내용이 끝나면 사라짐.
		//원의 반지름
		int r = 10;
		
		// PI = 3.141592; //값을 바꿔서 삽입해도 변하지 않음.
		
		
		//원의 넓이 
		double area = PI * r * r;
		System.out.println("원의 넓이: " + area);
		
		
		area = 0; //0으로 초기화
		area = Math.PI * Math.pow(r, 2); //Math라는 자바에 저장되어있는 서식 활용.거듭제곱을 해줌. 2의 제곱./좀 더 정확함
		System.out.println("원의 넓이2: " + area);
		
	}
	

}
