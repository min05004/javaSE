package section15;
/*
 * String 메서드
 * 
 * 
 * 
 */

public class JavaLang07 {
	public static void main(String[] args) {
		//문자열 길이 length
		String txt = "abcdefghk";
		System.out.println("length : " + txt.length());
		
		
		//문자열이 지정한 문자로 시작하는 지 판단.
		String str1 = "apple";
		boolean startWith = str1.startsWith("a");
		System.out.println("startWith: " + startWith);
		
		
		//문자열 마지막에 지정한 문자가 있는지 판단.
		String str2 = "text";
		boolean endWith = str2.endsWith("t");
		System.out.println("endsWith: " + endWith);
		
		
		//문자열 인덱스 번호 반환
		String str3 = "abcdef";
		int indexOf = str3.indexOf("d"); //해당 문자가 몇번째에 있는지.
		System.out.println("indexOf: "+ indexOf );
		
		
		// 문자열에 지정한 문자가 마지막 몇번째 있는지 int로 반환.
		String str4 = "AndroidApp";
		int lastIndexOf = str4.lastIndexOf("A"); 
		System.out.println("lasrIndexOf: "+ lastIndexOf);
		
		//문자 치환
		String str5 = "A*B*C*D";
		String replace = str5.replace("*", "-"); // *을 - 로 바꿔줌. 대신함.
		System.out.println("replace : "+ replace);
		
		
		//문자열 나누기 배열로 반환
		String str6 = "A:B:C:D:E:F:G:abcdefg";
		String[]splits = str6.split(":"); // 배열값으로 전환. 문자나 숫자 상관없이
		
		for(String split :
			splits ) {
			System.out.println(split);
			
		//문자열 절삭
		String str7 = "ABCDEF";
		String substring = str7.substring(0,2); // 0번부터 2번 전까지
		System.out.println("substring: " + substring);
		
		/*
		 * String str7 = "ABCDEF";
		  String substring = str7.substring(str7.indexOf("C"),str7.indexOf("F")); // C번부터 E번까지
		  System.out.println("substring: " + substring);
		 * 
		 */
		
		//소문자 변환
		String str8 = "abcDEF";
		String toLowerCase = str8.toLowerCase();
		System.out.println("toLoewrCase : " + toLowerCase);
		
		
		//대문자 변환
	   String str9 = "abcDEF";
	   String toUpperCase = str9.toUpperCase();
	   System.out.println("toUpperCase: " + toUpperCase);
			
	   //공백 제거
	   String str10 = "     java java java    ";  //앞뒤공백만 제거
	   String trim = str10.trim();
	   System.out.println("trim: " + trim);
	   
	   //공백 제거 2 
	   String str11 = "  java java java   ";
	   String replace2 = str11.replace(" ", "");// 공백을 " " -> ""없애는걸로 대체
	   System.out.println("replace: " + replace);
	   
	   
			
		}
		
		
	}

}
