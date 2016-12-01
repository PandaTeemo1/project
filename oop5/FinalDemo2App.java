public class FinalDemo2App{
	public static void main(String[] args){
		/*
			FinalDemo2객체는 객채마다 x값과 y값이 각각 다른 값을 가진 객체를
			생성할 수 있다.
			하지만, final로 지전된 x값은 변경할 수 없다.
		*/
		FinalDemo2 d1 = new FinalDemo2(10, 1);
		d1.setY(0);
		System.out.println();
		FinalDemo2 d2 = new FinalDemo2(20, 3);
		d2.setY(5);
		System.out.println();
	}
}