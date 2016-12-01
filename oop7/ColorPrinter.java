public class ColorPrinter extends Printer{
	int dpi;
	

	//public void printColor(String text){	
	public void print(String text){
		System.out.println("["+text+"]컬러로 인쇄합니다.");
	}
	//ColorPrint가 보유한 고유기능
	public void chargeInk(){
		System.out.println("잉크를 충전합니다");
	}
}