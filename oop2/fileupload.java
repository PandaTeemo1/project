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
		System.out.println("���� ���ε� ������...");
		System.out.println("�ִ� ���ϻ�����: "+maxFileSize);
		System.out.println("�ִ� ���ϰ���: "+maxFileAmount);
	}
}