public class PhoneApp2{
	public static void main(String[] args){
		SmartPhone p1 = new SmartPhone();
		PeaturePhone p2 = new PeaturePhone();
		//p1 ���������� smartphone�� �����ϰ� �ֱ� ������
		//peaturephone��ä���� �ʵ�� �Ӽ��� ���ٰ����ϰ�,
		//phone ��ä�� �ʵ�� �Ӽ��� ���ٰ����ϴ�.
		p1.ip = "255.255.255.0";			//SmartPhone�� ���ǵ� �ʵ�
		p1.web("http://www.naver.com");		//SmartPhone�� ���ǵ� �޼ҵ�
		p1.telNumber = "011-123-1234";		//Phone�� ���ǵ� �ʵ�
		p1.call("017-444-2222");			//Phone�� ���ǵ� �޼ҵ�
		


		//SmartPhone �� PeaturePhone�� Phone Ÿ���� ���������� ���.
		//��Ӱ��迡 �ִ� Ŭ���� �� ��� �θ�Ÿ���� ���������� �ڽ�Ŭ���� Ÿ���� ��ü�� ������ �� �ִ�.
		Phone p3 = new SmartPhone();
		Phone p4 = new PeaturePhone();


		//p3.web("www.daum.net"); �����Ͽ���
		p3.telNumber = "018-234-2123";
		p3.call("334-3434");
		//System.out.println(p2);
		//System.out.println(p3);
	}
}