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
					System.out.println(subject[i]+":"); //subject 값이 0,1,2,scores값이 0,1,2 반복되기 때문에 반복문을 사용.
					scores[s][i]=sc.nextInt();
					
 */
public class ArrayHomWork {
	public static void main(String[] args) {
		
		int nums[][] = new int[7][7];
		int arr=1;
		
		
		for(int i = 0; i < 7; i++) {
			System.out.print(i);
			
			for(int j=0; j<7; j++) {
				System.out.print(j+1);
		
		}
	}
	}}
				
		
				
		
		/*int [0][0] 1
		 * int [0][1] 2 int [1][0] 8
		 * int [0][3] 15  int [1][1] 9  [3][0] 3 
		 * [4][0] [
		 */
	
	/*	for(int i = 0; i < nums.length; i++) {
			for(int j = 0; j <nums[i].length; j++) {
				i-1
				
				System.out.print (nums[i][j]+" "); // nums[i][j] 를 표현
			}
		System.out.println();
		
	}
	}

}
		*/
		
		
	
			

		
		


