/*
//����ó ���� ���α׷�
// 1.����ó�� ������ ����� �� �ִ�.
// 2.��ϵ� ����ó�� ��ȸ�� �� �ִ�.
// 3.

//����ó ���� (��ȣ, �̸�, ��ȭ��ȣ, �̸���)�� ������ �� �ִ� ��ü�� ���赵 �����
//������ ����� �����ϱ�
// ��ϱ��, ��ȸ���
// ������ ���޹޾Ƽ� ��� ����� �־�ߵ�  �迭�� Contact ��ü�� �����ϴ� �� �����ϱ�
��ȸ���
	�迭�� ����� ��� Contact ��ü�� ������ ǥ���ϴ� �� �����ϱ�

�ʿ��� Ŭ����
	Contact Ŭ���� = Contact ������ ǥ���ϴ� Ŭ����
	contactMgr Ŭ���� = Contact ������ ����,��ȸ�ϴ� ����� ������ Ŭ����
	ContactApp Ŭ���� = Contact �������� �Ǵ� Ŭ����*/
public class Contact{
	private int no;
	private String name;
	private String number;
	private String email;

	public Contact(){
	
	}
	public int getNo(){
		return no;
	}
	public void setNo(int no){
		this.no = no;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getNumber(){
		return number;
	}
	public void setNumber(String number){
		this.number = number;
	}
	public String getEmail(){
		return email;
	}

	public void setEmail(String email){
		this.email = email;
	}
	public void info(){
		System.out.println("����� ��ȣ : "+no);
		System.out.println("����� �̸� : "+name);
		System.out.println("����� ��ȣ : "+number);
		System.out.println("����� ���� : "+email);
	}
}