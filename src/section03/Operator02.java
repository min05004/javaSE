package section03;
/*
 * 
 * 2.증감연산자
 * 	++ : 1씩 증가시키다
 * 	-- : 1씩 감소시킨다.
 * 
 */
public class Operator02 {
	public static void main(String[] args) {
		 int num = 0;
		 
		 num = num +1;
		 System.out.println(num);  //num : 1
		 
		 //증감연산자 이용
		 num++;
		 System.out.println(num); // num : 2
		 
		 // 전위 증감연산자 : 명령어가 실행 전 1증가
		 System.out.println(++num); // ++ 앞에 붙일 경우 : num 3 
		 
		 // 후위 증감연산자 : 명령어가 실행 후 1증가
		 System.out.println(num++); // ++ 뒤에 붙일 경우
		 System.out.println(num);
		 
		 
}
}

