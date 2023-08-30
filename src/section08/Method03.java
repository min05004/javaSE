package section08;

public class Method03 {
	public static void main(String[] args) {
		
		int result = add(10,5); //15라는 값이 result에 대입.
		System.out.println("result: " + result);
	
		
		
		
	}
	//7. 인자,리턴 값 있음.->인자값을 받아 실행(연산)한 후 반환값을 준다.
	
	public static int add(int a, int b) {
		return a+b;
		
	}
	// 오버로딩
	public static int add(int a,int b,int c) {
		int result = a+b+c;
		return result;
	}
	}


