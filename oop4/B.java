public class B{
	int x;
	static int y;

	public void m1(){
		System.out.println(x);
		System.out.println(y);
	}
	//static �޼ҵ忡���� non-static ������ ����Ҽ� ����.
	//this�� ����� �� ����.
	public static void m2(){
		//System.out.println(x);//������ ����
		System.out.println(y);
	}
	public void m3(){
		m1();
		m2();
	}
	public static void m4() {
		//m1();//r��ä �����ؾ����� �����ִ� �޼ҵ�
		m2();
	}
}