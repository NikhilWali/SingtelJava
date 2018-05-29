package questionE;

public class SolutionA2 {

	public static void main(String[] args) {
		
		Bird1 duck = new Duck("duck");
		Bird1 chicken = new Chicken("chicken");
		
		System.out.println(duck.speak());
		System.out.println(duck.move());
		System.out.println(chicken.speak());
		System.out.println(chicken.fly("YES"));
		
	}

}
