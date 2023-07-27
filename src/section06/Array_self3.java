package section06;

//랜덤으로 숫자를 돌려주는 메서드
//import java.util.Random;   // 패키지 안에 클래스가 있음- java.util안에 들어있는 Random 클래스 이라는 말.
//import java.util.Scanner;
//사용자에게 입력 받을 수 있는 메서드
import java.util.*; //java.util 패키지에 있는 모든 클래스 import해 라는 뜻임.위에 준비조건을 하나로 합침.


public class Array_self3 {
	public static void main(String[] args) {
		/*
		 * 로또 프로그램 만들기
		 * 1등부터 5등까지 존재
		 * 45개 숫자 중에 6개의 숫자 맞추기.
		 * 
		 * 1.6개의 랜덤 숫자와 보너스 점수를 로또 배열에 저장.
		 *
		 * 2.사용자에게 1-45까지의 6개의 숫자를 입력받아 배열에 저장.
		 * 사용자에게 보너스 점수를 입력 받는다.
		 * 
		 * 3.사용자가 입력한 값과 로또 배열에 있는 값을 비교하여 값의 개수를 count 한다
		 * 4.몇개의 숫자를 맞췄는지 조건에 따라 등수 출력
		 * 
		 * 
		 */
		
		Scanner sc = new Scanner(System.in); // 필요한 라이브러리 준비 - 사용자에게 입력받기
		Random random = new Random(); // 랜덤의 숫자값 가지고 오기
		
				int lottoar[]=new int[6];//6개의 로또번호 저장
				int userar[] =new int[6]; //사용자한테 6개의 숫자 입력받을꺼야.
				
				int bonus; //랜덤으로 보너스 번호
				int bonususer; // 사용자가 입력한 보너스 번호
				int count =0;//0부터 시작하도록 초기화값 입력.
				
				//알고리즘 대로 코드 구현하기 - 6개의 랜덤 숫자와 보너스 점수를 로또배열에 저장.
				
				for(int i = 0; i<6 ;i++)// 6번 반복.로또 배열 6개의 랜덤값을 저장.
				lottoar[i]=random.nextInt(45)+1; //random.nextInt(45)- 0~44 까지여서 +1을 해줘서 1~45까지로 설정
				//보너스 값
				bonus = random.nextInt(45)+1;
				
				
				System.out.println ("로또 당첨번호"+ Arrays.toString(lottoar) + "보너스번호"+ bonus);
				//Arrays.toString(lottoar)배열의 요소 값을 출력해줌./ 로또 당첨번호,보너스 번호를 출력
				
				
				// 사용자에게 6개의 값을 입력받기
				System.out.println("숫자 6개를 입력하시오");
				for(int i=0; i<6; i++) {
					userar[i]=sc.nextInt(); 
				}
				System.out.println("보너스 번호를 입력하시오");
				bonususer=sc.nextInt();
				
				//로또 배열의 값과 사용자 배열의값 중 같은 값이 몇개 있는지 카운팅.
				//랜덤 배열된 숫자 6개중 1개를 사용자가 입력한 숫자들과 하나씩 대조해보는것을 반복함.
				
				for(int j =0; j>5; j++) { //로또번호 첫번째~5번째 까지
					for(int i= 0; i< 6;i++) { //6번 반복
						if(lottoar[j] == userar[i]) { //로또번호 첫번째와 유저가 입력한 i번째랑 값이 같은게 있다면 카운팅을 반복.
							
							count++;//count를 반복
					}
				}
				
				/*  for(int i= 0; i< 6;i++) { //6번 반복
					if(lottoar[1] == userar[i]) { // 위에 반복문 계속 반복 됨/ 해당 두번째. /그렇기 때문에 이중for문 사용.
				*/
		}

				
				//count 개수에 따라 등수를 정하기.
				if(count==6) { //count개수가 6개 이면
				System.out.println("1 등입니다.");
				}
				else if(count==5) { 
					if(bonus==bonususer) { //count개수가 5개, 보너스 번호가 맞다면 
						System.out.println("2 등입니다.");
					}else {
						System.out.println("3 등 입니다."); //보너스 점수가 같지 않다면.
					
					}
				}
					else if(count==4) {
						System.out.println("4등 입니다.");
					}
					else if(count==3) {
						System.out.println("5등 입니다.");
				}

}
}