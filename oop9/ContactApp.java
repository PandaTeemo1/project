public class ContactApp{
	public static void main(String[] args){
		//�ּҷ�����(�̸� �������� ��ȭ��ȣ,�ּ�)�� �����ϴ� ��ä ����
		Contact c = new Contact();

		//�̸� ���� ����
		String name = "ȫ�浿";
		c.setName(name);

		//��ȭ��ȣ ���� ����
		Tel[] p = new Tel[10];
		Tel t1 = new Tel();
		t1.setType("��");	
		t1.setNumber("101010");
		p[0] = t1;
		
		Tel t2 = new Tel();
		t2.setType("��");
		t2.setNumber("202020");
		p[1] = t2;

		Tel t3 = new Tel();
		t3.setType("��");
		t3.setNumber("303030");
		p[2] = t3;

		Tel t4 = new Tel();
		t4.setType("��");
		t4.setNumber("404040");
		p[3] = t4;

		c.setTels(p);

		//�ּ� ���� ����
		Address a1 = new Address();
		a1.setZipcode("��");
		a1.setSido("����Ư����");
		a1.setGugun("���α�");
		a1.setDetail("���͵� ��Ƹ����� 401ȣ");

		c.setAddress(a1);
	}
}