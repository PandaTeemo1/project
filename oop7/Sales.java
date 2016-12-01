public class Sales extends Employee{
	int result;
	int goal;

	//개발에 맞게 print() 메소드 재정의하기.
	public void print(){
		System.out.println("사원번호: "+no);
		System.out.println("사원이름: "+name);
		System.out.println("목표액: "+goal);
		System.out.println("실적액: "+result);
		System.out.println("달성율: "+(double)result/goal);
		System.out.println("");
	}
	
	public void drawGraph(){
		System.out.print("목표액 : ");

		for(int i=0; i<goal; i++){
		
			System.out.print("=");
		
		}
		System.out.println("");
		System.out.print("실  적 : ");
		for(int i=0; i<result; i++){
			System.out.print("=");
		}
		System.out.println();
	}

		
}