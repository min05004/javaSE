package section04;

public class Conditional05 {
	public static void main(String[] args) {
		/*
		 * 예문1)
		 * 환불 상태 코드
		 * 01 : 환불 신청중
		 * 02 : 환불 처리중
		 * 03 : 환불 취소
		 * 04 : 계좌 이체중
		 * 05 : 환불 완료
		 * 01, 02, 04 상태일때 환불 불가 코드를 만들어 놔야함.
		 * 
		 */
		//switch 문
		String rtCd = "02";
		switch(rtCd) {
		case "01":
		case "02":
		case "04":	
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드:" + rtCd); //rtCd 임의의 코드로 예시
		}
		//if문으로 변경했을 경우
		
		if(rtCd =="01" || rtCd == "02" || rtCd =="04" ) {
			System.out.println("환불불가, 관리자에게 문의하세요.");
			System.out.println("환불상태코드:" + rtCd);
		}
		
	}

}
