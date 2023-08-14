package section16;

import java.util.Stack;

/*
 * 컬렉션 Collection
 * 	자바에서 컬렉션은 여러객체를 모아서 자장하고 관리하는 자료구조를 말한다.
 * 	배열처럼 여러값을 저장하고 불러온다.
 * 
 * Stack 클래스
 *  선입후출 - 먼저 들어온 값이 마지막에 나간다.
 *  
 * 
 * 
 */

public class Collection01 {
	public static void main(String[] args) {
	
	//elements 요소에 대한 값을 정하기	
	Stack<String> stack = new Stack<String>();
	
	//Stack 객체에 자료 저장하기  - 배열과 다르게 유동적으로 추가 삭제가 가능.
	
	stack.push("피카츄");
	stack.push("라이츄");
	stack.push("파이리");
	stack.push("꼬부기");
	stack.push("버터플");
	stack.push("야도란");
	stack.push("피존투");
	stack.push("또가스");
	
	
	//현재 저장하고 있는 데이터 개수
	System.out.println("데이터 개수 :" + stack.size());
	
	//데이터를 하나씩 가져오기  - 선입후출 : 가져오고 소멸됨
	System.out.println("1번 : " + stack.pop());
	System.out.println("2번 : " + stack.pop());
	System.out.println("3번 : " + stack.pop());
	
	//가장 위 데이터 확인 
	System.out.println("가장 위에 있는 데이터 :" + stack.peek());
	
	//stack 출력
	
	while(!stack.empty()){ //stack.empty() == false 동일함.
		String name = stack.pop();
		System.out.println("pop 데이터 : " + name);
		
		
		
	}
	
	
	}

}
