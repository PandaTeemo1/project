package member;

import java.util.Iterator;

public class MyList {
	private String[] name = {"홍길동", "김유신", "강감찬", "이순신"};
	
	public Iterator<String> Iterator(){
		return new MyListIterator();
	}
	
	private class MyListIterator implements Iterator<String>{
		private int index =0;
		public boolean hasNext(){
			if(index < 4){
				return true;
			}
			return false;
		}
		public String next(){
			String name1 = name[index];
			index++;
			return name1;
		}
	}
	MyListIterator itr = new MyListIterator();
}
