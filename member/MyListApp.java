package member;

import java.util.Iterator;

public class MyListApp {
	public static void main(String[] args) {
		MyList list = new MyList();
		
		Iterator<String> it = list.Iterator();
		
		while(it.hasNext()){
			String r = it.next();
			System.out.println(r);
		}
	}
}
