package section06;

public class Array03 {
	public static void main(String[] args) {
		
		// new 연산자 사용하지 않고 직접 배열 값 대입하기
		String[] names = {"피카츄","라이츄","파이리","꼬부기","버터플","야도란"};
		
		// 배열 내용 전체 출력
		for(int i =0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		System.out.println("------------------"); // 바꾼 값 확인 라인
		
		// 중간에 배열 값을 바꾸고 싶을때. - 배열 값 수정하기/ 바꾸고 싶은 배열 인덱스 값 삽입하고 바꿀 내용 삽입.
		names[4] = "메타몽";
		
		// 확장 for 문
		for(String name : names) {
			System.out.println(name);
		}
	
	
	}

}
