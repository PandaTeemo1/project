package kr.jhta.iterator;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo1 {
	public static void main(String[] args) {
		HashSet<String> name = new HashSet<>();
		name.add("홍길동");
		name.add("정승환");
		name.add("김유신");
		name.add("강감찬");
		name.add("이순신");
		name.add("유관순");
		name.add("김두환");
		
		Iterator<String> it = name.iterator();
		while(it.hasNext()){
			String na = it.next();
			System.out.println(na);
			
		}

	}
}
