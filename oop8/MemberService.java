public class MemberService{

	private Member member;


	private boolean auth;

	public MemberService(Member member) {
		this.member = member;
	}
	//아이디와 비번을 전달받아서 member에 저장된 아이디 비밀번호와 비교해서
	//아이디, 비밀번호가 일치하면 auth값을 true로 변경하기.
	public boolean isAuth(){
		return auth;
	}
	
	public void login(String id, String password){
		if(member.getId().equals(id) && member.getPassword().equals(password)){
			auth = true;
		}
	}
	public void logout(){
		if(auth) {
			auth = false;
		}

	}
}

	//아이디와 비밀번호를 전달받아서 로그인가능 여부를 반환하는 메소드

	/*public boolean login(String id, String password){
		boolean result = false;
		if(member.getId() == id){
			if(member.getPassword() == password){
				result = true;
			}	
		}


		return result;
	}
	//아이디를 전달받아서 로그아웃 기능을 수행하는 메소드
	public void logout(String id){
		if(member.getId() == id){
			System.out.println(id+"님 로그아웃");
		}
	}
}
*/