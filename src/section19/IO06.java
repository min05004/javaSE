package section19;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.FileWriter;

/*
 * FileReader /FileWirter
 * 
 * 문자 단위로 파일을 읽기/쓰기 기능을 제공하는 클래스
 * char 단위
 */
public class IO06 {
	public static void main(String[] args) {
		
		FileReader fr = null;
		BufferedReader br = null;
		
		FileWriter fw = null;
		BufferedWriter bw = null;
		
		try {
			
			fr = new FileReader("./upload/hello.txt");
			br = new BufferedReader(fr);
			
			fw = new FileWriter("./upload2/hello4.txt");
			bw = new BufferedWriter(fw);
			
			int readCharCnt = 0;
			char[]c = new char[4]; //4글자씩, 개행도 하나의 문자로 인식.
			
			while((readCharCnt = br.read(c)) != -1) {
				bw.write(c,0,readCharCnt);
			
				System.out.println(new String(c,0,readCharCnt)); //정말 문자로 파일이 복사되는지 출력확인.
			}
			System.out.println("문자단위 파일 복사 완료");
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			
				if(bw != null) bw.close();
				if(fw != null) fw.close();
				if(br != null) br.close();
				if(fr != null) fr.close();
				
				
			} catch (Exception e2) {
			}
			
		
			
		}
		
		
	}

}
