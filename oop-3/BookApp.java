public class BookApp{
	public static void main(String[] args){
		Book[] bookcart = new Book[5];
		bookcart[0] = new Book(1, "�̰��� �ڹٴ�", "ȫ�浿", "�Ѻ��̵��", 35000, "2015-10-11");
		bookcart[1] = new Book(2, "������ �ڹٰ���ó���ؿ�", "��浿", "�Ѻ�����Ʈ", 45000, "2015-10-12");
		bookcart[2] = new Book(3, "�̰͸����� ���� �ڹ�", "��Ѹ�", "�߾�HTA", 55000, "2015-10-13");
		bookcart[3] = new Book(4, "XX:�̷����� �ڹٹ������", "�����", "�������", 65000, "2015-10-14");
		bookcart[4] = new Book(5, "�ڱ��� ���", "���ġ", "���ھƺи�", 75000, "2015-10-15");

		int pricetotal = 0;

		//īƮ�� ����� ��� å���� ������ ǥ���ϱ�
		for(Book b : bookcart){
			System.out.println(b.getTitle());
		}
		//ī�忡 ����� å���� ���� ������ ǥ���ϱ�
		for(Book b : bookcart){
			pricetotal += b.getPrice();
		}
		System.out.println(pricetotal);
		//ī�忡 ����� å�߿��� ���� ��� ������ å ����� ������ ǥ���ϱ�
		int maxprice = 0;
		String maxtitle = null;
		for(Book b : bookcart){
			if(maxprice < b.getPrice()){
				maxprice = b.getPrice();
				maxtitle = b.getTitle();
			}
		}
		System.out.println("���� : "+maxtitle + " ���� : "+ maxprice);


	}
}