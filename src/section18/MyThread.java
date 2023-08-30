package section18;

public class MyThread extends Thread{
	
	@Override
	public void run() {
		System.out.println("MyThred 시작");
		
		try {
			Thread.sleep(2000); //밀리세컨즈 값 "2초 동안 멈춰라" 
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		//예외처리 Thread.sleep
		
		System.out.println("MyThred 종료");
	}

}
