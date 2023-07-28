package section08;
/*
 * 
 * VO (Value Object) , DTO
 * 값 오브젝트로써 목적에 맞는 변수의 집합.
 * Database 또는 네트워크 통신 값 운반용으로 사용.
 * 
 * strName : 타입+이름(낙타 표기법)
 * str_Name : 스네이크 표기법
 *
 * 캡슐화(정보은닉) - 객체의 속성과 행위를 하나로 묶고 
 * 외부로부터 내부를 감싸 숨겨 은닉한다.
 * 
 */

public class Method05 {
	public static void main(String[] args) {
		MemberVO memberVO = new MemberVO();
		
		memberVO.setId("025");
		memberVO.setName("피카추");
		memberVO.setAge("29");
		
		String id =memberVO.getId();
		String name = memberVO.getName();
		String age = memberVO.getAge();
		
		
		System.out.println("id: "+id);
		System.out.println("name: "+name);
		System.out.println("age: "+age);
		
	// System.out.println("id: "+ memberVO.id);
		
	}

}
