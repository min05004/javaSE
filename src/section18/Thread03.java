package section18;

import section18.access1.CountThread;

public class Thread03 {
	public static void main(String[] args) {
		System.out.println("메인 스레드 시작");
		
	CountThread ct = new CountThread();
	ct.setName("CountThread"); // 스레드 이름을 지정.
	ct.start();
	
	for(int i =0;i <10; i++) {
		System.out.print(Thread.currentThread().getName()+"-"); //어떤 스레드가 출력되고 있는지 확인이 가능.
		System.out.println(i*100);
		
		
	
		try {
			Thread.sleep(500);
			
		} catch (Exception e) {
		}
	}
		
		
		System.out.println("메인 스레드 종료");
	}

}
