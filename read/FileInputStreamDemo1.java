package file.read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamDemo1 {
	public static void main(String[] args) throws IOException, FileNotFoundException {
		long start = System.currentTimeMillis();
		FileInputStream fis = new FileInputStream("sample.txt");
		
		int value = 0;
		
		while((value = fis.read()) != -1){
			System.out.print((char)value);
			
		}
		fis.close();
		
		long stop = System.currentTimeMillis();
		
		System.out.println("\n소요시간 : "+(stop-start)+"밀리초");
		/*
		int v1 = fis.read();
		int v2 = fis.read();
		int v3 = fis.read();
		
		
		
		System.out.println((char)v1);
		System.out.println((char)v2);
		System.out.println((char)v3);
		
		System.out.println(Integer.toString(v1));
		System.out.println(Integer.toString(v2));
		System.out.println(Integer.toString(v3));
		fis.close();//닫아줘야 fis에 노란줄이 안감.*/
	}
}
