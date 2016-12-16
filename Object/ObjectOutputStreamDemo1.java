package file.Object;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class ObjectOutputStreamDemo1 {
	public static void main(String[] args) throws Exception {
		Account account = new Account();
		account.setName("홍길동");
		account.setAccNumber("111-222-333333");
		account.setBalance(10000000);
		
		Rate rate = new Rate();
		rate.setMonth(0.03);
		rate.setYear(0.3);
		account.setRate(rate);
		
		FileOutputStream fos = new FileOutputStream("account.sav");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		/*
		 * Account 객체로 직렬화해서 FileoutputStream에 
		 */
		
		oos.writeObject(account);
		
		oos.close();
	}
}
