package file.Object;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class ObjectInputStreamDemo1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("account.sav");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		/*
		 * FileinputStream을 이용해서 읽어온 직렬화된 정보를
		 * readObject()는 객체로 복원한다.
		 */
		Account acc = (Account) ois.readObject();
		System.out.println(acc.getName());
		System.out.println(acc.getAccNumber());
		System.out.println(acc.getBalance());
		
	}
}
