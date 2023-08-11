package section15;
/*
 * java.util 자바 유틸 패키지
 *  자바에서 유용한 유틸클래스,인터페이스 포함하는 패키지
 *  
 * Random 클래스
 * 난수 생성을 해주는 클래스
 * 
 * 
 * 
 */

import java.util.Random; //import 해줘야함.

public class JavaUtil01 {
	public static void main(String[] args) {
		Random ran = new Random();
		//0~99사이 정수중 랜덤값 반환.
		int ranNum = ran.nextInt(100); //범위
		System.out.println("난수 : " +ranNum);
		
		//0이상 1미만 double 값으로 난수 변환
		if(ran.nextDouble()>0.5) { // 0.5 보다 작을때 -> 50% 확률
			System.out.println("강화에 성공했습니다.");
		}else {
			System.out.println("강화에 실패했습니다.");
		}
		
		
		
	}

}
