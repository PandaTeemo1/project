public class fileuploadApp{
	public static void main(String[] args){
		fileupload f1 = new fileupload();
		f1.upload();

		fileupload f2 = new fileupload(100);
		f2.upload();

		fileupload f3 = new fileupload(1024*1024*500L);
		f3.upload();

		fileupload f4 = new fileupload();
		f4.upload();
	}
}