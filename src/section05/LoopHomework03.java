package section05;

public class LoopHomework03 {
	public static void main(String[] args) {
		/*
		 * 
		 * 5번 구구단                                   i
		 *  2 X 1 = 2  3 X 1 =3  4 X 1 = 4           
		 *  2 X 1 = 2  3 X 1 =3  4 X 1 = 4
		 *  2 X 1 = 2  3 X 1 =3  4 X 1 = 4
		 *  2 X 1 = 2  3 X 1 =3  4 X 1 = 4
		 *  2 X 1 = 2  3 X 1 =3  4 X 1 = 4
		 *  2 X 1 = 2  3 X 1 =3  4 X 1 = 4
		 *  2 X 1 = 2  3 X 1 =3  4 X 1 = 4
		 */
				for(int k = 0; k < 3; k++) { //3번 반복 - k=0일때 / k=1일때 / k=2일때
					for(int i = 0; i < 9; i++) { // 9줄
						for(int j = 0; j < 3; j++) {
							int dan = (j+2)+(k*3); //3단
								if(dan > 9) break; //9단까지 제한
							System.out.printf("%d X %d = %d\t",  dan, i+1, dan*(i+1)); 
							//printf 는 ,뒤의 값 삽입 출력. 
						}
						System.out.println();
					}
					System.out.println();
				}
			}
		}