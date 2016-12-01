public class PhotoPrinter extends Printer{
	int size;
	//public void printPhoto(String data){
	public void print(String data){
		System.out.println("["+data+"]를 사진인쇄합니다.");
	}
	public void edit(){
		System.out.println("사진을 편집합니다");
	}
}