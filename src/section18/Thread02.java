package section18;

import section18.access1.CountThread;

public class Thread02 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작!");

	CountThread ct = new CountThread();
	ct.start(); 
	
		
		System.out.println("메인 스레드 종료!");
	}

}
