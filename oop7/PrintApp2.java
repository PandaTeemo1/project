public class PrintApp2{
	public static void main(String[] args){
		Printer p1 = new Printer();
		Printer p2 = new ColorPrinter();
		Printer p3 = new PhotoPrinter();
/*
		�̷��� ���๮�� ��� print(String text)�� ȣ���Ѵ�.
		������ �������� ���� �ٸ��� �ݿ��Ѵ�.

		print(String text)�� ����������.
		������ ������ ��ü�� Printer�� print(String text) �޼ҵ带 
		�������� �޼ҵ尡 �����ϸ�, Printer�� print(Stirng text) �޼ҵ� ���
		�����ǵ� �� �޼ҵ尡 ����ȴ�.

		���� print(String text)��� �ϰ��� �̸�(����)����
		(������ �� ��ü�� �������� �ʰ��ִ���.,...)
		���� ������ ��ü�� �����ǵ� ����� �����ų �� �ִ�.
*/
		p1.print("��������");
		p2.print("���ú�������");
		p3.print("��������");
	}
}