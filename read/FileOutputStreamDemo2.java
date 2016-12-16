package file.read;

import java.io.FileOutputStream;
import java.util.ArrayList;

public class FileOutputStreamDemo2 {
	public static void main(String[] args) throws Exception {
		ArrayList<String> names = new ArrayList<>();
		names.add("ㅎㄱㄷ");
		names.add("ㄱㅇㅅ");
		names.add("ㄱㄱㅊ");
		names.add("ㅇㅅㅅ");
		names.add("ㅇㄱㅅ");
		names.add("ㅅㅎ");

		//"names.txt"파일에 모든 이름을 기록하기.
		FileOutputStream fos = new FileOutputStream("names.txt");
		for(String n : names){
			n = n + System.lineSeparator();
			byte[] bytes=n.getBytes();
			fos.write(bytes);
			
		}
		fos.close();
	}
}

