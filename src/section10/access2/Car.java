package section10.access2;

public class Car {
	public String model;
	protected String color;
	int year;
	private String brand;
//ctrl+shif +x,y 대소문자
	public void getInfo() {
		System.out.println("model: " + model);
		System.out.println("color: " + color);
		System.out.println("Year: " + year);
		System.out.println("Brand: " + brand);
	}
	

}
