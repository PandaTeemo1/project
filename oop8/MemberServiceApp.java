public class MemberServiceApp{
	public static void main(String[] args){
		/*
			이름		홍길동
			아이디		hong
			비밀번호	1234
			나이		30
			정보를 가진 member 객체를 담고 있는memberService객체 생성하기
		*/
		Member m1 = new Member();
		m1.setName("고길동");
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