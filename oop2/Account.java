/*
	������¸� ǥ���ϴ� Ŭ����
		-�Ӽ�
			������
			���¹�ȣ
			��й�ȣ
			�ݾ�
		-�ݾ�
			��ݱ�� - �ݾװ� ��й�ȣ�����޹޾Ƽ� ������ �Է��� ��й�ȣ�� ��ġ�ϸ� �ݾ׸�ŭ �ܾ׿��� ���ҽ�Ű�� �ݾ׸�ŭ�� ���� ��ȯ�Ѵ�.
			�Աݱ�� - �ݾ��� ���޹޾Ƽ� �� �ݾ׸�ŭ �ܾ��� ������Ű�� ȭ�鿡 ���� �ܾ��� ǥ���Ѵ�.
			��ȸ��� - ������, ���¹�ȣ, �ܾ��� ǥ���Ѵ�.
*/
public class Account{

	String owner;
	String acnum;
	int password;
	int balance;

	public int withdraw2(int amount, int pwd){
		if(password != pwd){
			System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			return 0;
		}
		if(balance < amount) {
			System.out.println("�ݾ��� �����մϴ�.");
			return 0;
		}
		balance -= amount;
		System.out.println("��� �� �ܾ� : "+balance);
		return amount;
	}
	//��ݱ��
	public int withdraw(int amount, int pwd){
		int money = 0;
		if(pwd == password){
			if(balance >= amount ){
				balance-=amount;
				money = amount;
				System.out.println(amount+"�� ����ϼ̽��ϴ�");
				System.out.println("�����ܾ��� "+balance+"�� �Դϴ�");
			}else{
				System.out.println("�ܾ��� �����մϴ�");
			}
		}else{
			System.out.println("��й�ȣ�� Ʋ���̽��ϴ�");
		}
		return money;
	}
	public void deposit(int amount){
		balance += amount;
		System.out.println(amount+"�� �ԱݵǼ̽��ϴ�");
		System.out.println("�����ܾ��� "+balance+"�� �Դϴ�");
	}
	public void check(){
		System.out.println("##### �������� #####");
		System.out.println("������ : "+owner);
		System.out.println("���¹�ȣ : "+acnum);
		System.out.println("�ܾ� : "+balance);
		System.out.println("####################");
	}
}