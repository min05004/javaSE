package section10.access3;
import section10.access2.Car;

public class SportsCar extends Car {
	public boolean isOpen;
	
	public void getInfo() {
		System.out.println("model: " + model);
		//상속관계 접근가능.
		System.out.println("color: " + color);
	//	System.out.println("Year: " + year);
	//	System.out.println("Brand: " + brand);
	}
	}
	
