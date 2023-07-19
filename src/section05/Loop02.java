package section05;
/*
 * 2.do~ while 문
 * 	while 문과 비슷하지만, 최소 한번 실행된다.
 * 
 * do {
 * 
 * } while (조건식);
 * 
 * 
 */
public class Loop02 {
	public static void main(String[] args) {
		int count = 0;
		do {
			System.out.println(count);
			count++;
			// 조건식이 맞지 않아도 한번은 실행됨.한번 실행 하고 조건이 실행.
		} while ( count < 100);
	}

}
