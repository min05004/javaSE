package section18.access3;

public class InterThread implements Runnable {

	@Override
	public void run() {

		System.out.println("InterThred 시작");
		
		try {

			Thread.sleep(2000);
		} catch (Exception e) {
		}
		
		System.out.println("InterThred 종료");
	}
	

}
