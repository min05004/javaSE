package section15;
/*
 * StringBuffer
 * 문자열을 동적으로 다루기 위한 클래스
 * Thread Safe (o)  
 * 
 * StringBuilder
 * 문자열을 동적으로 다루기 위한 클래스
 * Thread Safe (X)
 * 
 */



public class JavaLang04 {
	public static void main(String[] args) {
		
		StringBuffer sb = new StringBuffer(); // String 변수
		sb.append("abc");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		sb.append("def");
		System.out.println(sb);
		System.out.println(System.identityHashCode(sb));
		
		
		
		StringBuilder sB = new StringBuilder();
		sB.append("안녕하세요");
		System.out.println(System.identityHashCode(sB));
		sB.append("Hello Java");
		System.out.println(System.identityHashCode(sB));
		
		System.out.println(sB);
		
	}

}
