public class BookApp{
	public static void main(String[] args){
		Book[] bookcart = new Book[5];
		bookcart[0] = new Book(1, "이것이 자바다", "홍길동", "한빛미디어", 35000, "2015-10-11");
		bookcart[1] = new Book(2, "난정말 자바공부처음해요", "고길동", "한빛소프트", 45000, "2015-10-12");
		bookcart[2] = new Book(3, "이것만배우면 정복 자바", "김둘리", "중앙HTA", 55000, "2015-10-13");
		bookcart[3] = new Book(4, "XX:이러려고 자바배웠는지", "도우너", "서울우유", 65000, "2015-10-14");
		bookcart[4] = new Book(5, "자괴감 들어", "김또치", "코코아분말", 75000, "2015-10-15");

		int pricetotal = 0;

		//카트에 저장된 모든 책들의 제목을 표시하기
		for(Book b : bookcart){
			System.out.println(b.getTitle());
		}
		//카드에 저장된 책들의 가격 총합을 표시하기
		for(Book b : bookcart){
			pricetotal += b.getPrice();
		}
		System.out.println(pricetotal);
		//카드에 저장된 책중에서 가장 비싼 가격의 책 제목과 가격을 표시하기
		int maxprice = 0;
		String maxtitle = null;
		for(Book b : bookcart){
			if(maxprice < b.getPrice()){
				maxprice = b.getPrice();
				maxtitle = b.getTitle();
			}
		}
		System.out.println("제목 : "+maxtitle + " 가격 : "+ maxprice);


	}
}