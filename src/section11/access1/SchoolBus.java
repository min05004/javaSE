package section11.access1;

public class SchoolBus extends Bus {
	
	public SchoolBus() {
		type ="스쿨버스";
		color = "노랑";
		
	}
	public void drive() { 
		System.out.println("학생 태우고 운행");
	}
	
	public void stopPannel() {
		System.out.println("정지 판넬 가동");
	}
}
