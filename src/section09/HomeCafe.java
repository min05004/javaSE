package section09;

public class HomeCafe {
	public String drink;
			int price;
			String type;
			
			//stactic 초기화 블럭.
			static {
				System.out.println("stactic 초기화 블럭");
			}
			
			//초기화 블럭
				{
					this.drink = "아메리카노";
					this.price = 4000;
					this.type="커피";
			System.out.println("홈카페 초기화 블럭");
				}
			public HomeCafe () {
				System.out.println("생성자 입니다.");
				
			/*public HomeCafe() {
			this.drink = "아메리카노";
			this.price = 4000;
			this.type="커피"; 
		 */
		
				}
		public void getInfo() {
			System.out.println("drink:"+drink);
			System.out.println("price:"+price);
			System.out.println("type:"+type);
		}
		
}
