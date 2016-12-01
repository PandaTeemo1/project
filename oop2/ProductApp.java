public class ProductApp{
	public static void main(String[] args){
		//��ǰ�� 5�� ��� �迭 �����ϱ�
			//��ǰ��ȣ, ��ǰ��, ������, ����, ������(�Ǽ�), �Ǹſ���,
		Product[] products = new Product[5];
		products[0] = new Product(200, "V20", "LG����", 884900, 0.15, true);
		products[1] = new Product(287, "������s7", "SAMSUNG", 1014900, 0.2, false);
		products[2] = new Product(118, "������7", "APPLE", 1200400, 0.25, false);
		products[3] = new Product(100, "����100", "����", 524000, 0.3, true);
		products[4] = new Product(998, "Ű����", "������", 1900, 0.5, false);

		//�迭�� ��ǰ 5���� �����ϱ�

		//�迭�� ����� ��ǰ�߿��� �Ǹ����� ��ǰ�� ǥ���ϱ�
		for(Product p:products)
			if(p.yes == true){
				p.info();
		}

		//�迭�� ����� ��ǰ�߿��� ������ 10000�� �̻��� ��ǰ�� ǥ���ϱ�
		for(Product p:products){
			if(p.price >= 10000){
				p.info();
			}
		}


		//�迭�� ����� ��ǰ�� ��ü ������ ǥ���ϱ�.
		System.out.println("��ǰ��ȣ ��ǰ�� ������ ���� ������ �Ǹſ��� ���ΰ���");
		for(Product p : products){
			System.out.printf("%4d, %8s, %4s, %4d, %2.2f, %4b, %2.2f\n", p.no, p.name, p.manu, p.price, p.discount, p.yes, p.sale());
		}
	}
}