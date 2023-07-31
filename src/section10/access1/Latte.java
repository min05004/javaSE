package section10.access1;

public class Latte {
	/*
	 * 속성
	 * name
	 * isCold(핫/false 디폴트)
	 * brand
	 * price
	 */
	public String name;
	public boolean isCold;
	public String brand;
	public int price;
	
	
	public void getInfo() {
		System.out.println("name: " + name);
		System.out.println("ICE: " + isCold);
		System.out.println("brand: " + brand);
		System.out.println("price: " + price);
	}
	
}
