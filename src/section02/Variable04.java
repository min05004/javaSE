package section02;

public class Variable04 {
/*
 * 3.정수형
 * byte (메모리크기 1byte - 8bit) : -128 ~+127 // 표현범위 기억해두기, overflow 128은 -128로 표현(다시 아래로 돌아감),
 * 
 * short (2byte) : -32,768~ +32,767
 * int (4byte) : -2,147,483,648 ~ + 2,147,483,647 (21억 정도로 기억해두기) //기본 인식 타입(제일 많이 활용)
 * long (8byte) :-9,223,372,036,85,775,808 ~
 * 
 * underflow 나 overflow 현상을 생각해서 표현범위 생각하기.
 * 
 */
	public static void main(String[] args) {
		//정수형 변수 선언과 동시에 값 대입하기
		byte nByte = 10;
		//선언 =(연산자) 숫자 (대입값);
		short nShort = 100;
		int nInt = 1000;
		long nLong = 10000;
		
		System.out.println("byte 형: "+ nByte); // 문자 + 숫자 : 문자
		System.out.println("short 형: "+ nShort);
		System.out.println("int 형: "+ nInt);
		System.out.println("long 형" + nLong);
		
		
		nByte += 120;
		// nBtye = nByte + 120;
		System.out.println("byte overflow" + nByte); //
		
	}
}
