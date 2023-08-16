package section16;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Collection06 {
	public static void main(String[] args) {
		List<MemberVO>memberList = new ArrayList<MemberVO>();
		
		MemberVO member1 = new MemberVO();
		MemberVO member2 = new MemberVO();
		
		member1.setNo(1);
		member1.setName("홍길동");
		member1.setMobile("0101111");
		member1.setAddr("서울시");
	
		member2.setNo(2);
		member2.setName("짱구");
		member2.setMobile("0102222");
		member2.setAddr("떡잎마을");
		
		memberList.add(member1);
		memberList.add(member2);
	
		
		System.out.println("memberList size  : " + memberList.size());

		System.out.println("===========================================");
		
		System.out.println("no\tname\tmobile\taddr");
		for(MemberVO member : memberList) {
			
			int no = (int) member.getNo();
			String name = member.getName();
			String mobile = member.getMobile();
			String addr = member.getAddr();
			System.out.println(no+"\t"+name+"\t"+mobile+"\t"+addr);
		
}

}
}