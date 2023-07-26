package section07;

public class OOP02 {
	public static void main(String[] args) {
		
		Card card1 = new Card(); 
		Card card2 = new Card();
		
		
		System.out.println("card1 type: "+card1.type);
		System.out.println("card1 number: "+card1.number);
		System.out.println("card1 width: "+card1.width);
		System.out.println("card1 heigth: "+card1.height);
		
		System.out.println("card2 type: "+card2.type);
		System.out.println("card2 number: "+card2.number);
		System.out.println("card2 width: "+card2.width);
		System.out.println("card2 heigth: "+card2.height);
		
		
		System.out.println("==============================");
		
		card1.number ="K"; //1의 넘버 바꿈, 바뀌어서 출력됨.
		
		System.out.println(card1.number);
		System.out.println(card2.number);
		
		card1.width = 72; // 1의 길이 바꿈-> 1,2의 값도 같이 바뀜(stactic 선언을 했기 때문에 값이 공유.)
		System.out.println(card1.width); // 그래서 클래스명(card)으로 호출을 하는게 맞음.
		System.out.println(card2.width);

	}

}
