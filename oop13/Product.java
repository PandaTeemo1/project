public class Product{
	private String name;
	private String wpwh;
	private int price;
	private double rate;

	public Product(){
	
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getWpwh(){
		return wpwh;
	}
	public void setWpwh(String wpwh){
		this.wpwh = wpwh;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price = price;
	}
	public Double getRate(){
		return rate;
	}
	public void setRate(Double rate){
		this.rate = rate;
	}
	public void info(){
		System.out.println("�̸� : "+getName());
		System.out.println("������ : "+getWpwh());
		System.out.println("���� : "+getPrice());
		System.out.println("������ : "+getRate());
		System.out.println("");
	}
}