public class ColorPrinter extends Printer{
	int dpi;
	

	//public void printColor(String text){	
	public void print(String text){
		System.out.println("["+text+"]�÷��� �μ��մϴ�.");
	}
	//ColorPrint�� ������ �������
	public void chargeInk(){
		System.out.println("��ũ�� �����մϴ�");
	}
}