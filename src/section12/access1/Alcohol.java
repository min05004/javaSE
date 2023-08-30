package section12.access1;

public abstract class Alcohol {
	//속성 값
	public int proof;
	public int price;
	public String name;
	
	protected String taste;
	
	//구현되지 않은 추상메서드
	public abstract void setTaste(String taste);
	
	public void getInfo() {
		System.out.println("name :"+ name);
		System.out.println("proof :"+ proof);
		System.out.println("price :"+ price);
		System.out.println("taste :"+ taste);
	}

}
