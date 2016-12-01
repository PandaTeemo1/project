public class Book{
	//은닉화된 속성 정의하기

	//책번호, 제목, 저자, 출판사, 가격, 출판일
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pubdate;

	//공개된 기능 정의하기

	//기본 생성자 정의하기
	public Book(){
	
	}

	//모든 속성을 초기화기 위해 매개변수 있는 생성자 정의하기
	public Book(int no, String title, String author, String publisher, int price, String pubdate){
	
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pubdate = pubdate;
	}

	//모든 속성에 대한 각각의 getter함수 정의하기

	public int getNo(){
		return no;
	}
	public String getTitle(){
		return title;
	}
	public String getAuthor(){
		return author;
	}
	public String getPublisher(){
		return publisher;
	}
	public int getPrice(){
		return price;
	}
	public String getPubdate(){
		return pubdate;
	}
}