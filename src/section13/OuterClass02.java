package section13;
/*내부 클래스 컴파일
 * 
 * Outer
 * 내부 클래스도 외부 클래스 안에 생성되는 것 외에도 별도에 클래스 이기에
 * 컴파일시 별도로 생성 된다.
 * 
 */
public class OuterClass02 {
	public static void main(String[] args) {
		
	new	OuterClass02.InnerClass().info(); //객체 생성이 필요함
	OuterClass02.InnerClass inner = new OuterClass02.InnerClass();
	inner.info();
	
	}
	
	static class InnerClass{
		
		public static void staticInfo() {
			System.out.println("static 메서드 입니다."); // 
		}
		public void info() {
			System.out.println("static 내부클래스의 일반 메서드 입니다.");
		}
	}

		
	}
