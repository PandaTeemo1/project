public class Product{
	int no;
	String name;
	String maker;
	int price;
	double discount;
	
	public Product(){
	
	}
	public Product(int no, String name, String maker, int price, double discount){
		this.no = no;
		this.name = name;
		this.maker = maker;
		this.price = price;
		this.discount = discount;

	}

	public int getNo(){
		return no;
	}
	public String getName(){
		return name;
	}
	public String getMaker(){
		return maker;
	}
	public int getPrice(){
		return price;
	}
	public double getDiscount(){
		return discount;
	}
	public int getDiscountPrice(){
		return (int) (price * (1-discount));
	}
	public void info(){
		System.out.printf("%d %s %s %d %f\n", no, name, maker, price, discount);
	}

}
