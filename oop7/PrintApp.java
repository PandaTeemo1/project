public class PrintApp{
	public static void main(String[] args){
		//��� �μ�
		Printer p1 = new Printer();
		p1.fead();
		p1.print("�̹��� �ݿ��� ��Ÿ��ȸ...");
		//�÷� �μ�
		ColorPrinter p2 = new ColorPrinter();
		p2.print("�̹��ִ� �ڽ��� �����ϴ�...");
		//���� �μ�
		PhotoPrinter p3 = new PhotoPrinter();
		p3.print("���� �̹��ִ� �ڽ��� �����ϴ�...");
	}
}