public class ProductApp{
	public static void main(String[] args){
		Product a1 = new Product(10, "�����е�", "����", 1000000, 0.1);
		Product a2 = new Product(12, "�ƺ�����", "����", 1500000, 0.15);
		Product a3 = new Product(14, "������", "����", 999900, 0);

		a1.info();
		a2.info();
		a3.info();
	}
}