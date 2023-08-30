package section19;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * 
 * InputStream / OutStream
 * 바이트 기반 입력과 출력을 다루는 추상 클래스.
 * 
 * FileInputStream
 *파일을 바이트 단위로 순차적으로 읽는 객체
 * 
 * FileOutputStream
 * 파일을 바이트 단위로 순차적으로 쓰는 객체
 * 
 * 
 * 
 */
public class IO04 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		FileOutputStream fos = null;

		try {
			
			// ./upload/hello.txt 파일읽을수 있는 객체 생성
			fis = new FileInputStream("./upload/hello.txt");

			// upload2 디렉토리생성
			
			File f1 = new File("./upload2");
			if (f1.mkdir()) {
				System.out.println("upload2 디렉토리가 생성되었습니다.");
			}
			
			// hello2.txt 파일생성 
			// 파일이 존재하지않으면 파일을 생성해줌.폴더는 생성 안함.
			File f2 = new File(f1, "hello2.txt");
			if (f2.createNewFile()) {
				System.out.println("hello2.txt 파일이 생성되었습니다.");
			}

			// hello2.txt 에 쓰기 준비 객체생성
			fos = new FileOutputStream(f2);

			int readByteCnt = 0;
			byte[] b = new byte[100]; //바이트 배열 : 크기가 크면 더 빨리 읽을 수 있음.
			
			while ((readByteCnt = fis.read(b)) != -1) { // -1 더이상 읽을것이 없을때 
				fos.write(b, 0, readByteCnt); // 쓰는거 -> 0부터 readByteCnt 크기까지 
                //while (readByteCnt != -1) {
				//readByteCnt =fis.read(b); 동일 
				
			}
			System.out.println("파일 복사 완료");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (fos != null) //메모리에 열려있는게 있으면 (fos 부터, 마지막에 쓴애 부터 닫아줌)
					fos.close();
				if (fis != null)
					fis.close();
			} catch (Exception e2) {
				e2.printStackTrace();
				
			}
		}

	}

}
