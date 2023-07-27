package section06;

public class Array_self {
	public static void main(String[] args) {
		int scores[] =  new int[3];
		//반복문과 같이 쓰는 연습
		
		scores[0] = 100;
		scores[1] = 80;
		scores[2] = 70;
		
		System.out.println("1번째 학생의 점수 :" + scores[0]);
		System.out.println("2번째 학생의 점수 :" + scores[1]);
		System.out.println("3번째 학생의 점수 :" + scores[2]);
		
		//for문 사용 - n번째 학생 + n-1 반복을 확인.
		for(int i = 0; i < 3; i++ ) {
			System.out.println(i + 1+"번째 학생의 점수"+scores[i]);
		
		}
		/*
		 * 
		 * 
		 * 
		 */
	}
	

}
