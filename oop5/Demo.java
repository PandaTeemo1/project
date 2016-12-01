package kr.co.jhta;

import kr.co.l2.*;
import kr.co.l2.sub.*;

public class Demo {
	public static void main(String[] args){
		System.out.println("패키지 데모 어플리케이션");

		Person p = new Person();
		p.setName("홍길동");
		System.out.println(p);
		System.out.println(p.getName());

		Employee e = new Employee();
		System.out.println(e);

		Family f = new Family();
		System.out.println(f);
	}
}