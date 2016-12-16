package file.data;

import java.io.DataInputStream;
import java.io.FileInputStream;

public class DataInputStreamDemo1 {
	public static void main(String[] args) throws Exception {
		FileInputStream fis = new FileInputStream("score2.txt");
		DataInputStream dis = new DataInputStream(fis);
		
		//중간에 빼먹으면 안되고 기록했던 것이랑 독같은 순서로 읽어야됨.
		String name = dis.readUTF();
		int score = dis.readInt();
		int score1 = dis.readInt();
		int score2 = dis.readInt();
		
		System.out.println(name + " " + score + " " + score1 + " " + score2 );
		
		dis.close();
	}
}
