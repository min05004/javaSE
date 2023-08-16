package section16;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 
 no name  mobile        addr 
 1  홍길동  01011112222   서울시
 2  짱구   01022223333   떡잎마을
 3  둘리   01044445555   쌍문동                                  
 4 도라에몽  01055556666   오징어도시
 
 list 화-Map 
 
 
 */

public class Collection05 {
	public static void main(String[] args) {
	List<Map<String, Object>> memberList = new ArrayList<>();
	Map<String, Object>member1 = new HashMap<String, Object>();
	Map<String, Object>member2 = new HashMap<String, Object>();
	Map<String, Object>member3 = new HashMap<String, Object>();
	Map<String, Object>member4 = new HashMap<String, Object>();
	
	member1.put("no", 1);
	member1.put("name", "홍길동");
	member1.put("mobile", "01011112222");
	member1.put("addr", "서울시");
	
	member2.put("no", 2);
	member2.put("name", "짱구");
	member2.put("mobile", "010222233333");
	member2.put("addr", "떡잎마을");
	
	member3.put("no", 3);
	member3.put("name", "둘리");
	member3.put("mobile", "01044445555");
	member3.put("addr", "서울시");
	
	member4.put("no", 4);
	member4.put("name", "도라에몽");
	member4.put("mobile", "01055556666");
	member4.put("addr", "오징어도시");
	
	
	memberList.add(member1);
	memberList.add(member2);
	memberList.add(member3);
	memberList.add(member4);
	
	System.out.println("no\tname\tmobile\t\taddr");
			for(Map<String,Object>member : memberList) {
				int no = (int) member.get("n  o");
				String name = (String) member.get("name");
				String mobile = (String) member.get("mobile");
				String addr = (String) member.get("addr");
				
				System.out.println(no+"\t"+name+"\t"+mobile+"\t"+addr);
			}
			
		
	}

}
