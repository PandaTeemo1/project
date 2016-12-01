public abstract class DBAccess{
	public void connet(){
		System.out.println("db와 연결합니다");
	}
	// 추상화
	public abstract void createRepository();
	public void disconnect(){
		System.out.println("db와 연결을 해지합니다");
	}
}