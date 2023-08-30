package section11.access1;

import section11.access2.Drink;

public class Coffee extends Drink {
	 private boolean isDecaf;
	
	public Coffee () {
		name = "황금라떼";
		volume = "450ml";
		type = "Coffee";
		price = 2400;
		discountRate = 0.5;
		isDecaf = false;
		
				
	}
	public void getInfo() {
		super.getInfo();
		System.out.println("isDecaf: " + isDecaf);
	}
	public boolean isDecaf() {
		return isDecaf;
		
	}
	public void setDecaf(boolean isDecaf) {
		this.isDecaf = isDecaf;

}
}