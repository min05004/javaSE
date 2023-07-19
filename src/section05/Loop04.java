package section05;
/*
 * 중첩 for문
 * for문 안에 for문
 * 
 * 예문 ) 
 * i =
 */
public class Loop04 {
	public static void main(String[] args) {
		/*예문에서
		 * i 는 줄이라고 생각.
		 * j 가 첫줄은 0 이여서 * 한번
		 * j 가 두번째 줄은 0,1 이여서 ** 두번
		 * 
		 */
		for(int i = 0; i < 7; i++) { // 7번 반복.
			for(int j =0; j < i+1 ; j++) { // if문도 이중if문 사용가능.
			System.out.print("*"); //줄 바꿈 안함.
			
		}
			System.out.println(); //행 바꿈
		}
	}
}
