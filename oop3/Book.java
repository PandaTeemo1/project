public class Book{
	//����ȭ�� �Ӽ� �����ϱ�

	//å��ȣ, ����, ����, ���ǻ�, ����, ������
	private int no;
	private String title;
	private String author;
	private String publisher;
	private int price;
	private String pubdate;

	//������ ��� �����ϱ�

	//�⺻ ������ �����ϱ�
	public Book(){
	
	}

	//��� �Ӽ��� �ʱ�ȭ�� ���� �Ű����� �ִ� ������ �����ϱ�
	public Book(int no, String title, String author, String publisher, int price, String pubdate){
	
		this.no = no;
		this.title = title;
		this.author = author;
		this.publisher = publisher;
		this.price = price;
		this.pubdate = pubdate;
	}

	//��� �Ӽ��� ���� ������ getter�Լ� �����ϱ�

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