package section10;
/*
 * final 클래스
 *  클래스 앞에 final 키워드 추가할 경우,  클래스 상속의 마지막임을 뜻한다.
 *  
 *  
 *  final 메서드
 *    메서드에 final  선언하면 해당 메서드는 하위클래스에서 오버라이딩 할 수 없다.
 *    
 */

import section10.aceess4.Jindo;

public class ExtendsClass04 {
	
	public static void main(String[] args) {
		Jindo jindo = new Jindo();
		
		jindo.name = "백구";
		
		jindo.bark();
	}
}