public class MethodDemo1{
	
	// �޼ҵ� ����(����)
	public static void a() {
		System.out.print("����ڰ� ������ a �޼ҵ��Դϴ�.");
	}

	//�Ű������� ������ �ִ� �޼ҵ� ����
	//�Ű������� �޼ҵ� ���࿡ �ʿ��� ���� ���޹޾Ƽ� ��´�.
	public static void b(int x) {
		System.out.println("b�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("b�޼ҵ� ����� ���޹��� �� : "+x);

	}
	public static void c(String str) {
		System.out.println("c�޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("c�޼ҵ� ����� ���޹��� �� : "+str);
	}

	public static void d(int x, int y){
		System.out.println("d �޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("d �޼ҵ尡 ���޹��� �� : "+x+","+y);
	}

	public static void e(String name, String email, int age){
		System.out.println("e �޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("e �޼ҵ尡 ���޹����� : "+name);
		System.out.println("e �޼ҵ尡 ���޹����� : "+email);
		System.out.println("e �޼ҵ尡 ���޹����� : "+age);

	}


	public static void main(String[] args){
			
		//�޼ҵ带 ȣ��(����)
		a();
		//�Ű������� ���� �޼ҵ� ȣ��
		b(100);
		int k = 20;
		b(k);
		//b()������ ����, b�޼ҵ带 �����ϱ� ���ؼ��� �ݵ�� ������ �ϳ��� ���޵Ǿ�� �Ѵ�.
		
		c("ȫ�浿");
		c("�ȳ�"+"���� ȫ�浿�Դϴ�");
		d(10, 20);
		e("ȫ��ȯ", "yourfunny@naver.com", 23);

	}
}