public class Quizz3{
	public static void main(String[] args){
		String text = "The overall effect is exactly as if the argument were converted to a string by the method String.valueOf(long), and the characters of that string were then appended to this character sequence.";
		String str1 = text.toLowerCase();
		int[] arr = new int[26];
		
		for(int i=0; i<str1.length(); i++){
			int a = str1.charAt(i)-97;
			if(a>=0){
				arr[a]++;
			}
		}
		for(int i=0; i<arr.length; i++){
			System.out.println((char)(i+97)+ " : " + arr[i]);
		}
		//System.out.println(java.util.Arrays.toString(arr));
	}
}