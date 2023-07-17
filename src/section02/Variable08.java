package section02;

/*
 * 형변환(cast)
 * 1.업캐스팅 (프로모션)
 * 	 - 표현 범위가 더 큰 데이터 형으로 변환하기
 * 	 - 자동으로 가능
 * 	 - 데이터 손실이 없다
 * 2.다운캐스팅(디모션)
 * 	- 표현 범위가 더 작은 데이터 형으로 변환하기
 *  - 명시적으로 해야한다.
 *  - 데이터 손실이 있을 수 있다.
 * 
 * 
 */

public class Variable08 {
	public static void main(String[] args) {
		//업개스팅 예
		byte iByte = 10;
		int iInt = iByte; // 자동으로 형변환
		
		System.out.println("iInt:" + iInt);
		
		float iFloat = 10.1f;
		double iDouble =iFloat; // 자동으로 형 변환
		
		//다운캐스팅 예
		
		int iInt2 = 130; //int는 4byte
		byte iByte2 = (byte)iInt2;
		System.out.println("iByte2:" + iByte2);
		
		// 실수 -> 정수 형변환 예
		float iFloat2 = 3.14f;
		int iInt3 = (int)iFloat2; // 소수점 자리 다 떨어져 나감.
		System.out.println("iInt3 " + iInt3);
		
		
		
		
		
		
		
	}

}
