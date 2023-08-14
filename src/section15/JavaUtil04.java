package section15;
/*
 * Calender 클래스
 *  시간과 날짜 정보를 다루는 클래스
 *  날짜 시간 계산으로 자주 사용
 *  Date 객체화 호환가능.
 *  
 * 
 */

import java.util.Calendar;

import section15.access2.Singleton;

public class JavaUtil04 {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance(); //product로 객체 생성을 막아놔서 객체생성을 getInstance() 메서드를 통해서 해야함.
		
		int year = cal.get(Calendar.YEAR);
		System.out.println("올 해 : " + year);
		
		int month = cal.get(Calendar.MONTH) +1; //0부터 시작하기 때문에 +1해줌
		System.out.println("월 : " + month);
		
		int day = cal.get(Calendar.DAY_OF_MONTH);
		System.out.println("일 : "+ day);
		
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		System.out.println(hour + ":"+ min + ":" + sec);
		
		
		
		
		
		//getInstance()로 객체를 생성하는 경우
		//Singleton singleton  = Singleton.getInstance();
		 
		
	}

}
