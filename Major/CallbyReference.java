package Major;

public class CallbyReference {
	
	public static void swap(Number s){
		System.out.println("Before : "+s.a +" " +s.b);
		int temp =s.a;
		s.a = s.b;
		s.b = temp;
		
		System.out.println("after : "+s.a +" " +s.b);
	}
	public static void main(String[] args) {
		Number s = new Number();
		s.a = 10;
		s.b = 20;
		
		swap(s);
		
	}
	
	static class Number{
		int a;
		int b;
	}
}
