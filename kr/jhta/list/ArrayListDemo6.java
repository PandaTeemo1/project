package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo6 {
	public static void main(String[] args) {
		
		ArrayList<Item> cart = new ArrayList<>();
		
		//책(이름 : 자바의 정석, 가격35000) 1권을 장바구니에 담기
		Product pro1 = new Product("자바의정석", 35000);
		int qty1 = 1;
		Item item1 = new Item();
		item1.setProduct(pro1);
		item1.setQuantity(qty1);
		
		cart.add(item1);
		
		//연필(이름:모나미연필, 가격:500) 10개를 장바구니에 담기
		Product pro2 = new Product("모나미연필", 500);
		int qty2 = 10;
		Item item2 = new Item();
		item2.setProduct(pro2);
		item2.setQuantity(qty2);
		cart.add(item2);
		
		//구매 총액을 계산하기
		int total = 0;
		for(Item i : cart){
		//	total += i.getProduct().getPrice()*i.getQuantity();
			String name =  i.getProduct().getName();
			int price =i.getProduct().getPrice();
			int qty = i.getQuantity();
			
			int ItemPrice = price * qty;
			
			total += ItemPrice;
			
			System.out.printf("%s %d %d %d\n",name, price, qty, ItemPrice);
		}
		System.out.println("구매총액 : "+total);
		
		
	}
	public static class Product{
		private String name;
		private int price;
		
		public Product() {}
		public Product(String name, int price) {
			super();
			this.name = name;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		@Override
		public String toString() {
			return "Product [name=" + name + ", price=" + price + "]";
		}
		
	}
	
	public static class Item{
		private Product product;
		private int quantity;
		
		public Item(){}
		public Product getProduct() {
			return product;
		}
		public void setProduct(Product product) {
			this.product = product;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
		
		@Override
		public String toString() {
			return "Item [product=" + product + ", quantity=" + quantity + "]";
		}
		
		
	}
}
