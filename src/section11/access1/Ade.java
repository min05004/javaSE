package section11.access1;

import section11.access2.Drink;

public class Ade extends Drink {
	private boolean isZero;
	
	public Ade() {
		name = "코카콜라 제로";
		volume = "355ml";
		type = "Ade";
		price = 2000;
		discountRate = 0.333;
		isZero = true;
		
			
				
	}
	
	public void getInfo() {
		super.getInfo();
		System.out.println("iszero: "+ isZero);
	}
	public boolean isZero() {
		return isZero;
	}

	public void setZero(boolean isZero) {
		this.isZero = isZero;
	}

}


