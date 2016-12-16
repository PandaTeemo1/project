package kr.jhta.list;

import java.util.ArrayList;

public class ArrayListDemo3 {
	public static void main(String[] args) {
		//상품 정보를 담는 ArrayList를 생성하고
		//상품 정보 여러 개를 담기
		//저장된 상품 중에서 색상이 "검정"색인 상품만 화면에 출력하기
		ArrayList<Product> pl = new ArrayList<>();
		
		pl.add(new Product("봉지","검정",20));
		pl.add(new Product("청바지","파랑",3000));
		pl.add(new Product("블랙진","검정",10000));
		pl.add(new Product("코트","노란",200000));
		pl.add(new Product("스카프","하얀",30000));
		pl.add(new Product("자켓","검정",40000));
		pl.add(new Product("목도리","빨강",5000));
		
		for(Product p : pl){
			if("검정".equals(p.getColor())){
				System.out.printf("%s %s %d\n",p.getName(),p.getColor(), p.getPrice());
			}
		}
	}
	public static class Product{
		private String name;
		private String color;
		private int price;
		
		public Product(){}

		public Product(String name, String color, int price) {
			super();
			this.name = name;
			this.color = color;
			this.price = price;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getColor() {
			return color;
		}
		
		public void setColor(String color) {
			this.color = color;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}
		
	}
}
