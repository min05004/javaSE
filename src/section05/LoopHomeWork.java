package section05;
/*
 *반복문 조건 
 *
 *
 *
 *5번 구구단.
 * 2X1 = 2 3X1 =3 4X1 =4 이렇게 3개씩 나오게 하기. 
 * 
 * 
 * 반복문 조건문 연습
 주말숙제 2중for문 코드 분석하기 
 
2번
   *
  **
 ***
****

3번
   *
  ***
 *****
******* 
  
4번

   *				
  ***				  
 *****				
*******		
 *****		 
  ***		 
   *		
 * 
 */

public class LoopHomeWork {
	public static void main(String[] args) {
		
		//2번
		   /* for(int i =1 ; i < 5 ; i++) {
		         for(int j = 4; j >0 ; j--) {
		         if(i< j) {
		            System.out.print(" ");
		         } else {
		            System.out.print("*");
		         }
		         
		      }
		         System.out.println();
		         */
		      //3번
		   /* for(int i =0 ; i < 5 ; i++) {
		      for(int j =5; j > i+1; j--) {
		   
		         System.out.print(" ");
		         }
		      for(int s =0; s < i*2+1 ; s++) {
		         System.out.print("*");
		      
		      }
		      System.out.println( );
		      }
		      */
		      //4번
		       for(int i = 0; i < 5; i++) {
		         for(int j =5; j > i+1; j--) {
		            System.out.print(" ");
		         }
		         for(int s =0; s < i*2+1 ; s++) {
		            System.out.print("*");
		         }
		         System.out.println( );
		      }
		      
		      for(int k = 1; k < 5; k++) {
		         for( int d =1; d < k+1; d++) {
		            System.out.print(" ");
		         }
		         for(int f =10; f > k*2+1; f--) {
		            System.out.print("*");
		            
		         }
		         System.out.println( );
		      }
		      
		   
		   }
		   }