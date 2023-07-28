package section08;


public class MemberVO {
	//private 은 현재 코드 안에서만 접근이 가능함.외부에선 접근이 어려움.
	private String id;
	private String password;
	private String name;
	private String mobile;
	private String email;
	private String age;
	private String address;
	
	// public 은 다른 패키지에서도 변수 호출이 가능함.
	// get은 반환,set은 입력, is는 ㅠㅣㅐㅐ
	public String getId() { //id에 접근하기 위해서는 getId로 접근해야함.
		return id;
	}
	public void setId(String id) {
		this.id = id; // 전역변수 = 지역변수
		//this 자기자신을 참조하는 연산자 (자기자신의 주소값)
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMobile() {
		
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	
	
	

}
