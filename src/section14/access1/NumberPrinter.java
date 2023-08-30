package section14.access1;

public class NumberPrinter {
	
	public void printNumber() throws InterruptedException { //printNumber() 호출 시 실행해라 라고 미룰 수 있음.
		
		for(int i =0; i<10; i++) {
			System.out.println(i);
		
			Thread.sleep(1000); // 예외처리를 여기서 할 필요는 없을 경우 :  throws InterruptedException
		}
		
	}

}
