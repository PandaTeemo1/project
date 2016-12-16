package anoymous;

public class Canvas {
	public static void main(String[] args){
		Pen yellow = new Pen(){
			public void draw(){
				System.out.println("노랑");
			}
		};
		Pen red = new Pen(){
			public void draw(){
				System.out.println("빨강 빨강 빨강");
			}
		};
		yellow.draw();
		red.draw();
		
	}
}
