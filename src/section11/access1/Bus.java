package section11.access1;

public class Bus extends Car{
	public Bus() {
		type ="버스";
		color = " Green ";
	}
	

	public void drive() {
		System.out.println("승객을 태우고 운행을 합니다.");
	}
	
	public void bell() {
	System.out.println(" 벨을 누릅니다.");
}
}