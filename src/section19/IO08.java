package section19;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

import section19.access1.PokemonVO;

/*
 * 객체직열화
 * ObjectInputStream /ObjectOutStream
 * 
 *객체를 바이트 스트림으로 읽고 쓰는 클래스
 *Serializable 
 *직렬화 하기 위한 인터페이스, 객체를 일련의 바이트로 변환하는것
 * 
 * 
 * 
 */
public class IO08 {
	public static void main(String[] args) {
		
		PokemonVO pokemon = new PokemonVO();
		
		pokemon.setName("025");
		pokemon.setNo("피카츄");
		pokemon.setType("번개");
		
		String filepath = "./upload/pokemon.obj";
		try (
			FileOutputStream fos = new FileOutputStream(filepath);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			) {
			
				oos.writeObject(pokemon);
				System.out.println("객체를 pokemon.obj 파일로 백업");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}


