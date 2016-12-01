public class ProductApp{
	public static void main(String[] args){
		//상품을 5개 담는 배열 정의하기
			//상품번호, 상품명, 제조사, 가격, 할인율(실수), 판매여부,
		Product[] products = new Product[5];
		products[0] = new Product(200, "V20", "LG전자", 884900, 0.15, true);
		products[1] = new Product(287, "갤럭시s7", "SAMSUNG", 1014900, 0.2, false);
		products[2] = new Product(118, "아이폰7", "APPLE", 1200400, 0.25, false);
		products[3] = new Product(100, "베가100", "팬텍", 524000, 0.3, true);
		products[4] = new Product(998, "키보드", "로지텍", 1900, 0.5, false);

		//배열에 상품 5개를 저장하기

		//배열에 저장된 상품중에서 판매중인 상품만 표시하기
		for(Product p:products)
			if(p.yes == true){
				p.info();
		}

		//배열에 저장된 상품중에서 가격이 10000원 이상인 상품만 표시하기
		for(Product p:products){
			if(p.price >= 10000){
				p.info();
			}
		}


		//배열에 저장된 상품이 전체 가격을 표시하기.
		System.out.println("상품번호 상품명 제조사 가격 할인율 판매여부 할인가격");
		for(Product p : products){
			System.out.printf("%4d, %8s, %4s, %4d, %2.2f, %4b, %2.2f\n", p.no, p.name, p.manu, p.price, p.discount, p.yes, p.sale());
		}
	}
}