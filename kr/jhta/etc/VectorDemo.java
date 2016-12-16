package kr.jhta.etc;

import java.util.Vector;

public class VectorDemo {
	public static void main(String[] args) {
		Vector<String> names = new Vector();
		
		names.add("홍길동");
		names.add("김유신");
		names.add("강감찬");
		
		for(String na : names){
			System.out.println(na);
		}
	}
}
