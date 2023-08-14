package section16;

public class MyClass <T> {
	//<T> 타입 매개변수  : 타입을 유동적으로 정해줄수 있음.
	private T data;
	
	public T getData() {
		return data;
		
	}

	public void setData(T data) {
		this.data = data;
	}

	
}
