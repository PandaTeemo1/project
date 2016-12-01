public class SwitchDemo1{
	public static void main(String[] args){
		
		String grade = "Silver";
		switch(grade){
			case "Gold":
				System.out.println("°ñµåµî±Þ °í°´´Ô È¯¿µÇÕ´Ï´Ù");
				break;
			case "Silver":
				System.out.println("½Ç¹öµî±Þ °í°´´Ô È¯¿µÇÕ´Ï´Ù");
				break;
			case "Bronze":
				System.out.println("ºê·ÐÁîµî±Þ °í°´´Ô È¯¿µÇÕ´Ï´Ù");
				break;
			default:
				System.out.println("°í°´´Ô È¯¿µÇÕ´Ï´Ù");
				
			}
	}
}