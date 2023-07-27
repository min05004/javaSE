package section06;

import java.util.Scanner;

public class Array_self4 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		int scores [][] = new int [4][3]; //4명의 학생의 3가지 점수요소 넣기.
			String subject[] = { "국어","영어","수학"}; //문자값은 숫자처럼 1더해서 증가가 불가능 하기 때문에(문자열 안에서 반복문을 사용할수가 없음),문자열 배열을 사용하여 숫자값처럼 이용. 
		
				
			//	System.out.println(subject[0]+":"); //위에 문자열 배열(sbject)의 1번째 값을 소환.
			//	scores[0][0]=sc.nextInt();
		//2차배열을 활용해서 사용자에게 입력받은 갑 저장하는 방법
				for(int s = 0; s<4 ; s++) {; //1번 학생, 2번학생 ...반복 4번되는 값을 s로 둠.
					System.out.println((s+1) + "번 학생 점수---");
				for(int i=0; i<3 ; i++){
					System.out.println(subject[i]+":"); //subject 값이 0,1,2,scores값이 0,1,2 반복되기 때문에 반복문을 사용.
					scores[s][i]=sc.nextInt();
					
					//System.out.println(subject[1]+":"); //subject 값이 0,1,2,scores값이 0,1,2 반복.
					//		scores[0][1]=sc.nextInt();
	}
}
				
				//2차 배열에저장된 값을 출력.
				System.out.println("\t국어\t영어\t수학"); // \t문자 tab해서 출력
				for(int i=0;i<4;i++) { //4명의 학생 반복 출력
					System.out.println(i+1+"번 : ");
						for(int s=0;s<3;s++) { //각 요소=과목별 점수 3번 반복 출력
							System.out.print("\t");
							System.out.print(scores[i][s]);
							
					
						}
						System.out.println(); 
				
				}
				
}
	

	
}