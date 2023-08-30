package section18;
/*
 * Thread 스레드 - 메인메서드도 스레드 일종.
 * 스레드는 프로그램 내에서 실행되는 프로그램 제어 흐름(실행단위)을 말한다.
 * 하나의 프로세스 내부에서 독립적으로 실행되는 하나의 작업단위
 * 
 * 병렬 프로그래밍 - 메인메서드가 여러개 있는 경우 동시에 작업이 가능.  스택영역이 여러개 생김.
 * 비동기 프로그래밍 - 동시다발적으로 움직이게 가능.
 * 
 * 스레드 실행방법
 * 1. Thread 클래스 상속
 * 2. run 메서드 오버라이딩 구현
 * 3. 1번 Thread 상속받은 클래스 생성
 * 4. start() 메서드 호출로 실행
 * 
 */


public class Thread01 {
	public static void main(String[] args) {
	System.out.println("메인 스레드 시작");
	
	MyThread th1 = new MyThread();
	th1.start(); //start로 시작을 해야 메인메서드와 상관없이 따로 실행 가능. //run은 그냥 호출
	//th1.run();
	
	
	
	System.out.println("메인 스레드 종료");
		
	}

}
