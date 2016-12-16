package kr.jhta.list;

import java.util.ArrayList;
import java.util.HashSet;

public class ArrayListDemo5 {

	public static ArrayList<Book> Bookname(ArrayList<Book> list, String names){

		ArrayList<Book> result = new ArrayList<>();
		
		//if(names == null || names.trim().isEmpty()){
			//return result;
		//}
		String lowerCasenames = names.toLowerCase();

		for(Book b : list){
			String lowerCaseTitle = b.getTitle().toLowerCase();
			if(lowerCaseTitle.contains(lowerCasenames)){
				result.add(b);
			}
			
		}

		return result;

	}
	public static ArrayList<Book> Bookprice(ArrayList<Book> list, int minprice, int maxprice){
		ArrayList<Book> result = new ArrayList<>();
		for(Book b : list){
			if(b.getPrice()>=minprice && b.getPrice()<=maxprice){
				result.add(b);
			}
			
		}


		return result;
	}
	public static ArrayList<Book> BookAuthor(ArrayList<Book> list, String publ){
		ArrayList<Book> result = new ArrayList<>();
		for(Book b : list){
			if(b.equals(publ)){
				result.add(b);
			}
			
		}


		return result;

	}
	public static HashSet<String> Publicshers(ArrayList<Book> list){
		HashSet<String> result = new HashSet<>();
		
			for(Book b : list){
				result.add(b.getPublicsher());
			}
		
		
		return result;
		
	}
	public static void main(String[] args){
		//콜레겻노가 제목을 전달받아서 제목이 포함된 책 정보를 반환하는 메소드
		//콜렉션과 최소가격 , 최대가격을 전달받아서 그 가격 범위에 포함된 책 정보를 반환하는 메소드
		//콜렉션과 출판사를 전달받아서 그 출판사에서 출판한 책 정보를 반환하는 메소드
		
		//콜렉션을 전달받아서 출판사 정보를 반환하는 메소드
		ArrayList<Book> bk = new ArrayList<>();

		bk.add(new Book("이것이 자바다", "신용권", "한일미디어", 30000));
		bk.add(new Book("델몬트 믹시", "델몬트", "영양성분", 300));
		bk.add(new Book("코카콜라 250ml", "코카콜라", "코크", 1000));
		bk.add(new Book("열혈 C프로그래밍", "윤성우", "오렌지미디어", 20000));
		bk.add(new Book("파이썬 웹 크롤러", "한선웅", "한빛미디어", 24000));
		bk.add(new Book("텐서플로 첫걸음", "박혜선", "한빛미디어", 16500));
		bk.add(new Book("자바의 정석", "남궁석", "도우출판사", 30000));
		bk.add(new Book("모두의 파이썬", "이승찬", "질벗", 12000));
		bk.add(new Book("자바6 인 액션", "우경은", "한빛미디어", 20000));
		bk.add(new Book("자바스크립트", "이철웅", "한일미디어", 34000));
		bk.add(new Book("이것이 자바다", "신용권", "한일미디어", 30000));
		
		//ArrayList<Book> result = Bookname(bk, "자바");
		

	}
	public static class Book{
		private String title;
		private String author;
		private String publicsher;
		private int price;

		public Book(){}

		public Book(String title, String author, String publicsher, int price) {
			super();
			this.title = title;
			this.author = author;
			this.publicsher = publicsher;
			this.price = price;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getAuthor() {
			return author;
		}

		public void setAuthor(String author) {
			this.author = author;
		}

		public String getPublicsher() {
			return publicsher;
		}

		public void setPublicsher(String publicsher) {
			this.publicsher = publicsher;
		}

		public int getPrice() {
			return price;
		}

		public void setPrice(int price) {
			this.price = price;
		}

		@Override
		public String toString() {
			return "Book [title=" + title + ", author=" + author + ", publicsher=" + publicsher + ", price=" + price
					+ "]";
		}
	}
}
