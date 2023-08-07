package section13;
/*
 * 내부 클래스(inner class)
 *  내부클래스는 클래스 안에 만들어진 또 다른 클래스(중첩 클래스)이다.
 *  외부클래스와 밀접한 관계를 가진다.
 * 
 *  정적(static) 내부클래스 선언
 *  Outer.Inner in = new Outer.Inner();
 *  외부 클래스 생성없이 바로 접근 가능.
 * 
 */
public class OuterClass01 {
	public static void main(String[] args) {
		OuterClass01.InnerClass.info(); //객체 생성 없이 외부 클래스를 통해 접근할 수 있다.
		
		InnerClass.info(); // 같은 클래스 안에선 바로 접근이 가능
	
	}
	//정적 클래스 - 외부클래스의 클래스 변수와 같이 static 키워드 부여
  static class InnerClass{ // static 객체 생성 안해도됨. - 외부 클래스를 통해서 접근이 가능
	public static void info() {
		System.out.println("static 내부 클래스 입니다.");
	}
 }

}
