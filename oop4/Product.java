public class Product{
	private int no;
	private String name;
	private String maker;
	private String category;
	private int price;
	private double discountRate;
	private boolean isFree;

	//기본 생성자 <---this()와 같은 형식으로 클래스 내부에서 사용할 수 있다.
	public Product() {}

	public Product(int no, String name, String maker, int price) {
		//this.no = no;
		//this.name = name;
		//this.maker = maker;
		//this.price = price;
		this(no, name, maker, "세품", price, 0.1, false);
		System.out.println("Product(int, string,  string, int)is running");
	}
	
	//this(int, String, String, String, int)와 같은 형식으로 클래스 내부에서 사용가능
	public Product(int no, String name, String maker, String category, int price) {
		//this.no = no;
		//this.name = name;
		//this.maker = maker;
		//this.category = category;
		//this.price = price;
		this(no, name, maker, category, price, 0.1, false);
		System.out.println("Product(int, string, string, string, int)is running");
	}

	//this(int, String, String, String, int, double, boolean)와 같은 형식으로 클래스 내부에서 사용가능
	public Product(int no, String name, String maker, String category, int price, double discountRate, boolean isFree){
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.category = category;
		this.price = price;
		this.discountRate = discountRate;
		this.isFree = isFree;
		System.out.println("Product(int, string, string, string, int, double, boolean)is running");
	}
	public void display(){
		System.out.println("번    호 : "+no);
		System.out.println("이    름 : "+name);
		System.out.println("제 조 사 : "+maker);
		System.out.println("분    류 : "+category);
		System.out.println("가    격 : "+price);
		System.out.println("할 인 율 : "+discountRate);
		System.out.println("무료여부 : "+isFree);

	}

	
}