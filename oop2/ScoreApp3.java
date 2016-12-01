public class ScoreApp3{

	public static void main(String[] args){
		Score s = new Score("±Ë¿ØΩ≈", 30, 40, 50);

		int total = s.total();
		double avg = s.avg();

		System.out.println("¿Ã∏ß : "+s.name);
		System.out.println("√—¡° : "+total);
		System.out.println("∆Ú±’ : "+avg);
	}
}