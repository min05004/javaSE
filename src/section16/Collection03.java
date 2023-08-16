package section16;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/*
 * Set 
 *  순서가 없는 컬렉션 프레임웍.
 *  중복을 허용하지 않는다.
 * 
 * 
 * 반복자(Iterator)  - 컬렉션에는 다 들어가 있음.
 *  자바 컬렉션 프레임웍에서 컬렉션에 저장된 요소를 읽어오는데 사용하는 인터페이스.
 *  
 * 
 * 
 */
public class Collection03 {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		set.add("피카츄");
		set.add("라이츄");
		set.add("파이리");
		set.add("꼬부기");
		
		//중복값 허용하지 않음.
		boolean isAdd = set.add("피카츄"); // 중복값이 있어서 추가가 안됨.false 나옴.
		System.out.println("isAdd : " + isAdd);
		
		// 데이터 사이즈
		System.out.println("size : " + set.size());
		
		//출력
		for(String name : set) {
			System.out.println(name);
		}
		
		//
		System.out.println("==========iterator=============");
		
		Iterator<String> it = set.iterator(); 
		while(it.hasNext()) { //hasNext - 커서 역할 ,다음요소가 있는지 확인하여 논리값 반환.
          String name = it.next(); //next() - 해당 요소 반환.
          System.out.println("name : " + name);
			
		}
		
	}

}
