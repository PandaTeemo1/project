public class Product{
	//속성
	//상품번호, 상품명, 제조사, 가격, 할인율(실수), 판매여부,
	int no;
	String name;
	String manu;
	int price;
	double discount;
	boolean yes;

	//생성자(기본,매개변수 있는 생성자)

	public Product(int a, String b, String c, int d, double e, boolean f){
		no = a;
		name = b;
		manu = c;
		price = d;
		discount = e;
		yes = f;
	}
	//기능
	//할인된 가격을 반환하는 메소드
	public double sale(){
		double value = price-(price*discount);
		return value;
	}
	//상품정보를 모두 출력하는 메소드(할인가 포함)
	public void info(){
		System.out.println("##### 상품정보 #####");
		System.out.println("상품번호 : "+no);
		System.out.println("상품명 : "+name);
		System.out.println("제조사 : "+manu);
		System.out.println("가격 : "+price);
		System.out.println("할인율 : "+discount);
		System.out.println("판매여부 : "+yes);
		System.out.println("할인된가격 : "+sale());
		System.out.println("####################");
	}
	//
}