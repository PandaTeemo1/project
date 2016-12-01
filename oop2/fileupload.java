public class fileupload{
	long maxFileSize;
	int maxFileAmount;


	public fileupload(){
		maxFileSize = 1024 * 1024 * 10; //10M
		maxFileAmount = 10;
	}
	public fileupload(long size){
		maxFileSize = size;
		maxFileAmount = 10;
	}
	public fileupload(int amonut){
		maxFileSize = 1024 * 1024 * 10;
		maxFileAmount = amonut;
	}
	public fileupload(long size, int amount){
		maxFileSize = size;
		maxFileAmount = amount;
	}


	public void upload(){
		System.out.println("파일 업로드 실행중...");
		System.out.println("최대 파일사이즈: "+maxFileSize);
		System.out.println("최대 파일개수: "+maxFileAmount);
	}
}