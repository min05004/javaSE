package section04;
/*
 * 2. switch ~ case 문
 *  주어진 변수 값에 따라 여러개 case로 분기 실행 명령어.
 *  (조건식이 아니라 값에 따라 바뀌는게 차이)
 * 
 * 
 */
public class Conditional04 {
	public static void main(String[] args) {
		char key = 'w';
		
		switch(key) {
		//switch (변수,값) 넣어서 선언. 직관적으로 표현하기에는 좋음.
		case 'w' :
			System.out.println("앞으로 이동");
			break;      // 쓰지 않으면 아래 명령어도 같이 실행.
		case 'a':
			System.out.println("좌측으로 이동");
			break;
		case 'd' :
			System.out.println("우측으로 이동");
			default:
				System.out.println("Hold!");
			break;
			
		}
	}

}
