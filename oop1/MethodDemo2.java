public class MethodDemo2{

	public static void a() {

	}

	public static void displayGugudan(int dan){
		for(int i=1; i<=9; i++){
		
			int result = dan * i;
			System.out.printf("%d * %d = %d\n", dan, i, result);
		}
	
	}

	public static void main(String[] args){
		displayGugudan(8);

		displayGugudan(19);
	
	}

}