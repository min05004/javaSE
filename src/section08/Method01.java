package section08;
/*
 * Method 메서드
 * 	프로그래밍에서 메서드는 하나의 특별한 목적의 작업을 수행.
 * 	설계된 프로그램 코드 집합.
 * 	객체의 기능 역할을 한다.
 * 
 * 메서드 구조
 * 	 (접근제한자)(stactic)반환타입 메서드이름(매개변수 타입 매개변수명) {
 * 		실행할 코드(명령문 집합)
 * 			
 * 		(return 반환값;)
 * 		}
 * 
 * 오버로딩(overloading)**매우중요** 
 * 클래스 내에서 같은 이름을 가진 매서드를 여러개 정의하는 것을 말한다.
 * 매개변수 또는 타입이 다르면 선언 가능
 * 
 */



public class Method01 {
	public static void main(String[] args) {
		//static으로 되어 있으면 변수 생성 안하고도 호출이 가능.
		
		hello(); //hello()메서드 호출 (call a method)
		printName("도라에몽");
		printPokeMon("025","피카츄",29);
		printPokeMon("025","피카츄","전기");
		//4번 오버로딩의 경우 : 같은 기능 호출을 하지만,수단이 달라질 때 사용가능.
		
		String[] pokemons = {"피카츄", "라이츄", "파이리", "꼬부기"};
		printPokeMon(pokemons);
		
		
		
	}
	//1.인자값(매개변수),리턴없음. -> 호출 시 실행하고 끝나는 메서드라는 뜻.
	//            void : 반환값이 없다 라는 뜻 
	public static void hello() {
			System.out.println("hello World");
	}
	//2. 인자(매개변수) 있음, 리턴은 없음.(해당 타입에 맞는 변수를 넣어야 호출이 됨.String 이기 때문에 문자열)
	public static void printName(String name) { // String name = "도라에몽";
		System.out.println("이름: "+name);
	}
	//3. 인자 값이 여러개인 타입(,로 추가해주면 됨).리턴은 없음.
	public static void printPokeMon(String id, String name, int age) {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + age);
	
	}		
		
	//4. 오버로딩(over loading)메서드 : 매개변수 타입이나,개수 등 이 다르면 같은
	public static void printPokeMon(String id, String name, String type) {
		System.out.println("ID: " + id);
		System.out.println("Name: " + name);
		System.out.println("Age: " + type);
	}
	
	//
	public static void printPokeMon(String[] mons) { // string...mons와 값이 같음
	/*
		for (String mon : mons) {
			System.out.println(mon);
		}
	*/
		
		for(int i =0; i < mons.length; i++) {
			String mon = mons[i];
			System.out.println(mon);
	}
	
	
}
}
	
	