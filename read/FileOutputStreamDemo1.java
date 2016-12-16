package file.read;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamDemo1 {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		
		//FileOutputStream은 파일이 존재하지 않아도 상관없다.
		//파일이 존재하지 않으며 ㄴ파일을 새로 생성해서 내용을 기록한다.
		FileOutputStream fos = new FileOutputStream("sample2.txt");
		
		String text = "파일이 존재하지 않으면 파일을 새로 생성해서 내용을 기록한다.";
		byte[] bytes=text.getBytes();
		fos.write(bytes);
		fos.close();
}
}
