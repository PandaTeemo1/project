public class MemberServiceApp{
	public static void main(String[] args){
		/*
			�̸�		ȫ�浿
			���̵�		hong
			��й�ȣ	1234
			����		30
			������ ���� member ��ü�� ��� �ִ�memberService��ü �����ϱ�
		*/
		Member m1 = new Member();
		m1.setName("��浿");
		m1.setId("gildong");
		m1.setPassword("1234");
		m1.setAge(40);
		
		MemberService ms = new MemberService(m1);
		ms.login("gildong","1234");
		System.out.println(ms.isAuth());
		ms.logout();
		System.out.println(ms.isAuth());
	}
}