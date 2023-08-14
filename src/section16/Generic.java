package section16;
/*
 * 제네릭 Generic
 *  코드의 재사용성과 타입 안정성을 높이기 위해 도입된 기능.
 *  클래스나 메서드를 일반적인 타입 대신에 실제 타입으로 지정할 수 있게 한다.
 *  
 * 1.잘못된 타입의 값이 들어오는 것을 방지할 수 있다.
 * 2.강제 형변환(cast)필요없이 사용이 가능하다.
 * 
 */



public class Generic {
	public static <MyCalss> void main(String[] args) {
		MyClass<String> mc1 = new MyClass<String>();
		//호출시 <안에 타입을 설정해주면 됨>
		mc1.setData("Hello, Generic");
		String data = mc1.getData();
		System.out.println(data);
		
		MyClass mc2 = new MyClass<>(); //정의를 따로 하지 않으면 object로 자동설정.
		mc2.setData("Nice too meet you");
		
		String data2= (String) mc2.getData();	
		System.out.println(data2);
	}

}
