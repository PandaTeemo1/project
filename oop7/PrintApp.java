public class PrintApp{
	public static void main(String[] args){
		//흑백 인쇄
		Printer p1 = new Printer();
		p1.fead();
		p1.print("이번주 금요일 영타대회...");
		//컬러 인쇄
		ColorPrinter p2 = new ColorPrinter();
		p2.print("이번주는 자습이 없습니다...");
		//사진 인쇄
		PhotoPrinter p3 = new PhotoPrinter();
		p3.print("정말 이번주는 자습이 없습니다...");
	}
}