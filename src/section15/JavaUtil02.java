package section15;

import java.util.Random;

public class JavaUtil02 {
	public static void main(String[] args) {
		
		int[]lNum = new int[45]; 
		for(int i= 0; i< lNum.length; i++) { 
			lNum[i] = i+1;
			// 1~45까지의 배열값 저장
		}
		Random ran = new Random(); //랜덤 객체 생성
		
		for(int i =0 ; i<lNum.length; i++) {
			int ChangeIndex = ran.nextInt(45); //0에서 44까지 숫자중 임의 값 반환.

			int tmp = lNum[i]; // i 가 0 일때 tmp는 1
			lNum[i] = lNum[ChangeIndex]; // i의 값이 1일때  0~44의 값중 랜덤 반환 값
			lNum[ChangeIndex] = tmp; // lNum[ChangeIndex] , lNum[i] 서로의 값을 바꾸는 결과 값이 나옴.
			
		}
		
		for(int i =0; i <6; i++) {
			System.out.print(lNum[i]+ "/");
		}
		
		
	}

}
