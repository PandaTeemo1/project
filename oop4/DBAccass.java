public class DBAccass{

	private static DBAccass db = new DBAccass();

	//�����ڸ� ����ȭ��Ų��.
	private DBAccass(){
		
	}
	//������ DBAccass ��ä�� ������ �� �ִ� �������� �������ִ�
	//���� �޼ҵ带 �����Ѵ�.
	public static DBAccass getInstance(){
		return db;
	}
	public void insert(){
		System.out.println("�߰� �۾�");
	}
	public void update(){
		System.out.println("���� �۾�");
	}
	public void deleta(){
		System.out.println("���� �۾�");
	}
	public void retrieve(){
		System.out.println("��ȸ �۾�");
	}
}