public class ProductApp{
	public static void main(String[] args){
		Product p1 = new Product(1, "맥북", "애플", "노트북", 2000000);
		Product p2 = new Product(2, "아이폰", "핸드폰", 30000);
		p1.display();
		p2.display();
	}
}