package section13.access1;

public class MyUtil {
	public String  str1 = " 일반 멤버 변수 ";
	public static  String str2 = " 정적 멤버 변수 ";
	
	public class HelloPrinter{
		public void printHello() {
			System.out.println("인스턴스 내부 클래스 HelloPrinter 입니다.");
			//str1,str2 둘다 접근이 가능.
			
		}
	}

	public static class Calculater {
		public void calc(int a,int b) {
			System.out.println("전달 받은 두 정수의 합 :" + (a+b));
			//System.out.println(str1); static에 올라있지 않아서 컴파일 에러가 남.
			
			System.out.println(str2);
			
			
		
		}
		
	}
}
