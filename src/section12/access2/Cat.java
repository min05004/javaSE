package section12.access2;

public interface Cat {
	//인터페이스는 메서드 선언부만 존재 .추상메서드 abstract 생략가능.
	public int PAW =4; //변수이지만 인터페이스에서 선언하면 상수.abstract 생략가능.sta
	
	public void eat();

	public void sleep();
	
	public void hunt();

	void play();
	

}
