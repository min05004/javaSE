package section12;

import section12.access3.BluthoothMIC;
import section12.access3.Microphone;
import section12.access3.Speaker;
import section12.access3.TJmic;

/*
 * 인터페이스 상속
 *  인터페이스 끼리 상속관계를 만들 수 있다.
 *  클래스 상속과 마찬가지로 extends 키워드 사용한다.
 *  다중 상속이 가능하다. ( , )사용
 *  
 * 
 */
public class InterfaceClass02 {
	public static void main(String[] args) {
		System.out.println("---- TJmic 객체 ----");
		TJmic tj = new TJmic();
		tj.connect();
		tj.music();
		tj.sing();
		
		System.out.println("---- BluethoothMIC 로 변환 ----");
		BluthoothMIC bm =tj;
		bm.connect();
		bm.music();
		bm.sing();
		
		System.out.println("---- Microphone ----");
		Microphone m = tj;
		// m.connect(); 
		//컴파일 오류가남 해당 
		m.sing();
		
		
		System.out.println("----Spesker----");
		Speaker s =tj;
		s.music();
		// s.sing();
		
	}

}
