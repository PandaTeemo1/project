public class AccountApp{
	public static void main(String[] args){
		Account a = new Account("ȫ�浿", "111-12-1234", 1234, 1000000);

		System.out.println("������:" + a.getOwner);// owner�� ������ �Ҽ� ����
		a.info();
	}
}
