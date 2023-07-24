package section05;

public class LoopHomwork02 {
	public static void main(String[] args) {
		/*
		 * 2번 * ** ***
		 *****
		 * 
		 *
		 * 
		 * for(int i =0; i < 5; i++) { for(int j=5; j > i+1; j--) {
		 * System.out.print(" "); } for(int s = 0; s < i+1; s++) {
		 * System.out.print("*"); }
		 * 
		 * System.out.println( );
		 * 
		 * } } }
		 */
		// 3번

		/*
		 * for(int i =0; i <5; i++){ for(int j=5; j > i+1; j--) { System.out.print(" ");
		 * } for(int s=0; s < i*2+1; s++) { System.out.print("*"); } System.out.println(
		 * ); } } } //4번
		 */
		for (int i = 0; i < 5; i++) {
			for (int j = 5; j > i + 1; j--) {
				System.out.print(" ");
			}
			for (int s = 0; s < i * 2 + 1; s++) {
				System.out.print("*");
			}
			System.out.println();
		}

		for (int k = 1; k < 5; k++) {
			for (int d = 1; d < k + 1; d++) {
				System.out.print(" ");
			}
			for (int f = 10; f > k * 2 + 1; f--) {
				System.out.print("*");

			}
			System.out.println();
		}
	}
}
