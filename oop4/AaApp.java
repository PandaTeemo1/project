public class AaApp{
	public static void main(String[] args){

		//static ������ ��ü �������� Ŭ������.���������� ��밡��.
		System.out.println(Aa.y);//static �ɹ��� Ŭ������ ���� .Ŭ�������޼ҵ�()�������� ���

		//���� ������ y�� �� �Ҵ��ϱ�
		//AaŬ������ ����ؼ� ���� ��� ��ü�� �������� y���� �����Ѵ�.
		//Aa.y = 100;

		//������� x�� ������ ��ä���� ���������� �����Ѵ�.
		//������ ��ä�� ��ä���� �ٸ� x���� ���� �� �ִ�.
		Aa a1 = new Aa();
		//a1.x = 10;
		System.out.println(a1.x);
		System.out.println(Aa.y);
		Aa a2 = new Aa();
		//a2.x = 20;
		System.out.println(a2.x);
		//���� ǥ�������� y���� ��������� ���ذ��ɼ��� ����.
		System.out.println(Aa.y);
		Aa a3 = new Aa();
		//a3.x = 30;
		System.out.println(a3.x);
		System.out.println(Aa.y);




	}
}