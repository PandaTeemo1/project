public class MemberService{

	private Member member;


	private boolean auth;

	public MemberService(Member member) {
		this.member = member;
	}
	//���̵�� ����� ���޹޾Ƽ� member�� ����� ���̵� ��й�ȣ�� ���ؼ�
	//���̵�, ��й�ȣ�� ��ġ�ϸ� auth���� true�� �����ϱ�.
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

	//���̵�� ��й�ȣ�� ���޹޾Ƽ� �α��ΰ��� ���θ� ��ȯ�ϴ� �޼ҵ�

	/*public boolean login(String id, String password){
		boolean result = false;
		if(member.getId() == id){
			if(member.getPassword() == password){
				result = true;
			}	
		}


		return result;
	}
	//���̵� ���޹޾Ƽ� �α׾ƿ� ����� �����ϴ� �޼ҵ�
	public void logout(String id){
		if(member.getId() == id){
			System.out.println(id+"�� �α׾ƿ�");
		}
	}
}
*/