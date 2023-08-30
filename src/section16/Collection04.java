package section16;
/*
 * Map
 *  Map 인터페이스는 키-값 쌍으로 저장하는 자료구조 이다.
 *  키는 중복을 허용하지 않는다.
 *  
 * 
 * 
 */

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Collection04 {
	public static void main(String[] args) {
		
		Map< String, Integer> map = new HashMap<String, Integer>();
		//데이터 저장하기
		map.put("Alice", 95);
		map.put("Bob", 82);
		map.put("David", 91);
		map.put("Son", 100);
		
		//map 값 가져오기 : 키값을 통해서 가지고 올 수 있음.
		
		int score = map.get("Alice");
		System.out.println("Alice Score: " + score);

		//특정 키의 존재여부 확인
		if(map.containsKey("Son")) {
			System.out.println("Som score : " + map.get("Son"));
		
		
		}
 
		//key 값이 어떤게 있는지 모를 경우, set으로 받을경우
		
		Set<String>keys = map.keySet();
		//반복문으로 출력
		Iterator<String> it = keys.iterator();
		while(it.hasNext()) {
			String name = it.next();
			System.out.print("name : "+ name+ ",");
			System.out.println("score : " +map.get(name));
			
		}
		System.out.println("==================================");
		
		//entrySet() 메서드를 사용하여 키 - 값 쌍으로 가져오기
		Set<Map.Entry<String, Integer>> entries = map.entrySet();
		for(Map.Entry<String, Integer> entry : entries) {
			System.out.print("Name : "+ entry.getKey()+ " ,");
			System.out.println("Score : "+ entry.getValue());
		}
		
		
		System.out.println("map 길이 : " + map.size());
		
		//키 값을 통해 특정 데이터 삭제
		map.remove("Bob");
		
		
		//데이터 삭제
		map.clear();
		//맵이 비어있는지 확인.
		if(map.isEmpty()) {
			System.out.println("Map is Empty!");
		
			
		}
	}

}
