package section14;
/*
 * Exception종류
 * 
 * 1.checked Exception
 * 	예외 처리 하지않을 시 컴파일 에러 발생.
 * 
 * 2.unchecked Exception
 *  예외 처리를 하지 않아도 컴파일 에러 발생하지 않는다. 
 *
 * 
 */
public class ExceptionClass04 {
	public static void main(String[] args) {
		
		for(int i =0; i<10; i++){
			System.out.println(i);
			
			
			try {
				Thread.sleep(1000);// 1초 일시정지 (1000밀리세컨즈)
			
			} catch (InterruptedException e) { 
				e.printStackTrace();
			} 
			
		}
		
	}

}
