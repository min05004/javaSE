package section09;

public class Book {
	
	//속성값(멤버들)
	public String title;
	public int price;
	public int totalpage;
	public String autor;

	public Book() {// 생성자 - 디폴트 값으로 들어감.초기화값으로 사용됨.
		this.title = "멘토씨리즈 자바";
		this.price = 32000;
		this.totalpage = 603;
		this.autor ="김영우";
		
	}
	
	
	public void getInfo() { 
	
		System.out.println("title: " + title);
		System.out.println("price: " + price);
		System.out.println("title: " + totalpage);
		System.out.println("autor: " + autor);
	}
}
