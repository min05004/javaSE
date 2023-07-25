package section06;

public class Array02 {
	public static void main(String[] args) {
		//문자열 배열객체 생성하기
		String[] names = new String[6]; //6개의 저장 공간이 생긴것임
		
		//배열에 값 대입하기 -    6개의 저장 공간의 index(0~5),각  칸마다 "피카츄"~ 야도란 까지 값이 매겨짐.
		names[0] = "피카츄";
		names[1] = "라이츄";
		names[2] = "파이리";
		names[3] = "꼬부기";
		names[4] = "버터블";
		names[5] = "야도란";
		//값 가져오기
		System.out.println(names[3]); //해당 index번호의  값을 가지고 옴 
		//배열의 길이
		System.out.println(names.length); //배열의 크기를 알려줌
		
		//배열 for문을 사용하여 전체 출력하기
		for(int i =0; i < names.length; i++) {
			System.out.println(names[i]);
		}
	}

}
