package section16;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/*
 * List
 * 컬렉션 프레임웍 중 하나 인터페이스로 순서가 있는 데이터 모음을 다루는 객체.
 *  선형 배열 객체 
 *  가변 배열 객체
 *  인덱스 값이 있다.
 *  
 * 
 */

public class Collection02 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		// 데이터 저장하기 가변 - 추가 삭제 가능.
		list.add("피카츄");  //인덱스 번호 0
		list.add("파이리");  
		list.add("꼬부기");
		list.add("버터플");
		list.add("야도란");
		list.add("피존투");
		list.add("또가스"); // 인덱스 번호 6
		
		// 저장된 데이터 특정 인덱스 값으로 얻어오기
		String pokemon = list.get(6);
		System.out.println("list 6인덱스 값 : " + pokemon); // 0부터 시작
		
		// 저장된 제이터 특정 인덱스 값으로 삭제
		list.remove(1); 
		
		System.out.println("저장된 데이터 개수 : " + list.size());
		System.out.println("1번 인덱스 값 : " + list.get(1));
		
		//리스트 전체 출력
		//배열처럼 출력하면 됨...list.get(i) 사용
		for(int i =0 ; i< list.size(); i++) {
			System.out.println("list ["+i+"]" + list.get(i));
		}
		
		System.out.println("================================");
		
		//특정 인덱스에 데이터 삽입.
		list.add(4,"잠만보");		
		
		//향상된 for문 ,확장  for문
		for(String name : list) {
			System.out.println("name: " + name);
		}
		
	
		// 얕은 복사 
		ArrayList list2 = (ArrayList) list;
		
		//깊은 복사
		List<String>list3 = (List<String>) list2.clone();
		
		System.out.println("=============list3==============");
		//list2가 가지고 있는 객체 값 복사 -> 하지만 주소값이 다른 객체.
				for(String name : list3) {
					System.out.println("name: " + name);
		}
				System.out.println("===========================");
				//데이터 삽입 삭제가 자주 일어난다면 linkedList 가 더 빠르다.
		List<String> linkedList = new LinkedList<String>();

		linkedList.add("메타몽");
		linkedList.add("이브이");

		for(String name : linkedList) {
			System.out.println("linkedList :" + name);
		}
		
		
		/*
		 * Vector
		 * 선형 배열 객체
		 * ArrayList와 동일
		 * Thread Safe - 멀티일 경우 안전성 보장. 
		 * 
		 */
	
		Vector<String>vec = new Vector<String>();
	
		vec.add("안준호");
		vec.add("한호혈");
		vec.add("조석봉");
		System.out.println("=============vec==============");
		System.out.println("size : "+ vec.size());
		System.out.println("1번 인덱스 : " + vec.get(1));
		
}
}
