public class Quizz2{
	public static void main(String[] args){
	
		int a = 4;
		int b = 5;
		for(int i=1; i<=10; i++){
			for(int j=1; j<=10; j++){
				if((a*i)+(b*j) == 60){
					System.out.printf("(%d, %d)\n", i, j);
				}
			}
		}
	}
}