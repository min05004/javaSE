package section17;

import java.util.Arrays;
import java.util.List;

/*
 * Stream
 *  데이터 처리와 컬렉션을 다루는데에 사용되는 선언적이고 함수형 스타일의 API이다.
 *  컬렉션을 스트림으로 변환하여 조작,필터링,매핑 등 효율적이고 간결하게 수행가능.
 *  
 * 
 */


public class Lambda02 {
	public static void main(String[] args) {
	List<String> names = Arrays.asList("Apple","Bat","Cat","Dog");
//  Arrays.asLis
//	printBasic(names);
//	System.out.println("===============");
//	printWithFP(names);

	printWithFB2(names);
	printWithFP3(names);
	
		
	}
	
	private static void printBasic(List<String> list) {
		for(String element : list){
			System.out.println(element);
		}
	}
	
	private static void printWithFP(List<String> list) {
		list.stream()
		.forEach(element -> System.out.println("elememt - "+ element));
		// stream().forEach가  하나씩 요소들 대입해줌. 매개변수 -> 코드영역
	}

	
	
	private static void printWithFB2(List<String> list) {
		for(String element : list) {
			if(element.endsWith("at")) {  //각요소에서 at로 끝나는 요소만,
				System.out.println(element); 
				
			}
		}
	}
	
	private static void printWithFP3(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")) //필터 처리 한 후 
		.forEach(element -> System.out.println("element -" + element));
	}
	
	
}
