package section06;

/*
 * 
 * 숙제 7*7
 * 
 * 
 * 1.2중배열 선언하고
 * 2.for 문으로 1~49 까지 대입하기.
 * 3.출력 순서 지그재그( 1 2 8 15 9 3 ... 순서가 중요!)
 * 
 * 

 1  2  3  4  5  6  7
 8  9  10 11 12 13 14
 15 16 17 18 19 20 21
 22 23 24 25 26 27 28
 29 30 31 32 33 34 35
 36 37 38 39 40 41 42
 43 44 45 46 47 48 49
 
 1. 2중배열 선언하고
 2. for문으로 1~49까지 대입하기
 3. 아래 모양으로 출력하기!!!!!!!!!!!!!!

1 
2 8
15 9 3
4 10 16 22
29 23 17 11 5
6 12 18 24 30 36
43 37 31 25 19 13 7
14 20 26 32 38 44
45 39 33 27 21
28 34 40 46
47 41 35
42 48
49
 
 * 
 */
//지그재그로 나온다는게 무슨말일까..?
/*
 *  for(int s = 0; s<4 ; s++) {; //1번 학생, 2번학생 ...반복 4번되는 값을 s로 둠.
				System.out.println((s+1) + "번 학생 점수---");
				for(int i=0; i<3 ; i++){
					System.out.println(subject[i]+":"); 
					//subject 값이 0,1,2,scores 값이 0,1,2 반복되기 때문에 반복문을 사용.
					scores[s][i]=sc.nextInt();

					
 */
public class ArrayHomWork {
	public static void main(String[] args) {

		/*
		 * int nums[][] = new int[7][7]; int arr=1;
		 * 
		 * 
		 * for(int i = 0; i < 7; i++) { System.out.print(i);
		 * 
		 * for(int j=0; j<50; j++) { System.out.println(j);
		 * 
		 * } } }}
		 * 
		 * 
		 * 
		 * 
		 * /*int [0][0] 1 int [0][1] 2 int [1][0] 8 int [2][0] 15 int [1][1] 9 [0][2] 3
		 * [4][0] [
		 */

		/*
		 * for(int i = 0; i < nums.length; i++) { for(int j = 0; j <nums[i].length; j++)
		 * { i-1
		 * 
		 * System.out.print (nums[i][j]+" "); // nums[i][j] 를 표현 } System.out.println();
		 * 
		 * } }
		 * 
		 * }
		 */

		// 7*7행렬 만들기
		int[][] arr = new int[7][7];

		for (int i = 0; i < 7; i++) {
			for (int j = 0; j < 7; j++) {
				arr[i][j] = i * 7 + j + 1; // 1~49 까지 이중배열에 값 넣기
				
				// 위치 값 i 열 기준 /2,4,6 열은 i값은 늘어가고,j값은 줄어듬

			}
		}
		for (int i = 0; i < 13; i++) {
			
			if (i < 7) {
				for (int j = 0; j < i + 1; j++) { // 점점 증가하는 모양,위쪽 삼각형
					if (i % 2 == 0) { // 짝수일때 줄 출력.
						System.out.print(arr[i - j][j] + " ");// 2,4,6 열은 i값은 늘어가고,j값은 줄어듬 표현 출력.
					} else {
						System.out.print(arr[j][i - j] + " "); // 홀수일때 j값 늘어나고 i값 줄어듬.
					}
				}
			} else {
				for (int j = 0; j < 13 - i; j++) {
					if (i % 2 == 0) {
						System.out.print(arr[6 - j][i - 6 + j] + " ");
					} else {
						System.out.print(arr[i - 6 + j][6 - j] + " ");
					}
				}
			}
			System.out.println();
		}

	}
}
/*
 * 
 * 
 * 
 */



