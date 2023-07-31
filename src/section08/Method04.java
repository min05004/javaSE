package section08;

public class Method04 {
	public static void main(String[] args) {
		int[]valuse = {19,55,66,77,2,1,98};
		
		double[] result = summary(valuse);
		
		System.out.println("합계: " + result[0]);
		System.out.println("평균: " + result[1]);
		
		
	}

	public static double[] summary(int[] values) {
		//result[0] : 합계,result[1] : 평균,
		double[] result = new double[2];
		
		int sum =0;
		for(int value : values) {
			sum += value;
		}
		
		double avg = sum /(double)values.length; //sum,values.length 값 자체가 int 이기 때문에,  소수점 값을 받기 위해 (double)로 타입 바꿔줌.
		// 숫자의 경우는 꼭 한번씩 확인해보기. 
		
		result[0] = sum;
		result[1] = avg;
		
		return result;
	}
}
