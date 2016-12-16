package file.read;

import java.io.FileInputStream;
import java.util.ArrayList;

public class ContactApp {
	public static void main(String[] args) throws Exception {
		ArrayList<Contact> ac = new ArrayList<>();
		Contact ct = new Contact();
		//1.contact내용을 읽어서 화면에 표시하기
		FileInputStream fis = new FileInputStream("contacts.txt");
		int count = 0;
		byte[] buf = new byte[1024];
		StringBuilder sb = new StringBuilder();
		while ((count=fis.read(buf))!=-1){
			String str = new String(buf, 0, count);
			sb.append(str);
		
		} 
		fis.close();
		
		//2.contacts.txt의 내용을 한 사람씩 구분해서 화면에 표시하기
		String data =sb.toString();
		String[] split = data.split(":");
		for(String s : split){
			ac.add(new Contact(s.split(",")[0],s.split(",")[1],s.split(",")[2]));
		}
		for(Contact c : ac){
			System.out.println(c.getName()+c.getTel()+c.getEmail());
		}
			//3.ArrayList<Contact>를 생성해서 모든 사람의 정보를 저장하기
	}
}
