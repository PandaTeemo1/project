public class Product{
	//�Ӽ�
	//��ǰ��ȣ, ��ǰ��, ������, ����, ������(�Ǽ�), �Ǹſ���,
	int no;
	String name;
	String manu;
	int price;
	double discount;
	boolean yes;

	//������(�⺻,�Ű����� �ִ� ������)

	public Product(int a, String b, String c, int d, double e, boolean f){
		no = a;
		name = b;
		manu = c;
		price = d;
		discount = e;
		yes = f;
	}
	//���
	//���ε� ������ ��ȯ�ϴ� �޼ҵ�
	public double sale(){
		double value = price-(price*discount);
		return value;
	}
	//��ǰ������ ��� ����ϴ� �޼ҵ�(���ΰ� ����)
	public void info(){
		System.out.println("##### ��ǰ���� #####");
		System.out.println("��ǰ��ȣ : "+no);
		System.out.println("��ǰ�� : "+name);
		System.out.println("������ : "+manu);
		System.out.println("���� : "+price);
		System.out.println("������ : "+discount);
		System.out.println("�Ǹſ��� : "+yes);
		System.out.println("���εȰ��� : "+sale());
		System.out.println("####################");
	}
	//
}