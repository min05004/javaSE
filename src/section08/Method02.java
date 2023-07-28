package section08;

public class Method02 {
	public static void main(String[] args) {
		
		String name = getName(); //string에 들어있는 변수 선언 
		System.out.println("name: " + name);
		
		System.out.println("getName():"+ getName()); //바로 선언
	}

	
	//6.인자 값 없고 리턴만 있음-> 메서드 실행하여 값 반환.
	public static String getName() {
		String name = "피카츄";
		
		return name;
	}
}
