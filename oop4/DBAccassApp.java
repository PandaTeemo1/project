public class DBAccassApp{
	public static void main(String[] args){
	//	DBAccassŬ������ �����ڸ� ����� �� ����.
	//	DBAccass db1 = new DBAccass();
	//	DBAccass db2 = new DBAccass();
	//	DBAccass db3 = new DBAccass();

		DBAccass db1 = DBAccass.getInstance();
		DBAccass db2 = DBAccass.getInstance();
		DBAccass db3 = DBAccass.getInstance();
		//�̱��� ó���� Ŭ������ ��ü ȹ���ϱ�.
		//�������� db�� ����� #123���� ��ȯ�޴´�.
		//���α׷��� ����Ǵ� ���� ��ü�� �Ѱ��� �����ǵ��� �ϴ°�.


		System.out.println(db1);
		System.out.println(db2);
		System.out.println(db3);


	}
}