package section07;
/*
 * 변수(variable)
 * 데이터를 저장하고 참조하는데 사용되는 메모리 공간을 말한다.
 * 
 * 변수 선언 및 초기화
 * 자료형(type) 변수명 = 값, 참조클래스;
 * 
 * 1. 타입에 따른 변수
 * 		기본형 - 예약어,소문자 시작,직접 값을 저장하고 있다.
 * 			8가지 - char, int, byte, double, boolean, float, short, long
 * 			
 * 		참조형 - 기본형 외 나머지 전부, 참조(주소값)을 가지고 있다.
 * 				보통은 대문자로 시작(누군가 class로 만들어놓은 것)
 * 				 
 * 			ex)String
 * 
 * 2. 선언 위치에 따른 변수
 * 		전역변수 - 클래스 안에 선언된 변수(멤버 변수)
 * 				초기화 하지 않으면 default 값이 들어간다.
 * 				boolean - false
 * 				정수형 - 0
 * 				실수형 - 0.0
 * 				참조형 - null
 * 
 * 		지역변수 - 메소드 또는 생성자 안에 선언된 변수
 * 				반드시 초기화를 해야한다.(컴파일 에러발생함.)
 * 				메소드 종료 시 같이 소멸. 매개변수도 지역변수 이다.
 * 
 * 3. 정적(static) / 동적(일반) 변수
 * 		정적 -  stactic 예약어로 선언
 * 			모든 객체가 공유한다.
 * 			클래스 명으로 접근가능.
 * 			객체 생성 없이 불러올 수 있다.
 * 		동적 - static 이 아닌 일반 멤버변수
 * 
 * 
 * 
 */


public class Var01 {
	
	static int globalVar =10; 
	static double globalVar2 =3.14;
	static int globalVar3;
	static boolean globalVar4;
	static String globalVar5; // 값을 넣지 않았을 경우 ,default 값이 들어간다.
	
	//전역 변수 (클래스 내부에 선언된 변수)
	public static void main(String[] args) {
	//System.out.println("main()메서드 내에서 localTest()"+ "지역변수 호출:" + localVar); -메서드 안에 있지않아서	
		
		
		System.out.println("main()메서드 내에서 전역변수 호출: " + globalVar);
		System.out.println("globalVar2: "+ globalVar2);
		System.out.println("golbalVar2: "+ globalVar2);
		System.out.println("golbalVar3: "+ globalVar3);
		System.out.println("golbalVar4: "+ globalVar4);
		System.out.println("golbalVar5: "+ globalVar5);
		
		int globalVar = 20; // 전역변수와 같은 명일때 전역변수로 인식.
		System.out.println("globalVar: " + globalVar);
		System.out.println("this 연산자를 이용한 전역변수 접근: " + Var01.globalVar);
	}

	public static void locaTest() {
		//지역 변수 메서드 블록 내 선언 , 메서드가 끝남과 동시에 사라짐.
		int localVar = 20;
		System.out.println("전역 변수를 메서드 내에서 사용: " + globalVar);
		System.out.println("블록 내 지역 변수 값: "+localVar);
		
		
		
		
	}
	}
	

