package section09;
/*
 *생성자(Constructor)
 * 객채를 생성할때 실행되는 반환값 없는 메서드
 * 객체 초기화 목적에 주로 사용한다.
 * 클래스 명과 동일하다.
 * 
 * 
 * 
 * 
 */


public class Constructor01 {
	public static void main(String[] args) {
		Book book1 = new Book();
		book1.title = "이방인";
		book1.price = 9000;
		book1.totalpage = 280;
		book1.autor ="알베르 카뮈"; //값을 넣어서 출력
				
		book1.getInfo();	
		System.out.println("==================");
		
		Book book2 = new Book(); //객체를 생성하고
		book2.getInfo(); //디폴트 값으로 나옴.
		
		
	
	}
	

}
