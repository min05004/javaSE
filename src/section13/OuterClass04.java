package section13;
/*
 * 지역 내부 클래스
 *  지역내부클래스는 메서드 내에서 선언되어 사용되는 클래스이다.
 *   매서드 내에서만 사용가능.
 *   메서드 종료시 클래스도 사용 종료.
 *   
 * 
 */
public class OuterClass04 {
	 private int speed = 10;
	 
	 public void getUnit(String uniName) {
		 
		 class Unit{
			 public void move() {
				 System.out.println(uniName + " 이"+ speed +"속도로 이동합니다.");
			 }
	
		 }
		 Unit unit = new Unit();
		 unit.move();
	}
	 public static void main(String[] args) {
			OuterClass04 outer = new OuterClass04();
			outer.getUnit("마린");
		
	}

}
